package initialization.constructor; 
 // : initialization/NoSynthesis.java
/**
 * 定义构造器
 * @title Bird2
 * @author liujiaze@zbj.com
 * @date 2017年7月28日 下午6:08:28
 * @since v1.0.1
 */
class Bird2 {
    Bird2(int i) {}

    Bird2(double d) {}
}


public class NoSynthesis {
    public static void main(String[] args) {
        // ! Bird2 b = new Bird2(); // No default
        Bird2 b2 = new Bird2(1);
        Bird2 b3 = new Bird2(1.0);
    }
} /// :~
