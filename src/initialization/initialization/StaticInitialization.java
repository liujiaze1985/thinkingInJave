package initialization.initialization; 
 // : initialization/StaticInitialization.java
// Specifying initial values in a class definition.
import static net.mindview.util.Print.print;

class Bowl {
    Bowl(int marker) {
        print("Bowl(" + marker + ")");
    }

    void f1(int marker) {
        print("f1(" + marker + ")");
    }
}


class Table {
    static Bowl bowl1 = new Bowl(1);

    Table() {
        print("Table()");
        bowl2.f1(1);
    }

    void f2(int marker) {
        print("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}


class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    Cupboard() {
        print("Cupboard()");
        bowl4.f1(2);
    }

    void f3(int marker) {
        print("f3(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}


/**
 * 静态数据初始化
 * 静态数据只占用一份存储区域,初奴化的顺序是先静态对象(如果它们尚未因前面的对象创建过程而初始化),而后是非静态对象
 * @title StaticInitialization
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午4:12:21
 * @since v1.0.1
 */
public class StaticInitialization {
    public static void main(String[] args) {
        print("Creating new Cupboard() in main");
        new Cupboard();
        print("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
} /*
   * Output:
   * Bowl(1)
   * Bowl(2)
   * Table()
   * f1(1)
   * Bowl(4)
   * Bowl(5)
   * Bowl(3)
   * Cupboard()
   * f1(2)
   * Creating new Cupboard() in main
   * Bowl(3)
   * Cupboard()
   * f1(2)
   * Creating new Cupboard() in main
   * Bowl(3)
   * Cupboard()
   * f1(2)
   * f2(1)
   * f3(1)
   */// :~
