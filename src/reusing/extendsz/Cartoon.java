package reusing.extendsz; 
 // : reusing/Cartoon.java
// Constructor calls during inheritance.
import static net.mindview.util.Print.print;

class Art {
    Art() {
        print("Art constructor");
    }
}


class Drawing extends Art {
    Drawing() {
        print("Drawing constructor");
    }
}


/**
 * java会自动在导出类的构造器中插入对基类构造器的调用
 * 构建过程从基类"向外"扩散
 * @title Cartoon
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 上午11:25:36
 * @since v1.0.1
 */
public class Cartoon extends Drawing {
    public Cartoon() {
        print("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
} /*
   * Output:
   * Art constructor
   * Drawing constructor
   * Cartoon constructor
   */// :~
