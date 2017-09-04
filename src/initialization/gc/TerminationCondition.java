package initialization.gc; 
 // : initialization/TerminationCondition.java
// Using finalize() to detect an object that
// hasn't been properly cleaned up.

class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    protected void finalize() {
        if (checkedOut)
            System.out.println("Error: checked out");
        // Normally, you'll also do this:
        // super.finalize(); // Call the base-class version
    }
}


/**
 * 本例的终结条件是:所有的Book对象在被当作垃圾回收前都应该被签入(check in),但在main()方法中,有一本未被签入,要是没有finalize()来难终结条件,将很难发生这种缺陷.
 * @title TerminationCondition
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 上午11:55:33
 * @since v1.0.1
 */
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Proper cleanup:
        novel.checkIn();
        // Drop the reference, forget to clean up:
        new Book(true);
        // Force garbage collection & finalization:
        System.gc();
    }
} /*
   * Output:
   * Error: checked out
   */// :~
/*
 * System.gc(); 用于强制进行终结动作,即使不这么做,通过重复执行程序(假设程序将分配大量的存储空间而导致垃圾回收动作的执行),最终也能找出错误的Book对象
 * 修改基类版本的finalize()也要做某些重要的事情,因此要使用super来调用它
 */
