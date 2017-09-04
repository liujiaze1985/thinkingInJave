package initialization.thisz;
// : initialization/PassingThis.java

class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}


class Peeler {
    static Apple peel(Apple apple) {
        // ... remove peel
        return apple; // Peeled
    }
}


class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}


/**
 * @title PassingThis
 * @author liujiaze@zbj.com
 * @date 2017年7月28日 下午6:17:59
 * @since v1.0.1
 */
public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
} /*
   * Output:
   * Yummy
   */// :~
/*
 * 对于将当前对象传递给其他方法
 */
