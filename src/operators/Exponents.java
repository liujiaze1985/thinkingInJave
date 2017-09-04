package operators;

// : operators/Exponents.java
// "e" means "10 to the power."
/**
 * @title Exponents 指数 p48
 * @author liujiaze@zbj.com
 * @date 2017年7月27日 下午3:45:55
 * @since v1.0.1
 */
public class Exponents {
    public static void main(String[] args) {
        // Uppercase and lowercase 'e' are the same:
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d; // 'd' is optional
        double expDouble2 = 47e47; // Automatically double
        System.out.println(expDouble);
        double e = Math.E;
        System.out.println(e);
    }
} /*
   * Output:
   * 1.39E-43
   * 4.7E48
   */// :~
