package initialization.thisz; 
 // : initialization/Flower.java
// Calling constructors with "this"
import static net.mindview.util.Print.print;

/**
 * 多个构造器 在构造器中使用this
 * @title Flower
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 上午10:55:34
 * @since v1.0.1
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        print("Constructor w/ int arg only, petalCount= " + petalCount);
    }

    Flower(String ss) {
        print("Constructor w/ String arg only, s = " + ss);
        s = ss;
    }

    /**
     * this可调用一个构造器,但却不能调用两个. 此外必须将构造器调用置于最起始处,否则编译器会报错
     * @Description TODO
     * @param s
     * @param petals
     */
    Flower(String s, int petals) {
        this(petals);
        this.s = s; // Another use of "this"
        print("String & int args");
        // ! this(s); // Can't call two!
    }

    Flower() {
        this("hi", 47);
        print("default constructor (no args)");
    }

    /**
     * 除构造器之外,编辑器禁止在其他任何方法中调用构造器
     * @return void
     * @title printPetalCount
     * @tables
     * @special
     * @author liujiaze@zbj.com
     * @date 2017年7月31日 上午11:00:14
     * @since v1.0.1
     */
    void printPetalCount() {
        // !this(11); // Not inside non-constructor!
        print("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
} /*
   * Output:
   * Constructor w/ int arg only, petalCount= 47
   * String & int args
   * default constructor (no args)
   * petalCount = 47 s = hi
   */// :~
