 // : polymorphism/shape/Triangle.java
package polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * 三角形
 * @title Triangle
 * @author liujiaze@zbj.com
 * @date 2017年8月11日 下午6:02:48
 * @since v1.0.1
 */
public class Triangle extends Shape {
    public void draw() {
        print("Triangle.draw()");
    }

    public void erase() {
        print("Triangle.erase()");
    }
} /// :~
