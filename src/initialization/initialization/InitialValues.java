package initialization.initialization;

// : initialization/InitialValues.java
// Shows default initial values.
import static net.mindview.util.Print.print;

/**
 * 类的每个基本数据类型成员保证会有一个初值
 * @title InitialValues
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午3:02:37
 * @since v1.0.1
 */
public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference; // 定义一个对象引用时,不初始化,此引用就会获得一个特殊值null

    void printInitialValues() {
        print("Data type      Initial value");
        print("boolean        " + t);
        print("char           [" + c + "]");
        print("byte           " + b);
        print("short          " + s);
        print("int            " + i);
        print("long           " + l);
        print("float          " + f);
        print("double         " + d);
        print("reference      " + reference);
    }

    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValues();
        /*
         * You could also say:
         * new InitialValues().printInitialValues();
         */
    }
} /*
   * Output:
   * Data type Initial value
   * boolean false
   * char [ ]
   * byte 0
   * short 0
   * int 0
   * long 0
   * float 0.0
   * double 0.0
   * reference null
   */// :~
