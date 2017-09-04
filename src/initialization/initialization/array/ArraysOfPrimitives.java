package initialization.initialization.array; 
 // : initialization/ArraysOfPrimitives.java
import static net.mindview.util.Print.print;

/**
 * 数组初始化
 * 数组:只是相同类型的,用一个标识符名称封装到一起的一个对象序列或基本类型数据序列
 * 定义:
 * int[] a1;
 * int a1[];(符合C和C++程序员的习惯)
 * 创建并初始化
 * int[] a1 = {1,2,3,4,5};
 * 数组的固定成员: length
 * @title ArraysOfPrimitives
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午5:06:05
 * @since v1.0.1
 */
public class ArraysOfPrimitives {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2;
        a2 = a1;// 复制了一个引用
        for (int i = 0; i < a2.length; i++)
            a2[i] = a2[i] + 1;
        for (int i = 0; i < a1.length; i++)
            print("a1[" + i + "] = " + a1[i]);
    }
} /*
   * Output:
   * a1[0] = 2
   * a1[1] = 3
   * a1[2] = 4
   * a1[3] = 5
   * a1[4] = 6
   */// :~
