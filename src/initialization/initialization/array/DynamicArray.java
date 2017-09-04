package initialization.initialization.array;

// : initialization/DynamicArray.java
// Array initialization.
/**
 * 创建String对象数组,将其传递给另一个main()方法,以提供参数,用来替换传递给该main()方法的命令行参数
 * @title DynamicArray
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午5:20:57
 * @since v1.0.1
 */
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[] {"fiddle", "de", "dum"});
    }
}


class Other {
    public static void main(String[] args) {
        for (String s : args)
            System.out.print(s + " ");
    }
} /*
   * Output:
   * fiddle de dum
   */// :~
