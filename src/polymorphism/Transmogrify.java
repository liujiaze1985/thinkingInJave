package polymorphism; 
 // : polymorphism/Transmogrify.java
// Dynamically changing the behavior of an object
// via composition (the "State" design pattern).
import static net.mindview.util.Print.print;

class Actor {
    public void act() {}
}


class HappyActor extends Actor {
    public void act() {
        print("HappyActor");
    }
}


class SadActor extends Actor {
    public void act() {
        print("SadActor");
    }
}


class Stage {
    private Actor actor = new HappyActor();

    public void change() {
        actor = new SadActor();
    }

    public void performPlay() {
        actor.act();
    }
}


/**
 * 引用在运行时可以与另一个不同的对象重新绑定起来,所以SadActor对象的引用可以在actor中被替代,
 * 然后由performPlay()产生的行为也随之改变.这样一来在运行期间获得了动态灵活性(状态模式),与此相反
 * 不能在运行期间决定继承不同的对象,因为它要求在编译期间完全确定下来
 * 用继承表达行为间的差异,并用字段表达状态上的变化
 * @title Transmogrify(使变形)
 * @author liujiaze
 * @date 2017年8月30日 下午3:32:32
 * @since v1.0.1
 */
public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
} /*
   * Output:
   * HappyActor
   * SadActor
   */// :~
