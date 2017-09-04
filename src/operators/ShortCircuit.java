package operators;

// : operators/ShortCircuit.java
// Demonstrates short-circuiting behavior
// with logical operators.
import static net.mindview.util.Print.print;

/**
 * @title ShortCircuit 短路 p46
 * @author liujiaze@zbj.com
 * @date 2017年7月27日 下午3:34:10
 * @since v1.0.1
 */
public class ShortCircuit {
    static boolean test1(int val) {
        print("test1(" + val + ")");
        print("result: " + (val < 1));
        return val < 1;
    }

    static boolean test2(int val) {
        print("test2(" + val + ")");
        print("result: " + (val < 2));
        return val < 2;
    }

    static boolean test3(int val) {
        print("test3(" + val + ")");
        print("result: " + (val < 3));
        return val < 3;
    }

    public static void main(String[] args) {
        boolean b = test1(0) && test2(2) && test3(2);
        print("expression is " + b);
    }
} /*
   * Output:
   * test1(0)
   * result: true
   * test2(2)
   * result: false
   * expression is false
   */// :~
