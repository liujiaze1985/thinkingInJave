// : interfaces/music5/Music5.java
// Interfaces.
package interfaces.music5;

import static net.mindview.util.Print.print;

import polymorphism.music.Note;

/**
 * @Description: 接口
 * @author: liujiaze
 * @date: 2017年8月31日 上午10:47:52
 */
interface Instrument {
    // Compile-time constant:
    int VALUE = 5; // static & final
    // Cannot have method definitions:

    void play(Note n); // Automatically public

    void adjust();
}


class Wind implements Instrument {
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    public void adjust() {
        print(this + ".adjust()");
    }
}


class Percussion implements Instrument {
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    public void adjust() {
        print(this + ".adjust()");
    }
}


class Stringed implements Instrument {
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public String toString() {
        return "Stringed";
    }

    public void adjust() {
        print(this + ".adjust()");
    }
}


class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
}


class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
    }
}


/**
 * @Description: 在接口中的每一个方法都只是一个声明,这是编译吕所允许的在接口中唯一能够存在的事物
 *               无论是将其向上转型为称为Instrument的普通类,还是Instrument的抽象类,或是称为Instrument的接口都不会有问题,它的行为都是相同的
 *               从tune()方法中看到,没有任何依据来证明Instrument是一个普通类,抽象类,还是一个接口
 * @author: liujiaze
 * @date: 2017年8月31日 上午10:45:57
 */
public class Music5 {
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
