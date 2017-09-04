package initialization.initialization.array; 
 import static net.mindview.util.Print.print;

// : initialization/ArrayNew.java
// Creating arrays with new.
import java.util.Arrays;
import java.util.Random;

/**
 * 不确定数组里需要多少个元素
 * 尽量在定义的时候初始化数组 int[] a = new int[rand.nextInt(20)];
 * @title ArrayNew
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午5:13:04
 * @since v1.0.1
 */
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];// 不能用new创建单个的基本类型数据
        print("length of a = " + a.length);
        print(Arrays.toString(a));// 产生一维数组的可打印版本
    }
} /*
   * Output:
   * length of a = 18
   * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
   */// :~
