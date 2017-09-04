package polymorphism; 
 // : polymorphism/PrivateOverride.java
// Trying to override a private method.

import static net.mindview.util.Print.print;

/**
 * 缺陷:"覆盖"私有方法
 * @title PrivateOverride
 * @author liujiaze@zbj.com
 * @date 2017年8月15日 下午5:11:50
 * @since v1.0.1
 */
public class PrivateOverride {
    private void f() {
        print("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}


class Derived extends PrivateOverride {
    /**
     * 对于蕨类的私有方法来说这是个全新的方法,不可覆盖和重载
     * @return void
     * @title f
     * @author liujiaze@zbj.com
     * @date 2017年8月15日 下午5:12:46
     * @since v1.0.1
     */
    public void f() {
        print("public f()");
    }
} /*
   * Output:
   * private f()
   */// :~
