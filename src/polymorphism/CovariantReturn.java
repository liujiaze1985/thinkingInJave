package polymorphism;
// : polymorphism/CovariantReturn.java

class Grain {
    public String toString() {
        return "Grain";
    }
}


class Wheat extends Grain {
    public String toString() {
        return "Wheat";
    }
}


class Mill {
    Grain process() {
        return new Grain();
    }
}


class WheatMill extends Mill {
    Wheat process() {
        return new Wheat();
    }
}


/**
 * 协变返回类型
 * jdk5 之前 将强制process()的覆盖版本必须返回Grain,而不能返回Wheat,尽管Wheat是从Grain导出的,因而也应该是一种合法的返回类型,协变返回类型允许返回更具体的Wheat类型
 * @title CovariantReturn
 * @author liujiaze
 * @date 2017年8月30日 下午3:22:59
 */
public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        m = new WheatMill();
        g = m.process();
        System.out.println(g);
    }
} /*
   * Output:
   * Grain
   * Wheat
   */// :~
