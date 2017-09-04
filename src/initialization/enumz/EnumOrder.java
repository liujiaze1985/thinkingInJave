package initialization.enumz;

// : initialization/EnumOrder.java
/**
 * 创建枚举时,编译器会自动添加一些有用的特性:
 * toString()方法,显示某个enum实例的名字
 * ordinal(): 表示某个特定enum常量的声明顺序
 * static values(): 用来按照enum常量的声明顺序,产生由这些常量值构成的数组
 * @title EnumOrder
 * @author liujiaze@zbj.com
 * @date 2017年8月1日 下午12:55:52
 * @since v1.0.1
 */
public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values())
            System.out.println(s + ", ordinal " + s.ordinal());
    }
} /*
   * Output:
   * NOT, ordinal 0
   * MILD, ordinal 1
   * MEDIUM, ordinal 2
   * HOT, ordinal 3
   * FLAMING, ordinal 4
   */// :~
