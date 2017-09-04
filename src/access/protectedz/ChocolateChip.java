package access.protectedz; 
 // : access/ChocolateChip.java
// Can't use package-access member from another package.
import access.dessert.Cookie;

/**
 * 包访问权限
 * @title ChocolateChip
 * @author liujiaze@zbj.com
 * @date 2017年8月1日 下午6:09:26
 * @since v1.0.1
 */
public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp() {
        // ! bite(); // Can't access bite
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
} /*
   * Output:
   * Cookie constructor
   * ChocolateChip constructor
   */// :~
