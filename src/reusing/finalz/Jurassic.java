package reusing.finalz; 
 // : reusing/Jurassic.java
// Making an entire class final.

class SmallBrain {
}


final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();

    void f() {}
}


// ! class Further extends Dinosaur {}
// error: Cannot extend final class 'Dinosaur'
/**
 * final 类 不可被继承,方法不可被覆盖
 * @title Jurassic
 * @author liujiaze@zbj.com
 * @date 2017年8月11日 下午4:50:27
 * @since v1.0.1
 */
public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
} /// :~
