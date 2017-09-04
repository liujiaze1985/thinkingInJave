package initialization.thisz; 
 // : initialization/Apricot.java
/**
 * @title Apricot
 * @author liujiaze@zbj.com
 * @date 2017年7月28日 下午6:12:20
 * @since v1.0.1
 */
public class Apricot {
    void pick() { /* ... */ }

    void pit() {
        pick();
        /* ... */ }
} /// :~
/*
 * this关键字只能在方法内部使用,表示对"调用方法的那个对象"的引用
 * 如果在方法内部调用同一个类的另一个方法,就必使用this,直接调用即可
 * 当前方法中的this引用会自动应用于同一类中的其它方法
 */
