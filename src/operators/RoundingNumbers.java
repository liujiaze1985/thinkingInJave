package operators;

// : operators/RoundingNumbers.java
// Rounding floats and doubles.
import static net.mindview.util.Print.print;

/**
 * @title RoundingNumbers 截尾和舍入 舍入 p55
 * @author liujiaze@zbj.com
 * @date 2017年7月27日 下午6:20:44
 * @since v1.0.1
 */
public class RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        print("Math.round(above): " + Math.round(above));
        print("Math.round(below): " + Math.round(below));
        print("Math.round(fabove): " + Math.round(fabove));
        print("Math.round(fbelow): " + Math.round(fbelow));
    }
} /*
   * Output:
   * Math.round(above): 1
   * Math.round(below): 0
   * Math.round(fabove): 1
   * Math.round(fbelow): 0
   */// :~
