package operators;

// : operators/CastingNumbers.java
// What happens when you cast a float
// or double to an integral value?
import static net.mindview.util.Print.print;

/**
 * @title CastingNumbers 截尾和舍入 截尾 p55
 * @author liujiaze@zbj.com
 * @date 2017年7月27日 下午6:20:00
 * @since v1.0.1
 */
public class CastingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        print("(int)above: " + (int) above);
        print("(int)below: " + (int) below);
        print("(int)fabove: " + (int) fabove);
        print("(int)fbelow: " + (int) fbelow);
    }
} /*
   * Output:
   * (int)above: 0
   * (int)below: 0
   * (int)fabove: 0
   * (int)fbelow: 0
   */// :~
