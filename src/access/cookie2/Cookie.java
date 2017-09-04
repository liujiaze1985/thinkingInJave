 // : access/cookie2/Cookie.java
package access.cookie2;

/**
 * 包访问 权限修饰符
 * @title Cookie
 * @author liujiaze@zbj.com
 * @date 2017年8月1日 下午5:37:45
 * @since v1.0.1
 */
public class Cookie {
    public Cookie() {
        System.out.println("Cookie constructor");
    }

    protected void bite() {
        System.out.println("bite");
    }
} /// :~
