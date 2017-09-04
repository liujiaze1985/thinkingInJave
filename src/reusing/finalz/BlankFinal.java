package reusing.finalz; 
 // : reusing/BlankFinal.java
// "Blank" final fields.

class Poppet {
    private int i;

    Poppet(int ii) {
        i = ii;
    }
}


/**
 * 空白final
 * @title BlankFinal
 * @author liujiaze@zbj.com
 * @date 2017年8月11日 下午4:09:02
 * @since v1.0.1
 */
public class BlankFinal {
    private final int i = 0; // Initialized final
    private final int j; // Blank final
    private final Poppet p; // Blank final reference
    // Blank finals MUST be initialized in the constructor:

    public BlankFinal() {
        j = 1; // Initialize blank final
        p = new Poppet(1); // Initialize blank final reference
    }

    public BlankFinal(int x) {
        j = x; // Initialize blank final
        p = new Poppet(x); // Initialize blank final reference
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
} /// :~
