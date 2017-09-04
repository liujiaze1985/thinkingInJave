package operators;

// : operators/Casting.java
/**
 * @title Casting 类型转换符
 * @author liujiaze@zbj.com
 * @date 2017年7月27日 下午6:15:48
 * @since v1.0.1
 */
public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long) i;
        lng = i; // "Widening," so cast not really required
        long lng2 = (long) 200;
        lng2 = 200;
        // A "narrowing conversion":
        i = (int) lng2; // Cast required
    }
} /// :~
