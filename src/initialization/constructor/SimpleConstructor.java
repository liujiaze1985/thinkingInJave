package initialization.constructor; 
 // : initialization/SimpleConstructor.java
// Demonstration of a simple constructor.
/**
 * 带有构造器的简单类
 * @title Rock
 * @author liujiaze@zbj.com
 * @date 2017年7月28日 下午5:30:48
 * @since v1.0.1
 */
class Rock {
    Rock() { // This is the constructor
        System.out.print("Rock ");
    }
}


/**
 * @title SimpleConstructor
 * @author liujiaze@zbj.com
 * @date 2017年7月28日 下午5:31:00
 * @since v1.0.1
 */
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            new Rock();
    }
} /*
   * Output:
   * Rock Rock Rock Rock Rock Rock Rock Rock Rock Rock
   */// :~

/*
 * 构造器的名称必须与类名完全相同
 * 默认构造器(无参构造器)
 */
