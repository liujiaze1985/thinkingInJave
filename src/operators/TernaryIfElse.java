package operators;

// : operators/TernaryIfElse.java
import static net.mindview.util.Print.print;

/**
 * @title TernaryIfElse 条件操作符与if-else比较 p53
 * @author liujiaze@zbj.com
 * @date 2017年7月27日 下午5:55:11
 * @since v1.0.1
 */
public class TernaryIfElse {
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }

    static int standardIfElse(int i) {
        if (i < 10)
            return i * 100;
        else
            return i * 10;
    }

    public static void main(String[] args) {
        print(ternary(9));
        print(ternary(10));
        print(standardIfElse(9));
        print(standardIfElse(10));
    }
} /*
   * Output:
   * 900
   * 100
   * 900
   * 100
   */// :~
