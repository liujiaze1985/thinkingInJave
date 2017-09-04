package operators;

import static net.mindview.util.Print.print;

// : operators/Bool.java
// Relational and logical operators.
import java.util.Random;

/**
 * @title Bool 逻辑关系符 p45
 * @author liujiaze@zbj.com
 * @date 2017年7月27日 下午3:30:17
 * @since v1.0.1
 */
public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        print("i = " + i);
        print("j = " + j);
        print("i > j is " + (i > j));
        print("i < j is " + (i < j));
        print("i >= j is " + (i >= j));
        print("i <= j is " + (i <= j));
        print("i == j is " + (i == j));
        print("i != j is " + (i != j));
        // Treating an int as a boolean is not legal Java:
        // ! print("i && j is " + (i && j));
        // ! print("i || j is " + (i || j));
        // ! print("!i is " + !i);
        print("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
        print("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
    }
} /*
   * Output:
   * i = 58
   * j = 55
   * i > j is true
   * i < j is false
   * i >= j is true
   * i <= j is false
   * i == j is false
   * i != j is true
   * (i < 10) && (j < 10) is false
   * (i < 10) || (j < 10) is false
   */// :~
