package reusing; 
 // : reusing/Hide.java
// Overloading a base-class method name in a derived
// class does not hide the base-class versions.
import static net.mindview.util.Print.print;

class Homer {
    char doh(char c) {
        print("doh(char)");
        return 'd';
    }

    float doh(float f) {
        print("doh(float)");
        return 1.0f;
    }

}


class Milhouse {
}


/**
 * @title Bart
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 下午4:12:28
 * @since v1.0.1
 */
class Bart extends Homer {
    void doh(Milhouse m) {
        print("doh(Milhouse)");
    }
}


/**
 * 名称屏蔽
 * Bart中Homer的所有重载方法都是可用的
 * @title Hide
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 下午2:35:34
 * @since v1.0.1
 */
public class Hide {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
} /*
   * Output:
   * doh(float)
   * doh(char)
   * doh(float)
   * doh(Milhouse)
   */// :~
