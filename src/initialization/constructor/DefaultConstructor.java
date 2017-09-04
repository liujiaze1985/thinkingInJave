package initialization.constructor; 
 // : initialization/DefaultConstructor.java

/**
 * 默认构造器
 * @title Bird
 * @author liujiaze@zbj.com
 * @date 2017年7月28日 下午6:06:00
 * @since v1.0.1
 */
class Bird {
}


public class DefaultConstructor {
    public static void main(String[] args) {
        Bird b = new Bird(); // Default!
    }
} /// :~
/*
 * 如果类中没有构造器,则编译器会自动创建一个默认构造器
 * 如果已经定义了一个构造器(无论是否有参数),编译器就不会自动创建默认构造器
 */
