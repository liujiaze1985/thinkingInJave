package operators;

import static net.mindview.util.Print.print;

// : operators/MathOps.java
// Demonstrates the mathematical operators.
import java.util.Random;

/**
 * @title MathOps 算数操作符 p41
 * @author liujiaze@zbj.com
 * @date 2017年7月27日 下午3:13:49
 * @since v1.0.1
 */
public class MathOps {
    public static void main(String[] args) {
        // Create a seeded random number generator:
        Random rand = new Random(47);
        int i, j, k;
        // Choose value from 1 to 100:
        j = rand.nextInt(100) + 1;
        print("j : " + j);
        k = rand.nextInt(100) + 1;
        print("k : " + k);
        i = j + k;
        print("j + k : " + i);
        i = j - k;
        print("j - k : " + i);
        i = k / j;
        print("k / j : " + i);
        i = k * j;
        print("k * j : " + i);
        i = k % j;
        print("k % j : " + i);
        j %= k;
        print("j %= k : " + j);
        // Floating-point number tests:
        float u, v, w; // Applies to doubles, too
        v = rand.nextFloat();
        print("v : " + v);
        w = rand.nextFloat();
        print("w : " + w);
        u = v + w;
        print("v + w : " + u);
        u = v - w;
        print("v - w : " + u);
        u = v * w;
        print("v * w : " + u);
        u = v / w;
        print("v / w : " + u);
        // The following also works for char,
        // byte, short, int, long, and double:
        u += v;
        print("u += v : " + u);
        u -= v;
        print("u -= v : " + u);
        u *= v;
        print("u *= v : " + u);
        u /= v;
        print("u /= v : " + u);
    }
} /*
   * Output:
   * j : 59
   * k : 56
   * j + k : 115
   * j - k : 3
   * k / j : 0
   * k * j : 3304
   * k % j : 56
   * j %= k : 3
   * v : 0.5309454
   * w : 0.0534122
   * v + w : 0.5843576
   * v - w : 0.47753322
   * v * w : 0.028358962
   * v / w : 9.940527
   * u += v : 10.471473
   * u -= v : 9.940527
   * u *= v : 5.2778773
   * u /= v : 9.940527
   */// :~
/**
 * 传递给nextInt() 的参数设置了所产生的随机数的上限,其下限为0,但0是我们不想要的,所以以结果加了1
 */
