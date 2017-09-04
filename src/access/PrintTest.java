package access; 
 // : access/PrintTest.java
// Uses the static printing methods in Print.java.
import static net.mindview.util.Print.print;

/**
 * 使用import static使用静态方法
 * @title PrintTest
 * @author liujiaze@zbj.com
 * @date 2017年8月1日 下午5:13:59
 * @since v1.0.1
 */
public class PrintTest {
    public static void main(String[] args) {
        print("Available from now on!");
        print(100);
        print(100L);
        print(3.14159);
    }
} /*
   * Output:
   * Available from now on!
   * 100
   * 100
   * 3.14159
   */// :~