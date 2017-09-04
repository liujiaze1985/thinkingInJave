package initialization.varargs;
// : initialization/VarArgs.java
// Using array syntax to create variable argument lists.

class A {
}


/**
 * 可变参数列表
 * @title VarArgs
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午5:41:21
 * @since v1.0.1
 */
public class VarArgs {
    static void printArray(Object[] args) {
        for (Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[] {new Integer(47), new Float(3.14), new Double(11.11)});
        printArray(new Object[] {"one", "two", "three"});
        printArray(new Object[] {new A(), new A(), new A()});
    }
} /*
   * Output: (Sample)
   * 47 3.14 11.11
   * one two three
   * A@1a46e30 A@3e25a5 A@19821f //类名加对象地址
   */// :~
