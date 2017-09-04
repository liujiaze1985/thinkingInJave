package reusing.finalz;

import static net.mindview.util.Print.print;

// : reusing/FinalData.java
// The effect of final on fields.
import java.util.Random;

class Value {
    int i; // Package access

    public Value(int i) {
        this.i = i;
    }
}


/**
 * 对基本类型,使数值恒定不变;而对于对象引用,使引用恒定不变
 * @title FinalData
 * @author liujiaze@zbj.com
 * @date 2017年8月9日 上午11:26:00
 * @since v1.0.1
 */
public class FinalData {
    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    // Can be compile-time constants:
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99; // 即是static又是final的域(编译期常量)用大写表示,并使用下划线分隔各单词
    // Typical public constant:
    public static final int VALUE_THREE = 39; // public 可以被用于包外, static 强调只有一份 ,final 说明是一个常量
    // Cannot be compile-time constants:
    // 不能因为某数据是final的就认为在编译时可以知道它的值,下边两个域在运行时使用随机生成的数值来初始化
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);// 无法将v2再次指向另一个新的对象,但是对象的值是可变的
    private static final Value VAL_3 = new Value(33);
    // Arrays:
    private final int[] a = {1, 2, 3, 4, 5, 6};

    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        // ! fd1.valueOne++; // Error: can't change value
        fd1.v2.i++; // Object isn't constant!
        fd1.v1 = new Value(9); // OK -- not final
        for (int i = 0; i < fd1.a.length; i++)
            fd1.a[i]++; // Object isn't constant!
        // ! fd1.v2 = new Value(0); // Error: Can't
        // ! fd1.VAL_3 = new Value(1); // change reference
        // ! fd1.a = new int[3];
        print(fd1);
        print("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        print(fd1);
        print(fd2);
    }
} /*
   * Output:
   * fd1: i4 = 15, INT_5 = 18
   * Creating new FinalData
   * fd1: i4 = 15, INT_5 = 18
   * fd2: i4 = 13, INT_5 = 18
   */// :~
