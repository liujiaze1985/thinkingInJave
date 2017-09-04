package initialization.initialization.array;

// : initialization/ArrayInit.java
// Array initialization.
import java.util.Arrays;

/**
 * 非基本类型数组(引用数组)
 * 使用花括号括起来的列表来初始化对象数组
 * 初始化列表的最后一个逗号可选
 * @title ArrayInit
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午5:18:05
 * @since v1.0.1
 */
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {new Integer(1), new Integer(2), 3, // Autoboxing
        };
        Integer[] b = new Integer[] {new Integer(1), new Integer(2), 3, // Autoboxing
        };// 推荐使用
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
} /*
   * Output:
   * [1, 2, 3]
   * [1, 2, 3]
   */// :~
