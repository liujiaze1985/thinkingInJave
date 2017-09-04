package interfaces;

// : interfaces/Adventure.java
// Multiple interfaces.

interface CanFight {
    void fight();
}


interface CanSwim {
    void swim();
}


interface CanFly {
    void fly();
}


class ActionCharacter {
    public void fight() {}
}


/**
 * @Description: 一个具体类组合数个接口之后产生了一个新类
 *               语法:继承在前,实现在后
 *               hero中的fight()继承自ActionCharacter
 * @author: liujiaze
 * @date: 2017年8月31日 下午4:12:33
 */
class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
    public void swim() {}

    public void fly() {}
}


/**
 * @Description: 冒险
 *               将接口和具体类作为参数,当Hero对象被创建时,它可以被传递给这些方法中的任何一下,这意味着它依次被向上转型为每一个接口
 *               该例所展示的就是使用接口的核心原因
 * @author: liujiaze
 * @date: 2017年8月31日 下午4:16:58
 */
public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); // Treat it as a CanFight
        u(h); // Treat it as a CanSwim
        v(h); // Treat it as a CanFly
        w(h); // Treat it as an ActionCharacter
    }
} /// :~
