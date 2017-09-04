// : interfaces/music4/Music4.java
// Abstract classes and methods.
package interfaces.music4;

import static net.mindview.util.Print.print;

import polymorphism.music.Note;

/**
 * @Description: 抽象类
 * @author: liujiaze
 * @date: 2017年8月31日 上午10:24:25
 */
abstract class Instrument {
    private int i; // Storage allocated for each

    /**
     * @Description: 抽象方法
     * @param n
     * @return: void
     * @author: liujiaze
     * @date: 2017年8月31日 上午10:24:14
     */
    public abstract void play(Note n);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}


class Wind extends Instrument {
    public void play(Note n) {
        print("Wind.play() " + n);
    }

    public String what() {
        return "Wind";
    }

    public void adjust() {}
}


class Percussion extends Instrument {
    public void play(Note n) {
        print("Percussion.play() " + n);
    }

    public String what() {
        return "Percussion";
    }

    public void adjust() {}
}


class Stringed extends Instrument {
    public void play(Note n) {
        print("Stringed.play() " + n);
    }

    public String what() {
        return "Stringed";
    }

    public void adjust() {}
}


class Brass extends Wind {
    public void play(Note n) {
        print("Brass.play() " + n);
    }

    public void adjust() {
        print("Brass.adjust()");
    }
}


class Woodwind extends Wind {
    public void play(Note n) {
        print("Woodwind.play() " + n);
    }

    public String what() {
        return "Woodwind";
    }
}


/**
 * 使用抽象方类和抽象方法
 * @title Music4
 * @author liujiaze
 * @date 2017年8月31日 上午10:18:19
 * @since v1.0.1
 */
public class Music4 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind()};
        tuneAll(orchestra);
    }
} /*
   * Output:
   * Wind.play() MIDDLE_C
   * Percussion.play() MIDDLE_C
   * Stringed.play() MIDDLE_C
   * Brass.play() MIDDLE_C
   * Woodwind.play() MIDDLE_C
   */// :~
