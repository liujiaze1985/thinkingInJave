package initialization.initialization.array; 
 import static net.mindview.util.Print.print;

// : initialization/ArrayClassObj.java
// Creating an array of nonprimitive objects.
import java.util.Arrays;
import java.util.Random;

/**
 * 非基本类型数组(引用数组)
 * @title ArrayClassObj
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午5:16:03
 * @since v1.0.1
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        print("length of a = " + a.length);
        for (int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(500); // Autoboxing 自动包装
        print(Arrays.toString(a));
    }
} /*
   * Output: (Sample)
   * length of a = 18
   * [55, 193, 361, 461, 429, 368, 200, 22, 207, 288, 128, 51, 89, 309, 278, 498, 361, 20]
   */// :~
