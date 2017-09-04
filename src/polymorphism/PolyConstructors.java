package polymorphism; 
 // : polymorphism/PolyConstructors.java
// Constructors and polymorphism
// don't produce what you might expect.
import static net.mindview.util.Print.print;

class Glyph {
    void draw() {
        print("Glyph.draw()");
    }

    Glyph() {
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }
}


class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}


/**
 * 在构造器内部调用动态绑定方法,那就可能会调用某个方法,而这个方法所操纵的成员可能还未进行初始化
 * @title PolyConstructors
 * @author liujiaze@zbj.com
 * @date 2017年8月16日 下午6:09:56
 * @since v1.0.1
 */
public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
} /*
   * Output:
   * Glyph() before draw()
   * RoundGlyph.draw(), radius = 0
   * Glyph() after draw()
   * RoundGlyph.RoundGlyph(), radius = 5
   */// :~
