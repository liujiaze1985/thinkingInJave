package reusing.proxy;

// : reusing/SpaceShip.java
/**
 * 使用继承构造太空船,
 * SpaceShip并非真正的SpaceShipControls,SpaceShip包含SpaceShipControls,此时SpaceShipControls的所有方法都在SpaceShip暴露出来了
 * @title SpaceShip
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 上午11:38:49
 * @since v1.0.1
 */
public class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.forward(100);
    }
} /// :~
