package initialization.varargs; 
 // : initialization/VarargType.java
/**
 * 可变参数:如果列表中没有任何元素,那么转变成的数据的尺寸为0
 * @title VarargType
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午5:49:27
 * @since v1.0.1
 */
public class VarargType {
    static void f(Character... args) {
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    static void g(int... args) {
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());
    }
} /*
   * Output:
   * class [Ljava.lang.Character; length 1
   * class [Ljava.lang.Character; length 0
   * class [I length 1 //[ 代表数组,I 代表基本类型int
   * class [I length 0
   * int[]: class [I
   */// :~
