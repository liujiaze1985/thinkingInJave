package polymorphism; 
 // : polymorphism/FieldAccess.java
// Direct field access is determined at compile time.

class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}


class Sub extends Super {
    public int field = 1;

    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}


/**
 * 直接访问某个域,这个访问就将在编译期进行解析
 * @title FieldAccess
 * @author liujiaze@zbj.com
 * @date 2017年8月15日 下午5:16:53
 * @since v1.0.1
 */
public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub(); // Upcast
        System.out.println("sup.field = " + sup.field + ", sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field + ", sub.getField() = " + sub.getField()
                + ", sub.getSuperField() = " + sub.getSuperField());
    }
} /*
   * Output:
   * sup.field = 0, sup.getField() = 1
   * sub.field = 1, sub.getField() = 1, sub.getSuperField() = 0
   */// :~
