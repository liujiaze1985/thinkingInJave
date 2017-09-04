package initialization.thisz;

// : initialization/Leaf.java
// Simple use of the "this" keyword.
/**
 * @title Leaf
 * @author liujiaze@zbj.com
 * @date 2017年7月28日 下午6:16:18
 * @since v1.0.1
 */
public class Leaf {
    int i = 0;

    Leaf increment() {
        i++;
        return this; // 返回对当前对象的引用
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
} /*
   * Output:
   * i = 3
   */// :~
