 // : polymorphism/shape/Circle.java
package polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * 圆
 * @title Circle
 * @author liujiaze@zbj.com
 * @date 2017年8月11日 下午6:01:09
 * @since v1.0.1
 */
public class Circle extends Shape {
    public void draw() {
        print("Circle.draw()");
    }

    public void erase() {
        print("Circle.erase()");
    }
} /// :~
