package initialization.constructor; 
 // : initialization/SimpleConstructor2.java
// Constructors can have arguments.

/**
 * 有参构造器
 * @title Rock2
 * @author liujiaze@zbj.com
 * @date 2017年7月28日 下午5:33:39
 * @since v1.0.1
 */
class Rock2 {
    Rock2(int i) {
        System.out.print("Rock " + i + " ");
    }
}


public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++)
            new Rock2(i);
    }
} /*
   * Output:
   * Rock 0 Rock 1 Rock 2 Rock 3 Rock 4 Rock 5 Rock 6 Rock 7
   */// :~
