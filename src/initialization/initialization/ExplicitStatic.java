package initialization.initialization; 
 // : initialization/ExplicitStatic.java
// Explicit static initialization with the "static" clause.
import static net.mindview.util.Print.print;

class Cup {
    Cup(int marker) {
        print("Cup(" + marker + ")");
    }

    void f(int marker) {
        print("f(" + marker + ")");
    }
}


class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        print("Cups()");
    }
}


/**
 * 静态初始化动作只执行一次
 * @title ExplicitStatic
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午4:53:22
 * @since v1.0.1
 */
public class ExplicitStatic {
    public static void main(String[] args) {
        print("Inside main()");
        Cups.cup1.f(99); // (1)
    }
    // static Cups cups1 = new Cups(); // (2)
    // static Cups cups2 = new Cups(); // (2)
} /*
   * Output:
   * Inside main()
   * Cup(1)
   * Cup(2)
   * f(99)
   */// :~
