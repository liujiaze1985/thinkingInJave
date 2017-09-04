package initialization.varargs;

// : initialization/OverloadingVarargs3.java
/**
 * 给两个方法都加入非可变参数,解决OverloadingVarargs2中的编译时错误
 * 建议: 应该只在重载方法的一个版本上使用可变参数列表,或者压根不使用它
 * @title OverloadingVarargs3
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午5:53:04
 * @since v1.0.1
 */
public class OverloadingVarargs3 {
    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f(char c, Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1, 'a');
        f('a', 'b');
    }
} /*
   * Output:
   * first
   * second
   */// :~
