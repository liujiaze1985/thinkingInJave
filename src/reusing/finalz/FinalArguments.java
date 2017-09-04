package reusing.finalz;
// : reusing/FinalArguments.java
// Using "final" with method arguments.

class Gizmo {
    public void spin() {}
}


/**
 * final 修饰参数
 * @title FinalArguments
 * @author liujiaze@zbj.com
 * @date 2017年8月11日 下午4:23:11
 * @since v1.0.1
 */
public class FinalArguments {
    void with(final Gizmo g) {
        // ! g = new Gizmo(); // Illegal -- g is final
    }

    void without(Gizmo g) {
        g = new Gizmo(); // OK -- g not final
        g.spin();
    }

    // 只可读,不可写,主要用来向匿名内部类传递数据
    // void f(final int i) { i++; } // Can't change
    // You can only read from a final primitive:
    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
} /// :~
