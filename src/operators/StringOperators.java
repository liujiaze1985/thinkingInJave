package operators;

// : operators/StringOperators.java
import static net.mindview.util.Print.print;

/**
 * @title StringOperators 字符串操作符
 * @author liujiaze@zbj.com
 * @date 2017年7月27日 下午6:11:43
 * @since v1.0.1
 */
public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        print(s + x + y + z);
        print(x + " " + s); // Converts x to a String
        s += "(summed) = "; // Concatenation operator
        print(s + (x + y + z));
        print("" + x); // Shorthand for Integer.toString()
    }
} /*
   * Output:
   * x, y, z 012
   * 0 x, y, z
   * x, y, z (summed) = 3
   * 0
   */// :~
