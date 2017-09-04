 // : polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package polymorphism.shape;

import java.util.Random;

/**
 * 随机形状生成器
 * @title RandomShapeGenerator
 * @author liujiaze@zbj.com
 * @date 2017年8月11日 下午6:03:14
 * @since v1.0.1
 */
public class RandomShapeGenerator {
    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
} /// :~
