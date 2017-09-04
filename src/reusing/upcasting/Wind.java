package reusing.upcasting; 
 // : reusing/Wind.java
// Inheritance & upcasting.

class Instrument {
    public void play() {}

    static void tune(Instrument i) {
        // ...
        i.play();
    }
}


// Wind objects are instruments
// because they have the same interface:
/**
 * Wind 也是 Instrument 的一种类型
 * @title Wind
 * @author liujiaze@zbj.com
 * @date 2017年8月9日 上午10:36:24
 * @since v1.0.1
 */
public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); // Upcasting
    }
} /// :~
