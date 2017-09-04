package reusing.finalz;

// : reusing/FinalOverridingIllusion.java
// It only looks like you can override
// a private or private final method.
import static net.mindview.util.Print.print;

class WithFinals {
    // Identical to "private" alone:
    private final void f() {
        print("WithFinals.f()");
    }

    // Also automatically "final":
    private void g() {
        print("WithFinals.g()");
    }
}


class OverridingPrivate extends WithFinals {
    private final void f() {
        print("OverridingPrivate.f()");
    }

    private void g() {
        print("OverridingPrivate.g()");
    }
}


class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        print("OverridingPrivate2.f()");
    }

    public void g() {
        print("OverridingPrivate2.g()");
    }
}


/**
 * finale 与private
 * 类中所有的private方法都隐式的指定为是final
 * @title FinalOverridingIllusion
 * @author liujiaze@zbj.com
 * @date 2017年8月11日 下午4:27:24
 * @since v1.0.1
 */
public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        // You can upcast:
        OverridingPrivate op = op2;
        // But you can't call the methods:
        // ! op.f();
        // ! op.g();
        // Same here:
        WithFinals wf = op2;
        // ! wf.f();
        // ! wf.g();
    }
} /*
   * Output:
   * OverridingPrivate2.f()
   * OverridingPrivate2.g()
   */// :~
