package reusing.extendsz; 
 // : reusing/Chess.java
// Inheritance, constructors and arguments.
import static net.mindview.util.Print.print;

class Game {
    Game(int i) {
        print("Game constructor");
    }
}


class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        print("BoardGame constructor");
    }
}


/**
 * 没有默认的基类构造器,或者想调用一个带参数的基类构造器
 * 使用关键字super调用基类的构造器
 * @title Chess
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 上午11:31:54
 * @since v1.0.1
 */
public class Chess extends BoardGame {
    Chess() {
        super(11);
        print("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
} /*
   * Output:
   * Game constructor
   * BoardGame constructor
   * Chess constructor
   */// :~
