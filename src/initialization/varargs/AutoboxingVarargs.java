package initialization.varargs; 
 // : initialization/AutoboxingVarargs.java
/**
 * 可变参数的自动包装
 * @title AutoboxingVarargs
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午5:52:32
 * @since v1.0.1
 */
public class AutoboxingVarargs {
    public static void f(Integer... args) {
        for (Integer i : args)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        f(new Integer(1), new Integer(2));
        f(4, 5, 6, 7, 8, 9);
        f(10, new Integer(11), 12);
    }
} /*
   * Output:
   * 1 2
   * 4 5 6 7 8 9
   * 10 11 12
   */// :~
