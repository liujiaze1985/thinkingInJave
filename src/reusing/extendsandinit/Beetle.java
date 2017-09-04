package reusing.extendsandinit;

// : reusing/Beetle.java
// The full process of initialization.
import static net.mindview.util.Print.print;

class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        print(s);
        return 47;
    }
}


/**
 * 继承与初始化
 * 执行顺序:
 * 1.Beetle.main()
 * 2.加载基类
 * 3.导出类
 * 4.基本类型及对象引用 赋值
 * 5.基类的构造器被调用(自动,或用super来指定调用)
 * @title Beetle
 * @author liujiaze@zbj.com
 * @date 2017年8月11日 下午5:23:31
 * @since v1.0.1
 */
public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        print("Beetle constructor");
        Beetle b = new Beetle();
    }
} /*
   * Output:
   * static Insect.x1 initialized
   * static Beetle.x2 initialized
   * Beetle constructor
   * i = 9, j = 0
   * Beetle.k initialized
   * k = 47
   * j = 39
   */// :~
