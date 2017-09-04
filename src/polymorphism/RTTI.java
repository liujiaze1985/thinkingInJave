package polymorphism; 
 // : polymorphism/RTTI.java
// Downcasting & Runtime type information (RTTI).
// {ThrowsException}

class Useful {
    public void f() {}

    public void g() {}
}


class MoreUseful extends Useful {
    public void f() {}

    public void g() {}

    public void u() {}

    public void v() {}

    public void w() {}
}


/**
 * @title RTTI 运行时类型识别
 * @author liujiaze
 * @date 2017年8月30日 下午4:56:37
 * @since v1.0.1
 */
public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {new Useful(), new MoreUseful()};
        x[0].f();
        x[1].g();
        // Compile time: method not found in Useful:
        // ! x[1].u();
        ((MoreUseful) x[1]).u(); // Downcast/RTTI
        ((MoreUseful) x[0]).u(); // Exception thrown
    }
} /// :~
