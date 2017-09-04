package access.nestedclasses;
// : access/Lunch.java
// Demonstrates class access specifiers. Make a class
// effectively private with private constructors:

class Soup1 {
    private Soup1() {}// 构造器私有化,用来阻止直接创建该类的实例

    // (1) Allow creation via static method:
    // 静态内部类,返回一个对象的引用(如果想要在返回引用之前在Soup1上做一些额外的工作,或是如果想要记录到底创建了多少个Soup1对象(可能要限制其数量),这种做法将很有好处)
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}


class Soup2 {
    private Soup2() {}

    // (2) Create a static object and return a reference
    // upon request.(The "Singleton" pattern):
    private static Soup2 ps1 = new Soup2();

    // 使用了单例模式
    public static Soup2 access() {
        return ps1;
    }

    public void f() {}
}


// Only one public class allowed per file:
public class Lunch {
    void testPrivate() {
        // Can't do this! Private constructor:
        // ! Soup1 soup = new Soup1();
    }

    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
} /// :~
