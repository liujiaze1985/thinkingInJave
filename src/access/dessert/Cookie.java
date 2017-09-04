package access.dessert;
// : access/dessert/Cookie.java
// Creates a library.
/**
 * @title Cookie
 * @author liujiaze@zbj.com
 * @date 2017年8月1日 下午5:39:15
 * @since v1.0.1
 */
public class Cookie {
    public Cookie() {// public 权限修饰符
        System.out.println("Cookie constructor");
    }

    void bite() {// access.dessert 包外无法访问
        System.out.println("bite");
    }
} /// :~
