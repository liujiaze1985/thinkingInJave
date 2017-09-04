package reusing.protectedz;

// : reusing/Orc.java
// The protected keyword.
import static net.mindview.util.Print.print;

/**
 * 最好的方式还是将域保持为private ,应当保留"更改底层实现"的权利,然后通过protected方法来控制类的继承者的访问权限
 * @title Villain
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 下午6:25:47
 * @since v1.0.1
 */
class Villain {
    private String name;


    protected void set(String nm) {
        name = nm;
    }

    public Villain(String name) {
        this.name = name;
    }

    public String toString() {
        return "I'm a Villain and my name is " + name;
    }
}


public class Orc extends Villain {
    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        set(name); // Available because it's protected
        this.orcNumber = orcNumber;
    }

    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        print(orc);
        orc.change("Bob", 19);
        print(orc);
    }
} /*
   * Output:
   * Orc 12: I'm a Villain and my name is Limburger
   * Orc 19: I'm a Villain and my name is Bob
   */// :~
