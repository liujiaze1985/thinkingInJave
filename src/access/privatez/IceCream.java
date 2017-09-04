package access.privatez; 
 // : access/IceCream.java
// Demonstrates "private" keyword.
/**
 * private 演练
 * @title Sundae
 * @author liujiaze@zbj.com
 * @date 2017年8月1日 下午5:49:34
 * @since v1.0.1
 */
class Sundae {
    private Sundae() {}

    static Sundae makeASundae() {
        return new Sundae();
    }
}




public class IceCream {
    public static void main(String[] args) {
        // ! Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
} /// :~
