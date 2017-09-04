package control;

// : control/IfElse.java
import static net.mindview.util.Print.print;

/**
 * @title IfElse 猜的数是大于,小于还是等于目标数
 * @author liujiaze@zbj.com
 * @date 2017年7月28日 上午11:09:32
 * @since v1.0.1
 */
public class IfElse {
    static int result = 0;

    static void test(int testval, int target) {
        if (testval > target)
            result = +1;
        else if (testval < target)
            result = -1;
        else
            result = 0; // Match
    }

    public static void main(String[] args) {
        test(10, 5);
        print(result);
        test(5, 10);
        print(result);
        test(5, 5);
        print(result);
    }
} /*
   * Output:
   * 1
   * -1
   * 0
   */// :~
