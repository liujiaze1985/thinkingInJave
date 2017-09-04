package reusing; 
 // : reusing/Car.java
// Composition with public objects.
/**
 * 引擎
 * @title Engine
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 下午4:52:17
 * @since v1.0.1
 */
class Engine {
    public void start() {}

    public void rev() {}

    public void stop() {}
}


/**
 * 轮子
 * @title Wheel
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 下午4:52:35
 * @since v1.0.1
 */
class Wheel {
    public void inflate(int psi) {}
}


/**
 * 窗
 * @title Window
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 下午4:52:42
 * @since v1.0.1
 */
class Window {
    public void rollup() {}

    public void rolldown() {}
}


/**
 * 门
 * @title Door
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 下午4:52:52
 * @since v1.0.1
 */
class Door {
    public Window window = new Window();

    public void open() {}

    public void close() {}
}


/**
 * 该例是个特例(一般情况下应该使域成为private)
 * 使成员成为public将有助于客户端程序员了解怎么样去使用类,而且也降低了开发者所面临的代码复杂度
 * @title Car
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 下午4:52:03
 * @since v1.0.1
 */
public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door(), right = new Door(); // 2-door

    public Car() {
        for (int i = 0; i < 4; i++)
            wheel[i] = new Wheel();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
    }
} /// :~
