package control;

// : control/WhileTest.java
// Demonstrates the while loop.
/**
 * @title WhileTest 生成随机数,直到符合特定条件为止
 * @author liujiaze@zbj.com
 * @date 2017年7月28日 上午11:13:28
 * @since v1.0.1
 */
public class WhileTest {
    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.print(result + ", ");
        return result;
    }

    public static void main(String[] args) {
        while (condition())
            System.out.println("Inside 'while'");
        System.out.println("Exited 'while'");
    }
} /*
   * (Execute to see output)
   * Math.random() 产生0和1之间(含0去1)的一个double值
   */// :~
