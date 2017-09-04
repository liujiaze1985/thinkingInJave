package operators;

// : operators/AutoInc.java
// Demonstrates the ++ and -- operators.
import static net.mindview.util.Print.print;

/**
 * @title AutoInc 自动递增/递减 p43
 * @author liujiaze@zbj.com
 * @date 2017年7月27日 下午3:17:10
 * @since v1.0.1
 */
public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        print("i : " + i);
        print("++i : " + ++i); // Pre-increment
        print("i++ : " + i++); // Post-increment
        print("i : " + i);
        print("--i : " + --i); // Pre-decrement
        print("i-- : " + i--); // Post-decrement
        print("i : " + i);
    }
} /*
   * Output:
   * i : 1
   * ++i : 2
   * i++ : 2
   * i : 3
   * --i : 2
   * i-- : 2
   * i : 1
   */// :~
