package initialization.initialization; 
 // : initialization/Mugs.java
// Java "Instance Initialization."
import static net.mindview.util.Print.print;

class Mug {
    Mug(int marker) {
        print("Mug(" + marker + ")");
    }

    void f(int marker) {
        print("f(" + marker + ")");
    }
}


/**
 * 非静态实例初始化
 * 实例初始化的类似语法,用来初始化每一个对象的非静态变量
 * @title Mugs
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午4:57:04
 * @since v1.0.1
 */
public class Mugs {
    Mug mug1;
    Mug mug2;
    /**
     * 实例化初始子句:与静态初始化子句一模一样,只是少static关键字,这种语法对于支持"匿名内部类"的初始化是必须的
     * 但是它也使用得可以保证无论调用哪个显式构造器,某些操作都会发生,
     * 从输出中可以看到实例初始化子句是在两个构造器之前执行
     */
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        print("mug1 & mug2 initialized");
    }

    Mugs() {
        print("Mugs()");
    }

    Mugs(int i) {
        print("Mugs(int)");
    }

    public static void main(String[] args) {
        print("Inside main()");
        new Mugs();
        print("new Mugs() completed");
        new Mugs(1);
        print("new Mugs(1) completed");
    }
} /*
   * Output:
   * Inside main()
   * Mug(1)
   * Mug(2)
   * mug1 & mug2 initialized
   * Mugs()
   * new Mugs() completed
   * Mug(1)
   * Mug(2)
   * mug1 & mug2 initialized
   * Mugs(int)
   * new Mugs(1) completed
   */// :~
