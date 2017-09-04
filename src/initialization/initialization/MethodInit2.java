package initialization.initialization; 
 // : initialization/MethodInit2.java
/**
 * 调用带参方法赋初值
 * @title MethodInit2
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午3:57:40
 * @since v1.0.1
 */
public class MethodInit2 {
    int i = f();
    int j = g(i);

    int f() {
        return 11;
    }

    int g(int n) {
        return n * 10;
    }
} /// :~
