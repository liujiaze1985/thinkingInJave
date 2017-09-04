package operators;

// : operators/Assignment.java
// Assignment with objects is a bit tricky.
import static net.mindview.util.Print.print;

class Tank {
    int level;
}


/**
 * @title Assignment 赋值 p40
 * @author liujiaze@zbj.com
 * @date 2017年7月27日 下午3:11:52
 * @since v1.0.1
 */
public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1 = t2;
        print("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level = 27;
        print("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
} /*
   * Output:
   * 1: t1.level: 9, t2.level: 47
   * 2: t1.level: 47, t2.level: 47
   * 3: t1.level: 27, t2.level: 27
   */// :~
