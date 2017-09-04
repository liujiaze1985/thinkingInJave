package polymorphism; 
 // : polymorphism/Sandwich.java
// Order of constructor calls.

import static net.mindview.util.Print.print;

class Meal {
    Meal() {
        print("Meal()");
    }
}


class Bread {
    Bread() {
        print("Bread()");
    }
}


class Cheese {
    Cheese() {
        print("Cheese()");
    }
}


class Lettuce {
    Lettuce() {
        print("Lettuce()");
    }
}


class Lunch extends Meal {
    Lunch() {
        print("Lunch()");
    }
}


class PortableLunch extends Lunch {
    PortableLunch() {
        print("PortableLunch()");
    }
}


/**
 * 展示组合,继承及多态在构建顺序上的作用
 * @title Sandwich
 * @author liujiaze@zbj.com
 * @date 2017年8月15日 下午5:34:28
 * @since v1.0.1
 */
public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public Sandwich() {
        print("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
} /*
   * Output:
   * Meal()
   * Lunch()
   * PortableLunch()
   * Bread()
   * Cheese()
   * Lettuce()
   * Sandwich()
   */// :~
