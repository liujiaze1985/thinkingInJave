 // : polymorphism/shape/Square.java
package polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * 正方形
 * @title Square
 * @author liujiaze@zbj.com
 * @date 2017年8月11日 下午6:03:01
 * @since v1.0.1
 */
public class Square extends Shape {
    public void draw() {
        print("Square.draw()");
    }

    public void erase() {
        print("Square.erase()");
    }
} /// :~
