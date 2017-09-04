// : polymorphism/music/Music2.java
// Overloading instead of upcasting.
package polymorphism.music;

import static net.mindview.util.Print.print;

/**
 * 弦乐
 * @title Stringed
 * @author liujiaze@zbj.com
 * @date 2017年8月11日 下午5:55:46
 * @since v1.0.1
 */
class Stringed extends Instrument {
    public void play(Note n) {
        print("Stringed.play() " + n);
    }
}


/**
 * 管乐
 * @title Brass
 * @author liujiaze@zbj.com
 * @date 2017年8月11日 下午5:55:58
 * @since v1.0.1
 */
class Brass extends Instrument {
    public void play(Note n) {
        print("Brass.play() " + n);
    }
}


/**
 * 如果让tune()直接接受一个导出类引用作为参数,就需要为系统内Instrument的每种类型都编写一个新的tune()方法
 * @title Music2
 * @author liujiaze@zbj.com
 * @date 2017年8月11日 下午5:57:12
 * @since v1.0.1
 */
public class Music2 {
    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute); // No upcasting
        tune(violin);
        tune(frenchHorn);
    }
} /*
   * Output:
   * Wind.play() MIDDLE_C
   * Stringed.play() MIDDLE_C
   * Brass.play() MIDDLE_C
   */// :~
