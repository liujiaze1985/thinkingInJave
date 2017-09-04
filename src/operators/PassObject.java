package operators;

// : operators/PassObject.java
// Passing objects to methods may not be
// what you're used to.
import static net.mindview.util.Print.print;

class Letter {
    char c;
}


/**
 * @title PassObject 别名
 * @author liujiaze@zbj.com
 * @date 2017年7月27日 下午3:13:16
 * @since v1.0.1
 */
public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("1: x.c: " + x.c);
        f(x);
        print("2: x.c: " + x.c);
    }
} /*
   * Output:
   * 1: x.c: a
   * 2: x.c: z
   */// :~
