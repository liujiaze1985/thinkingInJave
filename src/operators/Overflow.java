package operators;

// : operators/Overflow.java
// Surprise! Java lets you overflow.
/**
 * 两个很大的int值执行乘法,结果会溢出
 * @title Overflow 溢出
 * @author liujiaze@zbj.com
 * @date 2017年7月27日 下午6:25:37
 * @since v1.0.1
 */
public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);
        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
} /*
   * Output:
   * big = 2147483647
   * bigger = -4
   */// :~
