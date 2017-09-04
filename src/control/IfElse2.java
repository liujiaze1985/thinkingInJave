package control;  // : control/IfElse2.java
import static net.mindview.util.Print.print;

/**
 * @title IfElse2 无条件分支 return
 * @author liujiaze@zbj.com
 * @date 2017年7月28日 下午4:10:58
 * @since v1.0.1
 */
public class IfElse2 {
    static int test(int testval, int target) {
        if (testval > target)
            return +1;
        else if (testval < target)
            return -1;
        else
            return 0; // Match
    }

    public static void main(String[] args) {
        print(test(10, 5));
        print(test(5, 10));
        print(test(5, 5));
    }
} /*
   * Output:
   * 1
   * -1
   * 0
   */// :~
