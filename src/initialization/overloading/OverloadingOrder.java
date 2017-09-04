package initialization.overloading; 
 // : initialization/OverloadingOrder.java
// Overloading based on the order of the arguments.
import static net.mindview.util.Print.print;

/**
 * 区分方法重载
 * @title OverloadingOrder
 * @author liujiaze@zbj.com
 * @date 2017年7月28日 下午5:39:25
 * @since v1.0.1
 */
public class OverloadingOrder {
    static void f(String s, int i) {
        print("String: " + s + ", int: " + i);
    }

    static void f(int i, String s) {
        print("int: " + i + ", String: " + s);
    }

    public static void main(String[] args) {
        f("String first", 11);
        f(99, "Int first");
    }
} /*
   * Output:
   * String: String first, int: 11
   * int: 99, String: Int first
   */// :~
