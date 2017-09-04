package initialization.varargs;
// : initialization/OverloadingVarargs2.java
// {CompileTimeError} (Won't compile)
/**
 * 在某个方法中增加一个非可变参数来解决OverloadingVarargs中不传参数的问题
 * @title OverloadingVarargs2
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午5:56:36
 * @since v1.0.1
 */
public class OverloadingVarargs2 {
    static void f(String i, Character... args) {
        System.out.println("first");
    }

    static void f(Character... args) {
        System.out.print("second");
    }

    public static void main(String[] args) {
        f("111", 'a', 'a');
        f('a', 'b');
    }
} /// :~
