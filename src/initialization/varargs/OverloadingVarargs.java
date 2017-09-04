package initialization.varargs;
// : initialization/OverloadingVarargs.java
/**
 * 可变参数使用重载变得复杂
 * @title OverloadingVarargs
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午5:55:33
 * @since v1.0.1
 */
public class OverloadingVarargs {
    static void f(Character... args) {
        System.out.print("first");
        for (Character c : args)
            System.out.print(" " + c);
        System.out.println();
    }

    static void f(Integer... args) {
        System.out.print("second");
        for (Integer i : args)
            System.out.print(" " + i);
        System.out.println();
    }

    static void f(Long... args) {
        System.out.println("third");
    }

    public static void main(String[] args) {
        f('a', 'b', 'c');
        f(1);
        f(2, 1);
        f(0);
        f(0L);
        // ! f(); // Won't compile -- ambiguous 不使用参数调用f()时,编译器无法知道应该调用哪一个方法
    }
} /*
   * Output:
   * first a b c
   * second 1
   * second 2 1
   * second 0
   * third
   */// :~
