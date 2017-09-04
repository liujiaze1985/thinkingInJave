package reusing.composition; 
 // : reusing/Bath.java
// Constructor initialization with composition.
import static net.mindview.util.Print.print;

class Soap {
    private String s;

    Soap() {
        print("Soap()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}


/**
 * 编译器并不是简单地为每一个引用都创建默认对象
 * 初始化引用的位置:
 * 1.在定义对象的地方
 * 2.在类的构造器中
 * 3.在使用这些对象之前,这种方式称为惰性初始化
 * 4.使用实例初始化
 * @title Bath
 * @author liujiaze@zbj.com
 * @date 2017年8月7日 下午5:00:49
 * @since v1.0.1
 */
public class Bath {
    private String // Initializing at point of definition(在定义对象初始化):
    s1 = "Happy", s2 = "Happy", s3, s4;
    private Soap castille;
    private int i;
    private float toy;

    /**
     * 构造器初始化
     * @Description TODO
     */
    public Bath() {
        print("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }

    // Instance initialization( 实例初始化):
    {
        i = 47;
    }

    public String toString() {
        if (s4 == null) // Delayed initialization(使用对象之前初始化):
            s4 = "Joy";
        return "s1 = " + s1 + "\n" + "s2 = " + s2 + "\n" + "s3 = " + s3 + "\n" + "s4 = " + s4 + "\n" + "i = " + i + "\n"
                + "toy = " + toy + "\n" + "castille = " + castille;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        print(b);
    }
} /*
   * Output:
   * Inside Bath()
   * Soap()
   * s1 = Happy
   * s2 = Happy
   * s3 = Joy
   * s4 = Joy
   * i = 47
   * toy = 3.14
   * castille = Constructed
   */// :~
