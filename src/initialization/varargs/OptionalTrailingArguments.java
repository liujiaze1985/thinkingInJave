package initialization.varargs;

// : initialization/OptionalTrailingArguments.java
/**
 * 可选尾随参数
 * @title OptionalTrailingArguments
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午5:47:21
 * @since v1.0.1
 */
public class OptionalTrailingArguments {
    static void f(int required, String... trailing) {
        System.out.print("required: " + required + " ");
        for (String s : trailing)
            System.out.print(s + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "one");
        f(2, "two", "three");
        f(0);// 可变参数可以不传
    }
} /*
   * Output:
   * required: 1 one
   * required: 2 two three
   * required: 0
   */// :~
