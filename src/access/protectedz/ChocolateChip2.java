package access.protectedz; 
 // : access/ChocolateChip2.java
import access.cookie2.Cookie;

/**
 * 包访问权限修饰的方法的访问
 * @title ChocolateChip2
 * @author liujiaze@zbj.com
 * @date 2017年8月1日 下午6:10:22
 * @since v1.0.1
 */
public class ChocolateChip2 extends Cookie {
    public ChocolateChip2() {
        System.out.println("ChocolateChip2 constructor");
    }

    public void chomp() {
        bite();
    } // Protected method

    public static void main(String[] args) {
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
} /*
   * Output:
   * Cookie constructor
   * ChocolateChip2 constructor
   * bite
   */// :~
