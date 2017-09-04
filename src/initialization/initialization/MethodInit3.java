package initialization.initialization; 
 // : initialization/MethodInit3.java
/**
 * 初始化顺序
 * @title MethodInit3
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午3:58:48
 * @since v1.0.1
 */
public class MethodInit3 {
    // ! int j = g(i); // Illegal forward reference
    int i = f();

    int f() {
        return 11;
    }

    int g(int n) {
        return n * 10;
    }
} /// :~
