package polymorphism; 
 // : polymorphism/Shapes.java
// Polymorphism in Java.
import polymorphism.shape.RandomShapeGenerator;
import polymorphism.shape.Shape;

/**
 * 验证多态(后期绑定)产生正确的行为
 * @title Shapes
 * @author liujiaze@zbj.com
 * @date 2017年8月15日 下午5:07:10
 * @since v1.0.1
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Fill up the array with shapes:
        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // Make polymorphic method calls:
        for (Shape shp : s)
            shp.draw();
    }
} /*
   * Output:
   * Triangle.draw()
   * Triangle.draw()
   * Square.draw()
   * Triangle.draw()
   * Square.draw()
   * Triangle.draw()
   * Square.draw()
   * Triangle.draw()
   * Circle.draw()
   */// :~
