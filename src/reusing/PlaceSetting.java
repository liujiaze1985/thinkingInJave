package reusing;

// : reusing/PlaceSetting.java
// Combining composition & inheritance.
import static net.mindview.util.Print.print;

/**
 * 碟
 * @title Plate
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 下午1:44:39
 * @since v1.0.1
 */
class Plate {
    Plate(int i) {
        print("Plate constructor");
    }
}


/**
 * 晚餐
 * @title DinnerPlate
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 下午1:44:55
 * @since v1.0.1
 */
class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        print("DinnerPlate constructor");
    }
}


/**
 * 器皿
 * @title Utensil
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 下午1:44:00
 * @since v1.0.1
 */
class Utensil {
    Utensil(int i) {
        print("Utensil constructor");
    }
}


/**
 * 匙形工具
 * @title Spoon
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 下午1:43:34
 * @since v1.0.1
 */
class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        print("Spoon constructor");
    }
}


/**
 * 叉子
 * @title Fork
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 下午1:44:13
 * @since v1.0.1
 */
class Fork extends Utensil {
    Fork(int i) {
        super(i);
        print("Fork constructor");
    }
}


/**
 * 小刀
 * @title Knife
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 下午1:44:18
 * @since v1.0.1
 */
class Knife extends Utensil {
    Knife(int i) {
        super(i);
        print("Knife constructor");
    }
}


// A cultural way of doing something:
class Custom {
    Custom(int i) {
        print("Custom constructor");
    }
}


/**
 * 结合使用继承和组合
 * @title PlaceSetting
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 下午1:41:08
 * @since v1.0.1
 */
public class PlaceSetting extends Custom {
    private Spoon sp;// 勺
    private Fork frk;// 叉
    private Knife kn;// 刀
    private DinnerPlate pl;// 盘子

    public PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        print("PlaceSetting constructor");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }
} /*
   * Output:
   * Custom constructor
   * Utensil constructor
   * Spoon constructor
   * Utensil constructor
   * Fork constructor
   * Utensil constructor
   * Knife constructor
   * Plate constructor
   * DinnerPlate constructor
   * PlaceSetting constructor
   */// :~
