package polymorphism;
// : polymorphism/Frog.java
// Cleanup and inheritance.

import static net.mindview.util.Print.print;

class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        print("Creating Characteristic " + s);
    }

    protected void dispose() {
        print("disposing Characteristic " + s);
    }
}


class Description {
    private String s;

    Description(String s) {
        this.s = s;
        print("Creating Description " + s);
    }

    protected void dispose() {
        print("disposing Description " + s);
    }
}


class LivingCreature {
    private Characteristic p = new Characteristic("is alive");
    private Description t = new Description("Basic Living Creature");

    LivingCreature() {
        print("LivingCreature()");
    }

    protected void dispose() {
        print("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}


class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("has heart");
    private Description t = new Description("Animal not Vegetable");

    Animal() {
        print("Animal()");
    }

    protected void dispose() {
        print("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}


class Amphibian extends Animal {
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("Both water and land");

    Amphibian() {
        print("Amphibian()");
    }

    protected void dispose() {
        print("Amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}


/**
 * 继承与清理
 * @title Frog
 * @author liujiaze@zbj.com
 * @date 2017年8月16日 下午2:03:19
 * @since v1.0.1
 */
public class Frog extends Amphibian {
    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats Bugs");

    public Frog() {
        print("Frog()");
    }

    /**
     * 清理方法覆盖了基类的清理方法
     * 当导出类调用清理动作时,必须要调用基类的清理方法,
     * 否则基类的清理动作将不会发生
     * 销毁的顺序与初始化顺序相反
     * @Description
     * @author liujiaze@zbj.com
     * @date 2017年8月16日 下午2:04:22
     */
    protected void dispose() {
        print("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        print("Bye!");
        frog.dispose();
    }
} /*
   * Output:
   * Creating Characteristic is alive
   * Creating Description Basic Living Creature
   * LivingCreature()
   * Creating Characteristic has heart
   * Creating Description Animal not Vegetable
   * Animal()
   * Creating Characteristic can live in water
   * Creating Description Both water and land
   * Amphibian()
   * Creating Characteristic Croaks
   * Creating Description Eats Bugs
   * Frog()
   * Bye!
   * Frog dispose
   * disposing Description Eats Bugs
   * disposing Characteristic Croaks
   * Amphibian dispose
   * disposing Description Both water and land
   * disposing Characteristic can live in water
   * Animal dispose
   * disposing Description Animal not Vegetable
   * disposing Characteristic has heart
   * LivingCreature dispose
   * disposing Description Basic Living Creature
   * disposing Characteristic is alive
   */// :~