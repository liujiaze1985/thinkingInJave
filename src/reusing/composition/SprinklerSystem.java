package reusing.composition; 
 // : reusing/SprinklerSystem.java
// Composition for code reuse.

class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    // 每一个非基本类型的对象都有一个toString()方法,而且当编译器需要一个String而你却只有一个对象时,该方法便会被调用
    public String toString() {
        return s;
    }
}


/**
 * 对于非基本类型的对象,必须将其引用置于新的类中,但可以直接定义基本类型数据
 * @title SprinklerSystem
 * @author liujiaze@zbj.com
 * @date 2017年8月7日 下午4:33:24
 * @since v1.0.1
 */
public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    public String toString() {
        return "valve1 = " + valve1 + " " + "valve2 = " + valve2 + " " + "valve3 = " + valve3 + " " + "valve4 = "
                + valve4 + "\n" + "i = " + i + " " + "f = " + f + " " + "source = " + source;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
} /*
   * Output:
   * WaterSource()
   * valve1 = null valve2 = null valve3 = null valve4 = null
   * i = 0 f = 0.0 source = Constructed
   */// :~
