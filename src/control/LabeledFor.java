package control;

// : control/LabeledFor.java
// For loops with "labeled break" and "labeled continue."
import static net.mindview.util.Print.print;

/**
 * 标签用于for循环
 * @title LabeledFor
 * @author liujiaze@zbj.com
 * @date 2017年7月28日 下午4:21:30
 * @since v1.0.1
 */
public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer: // Can't have statements here
        for (; true;) { // infinite loop
            inner: // Can't have statements here
            for (; i < 10; i++) {
                print("i = " + i);
                if (i == 2) {
                    print("continue");
                    continue;
                }
                if (i == 3) {
                    print("break");
                    i++; // Otherwise i never
                         // gets incremented.
                    break;
                }
                if (i == 7) {
                    print("continue outer");
                    i++; // Otherwise i never
                         // gets incremented.
                    continue outer;
                }
                if (i == 8) {
                    print("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        print("continue inner");
                        continue inner;
                    }
                }
            }
        }
        // Can't break or continue to labels here
    }
} /*
   * Output:
   * i = 0
   * continue inner
   * i = 1
   * continue inner
   * i = 2
   * continue
   * i = 3
   * break
   * i = 4
   * continue inner
   * i = 5
   * continue inner
   * i = 6
   * continue inner
   * i = 7
   * continue outer
   * i = 8
   * break outer
   */// :~
