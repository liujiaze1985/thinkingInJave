package operators;

// : operators/Precedence.java
/**
 * 优先级 p39
 * @title Precedence
 * @author liujiaze@zbj.com
 * @date 2017年7月27日 下午3:10:04
 * @since v1.0.1
 */
public class Precedence {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        int a = x + y - 2 / 2 + z; // (1)
        int b = x + (y - 2) / (2 + z); // (2)
        System.out.println("a = " + a + " b = " + b);
    }
} /*
   * Output:
   * a = 5 b = 1
   */// :~
