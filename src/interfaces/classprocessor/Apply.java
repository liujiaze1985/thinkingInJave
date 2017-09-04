// : interfaces/classprocessor/Apply.java
package interfaces.classprocessor;

import static net.mindview.util.Print.print;

import java.util.Arrays;

/**
 * @Description: 完全解耦
 * @author: liujiaze
 * @date: 2017年8月31日 上午11:39:14
 */
class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}


class Upcase extends Processor {
    String process(Object input) { // Covariant return
        return ((String) input).toUpperCase();
    }
}


class Downcase extends Processor {
    String process(Object input) {
        return ((String) input).toLowerCase();
    }
}


class Splitter extends Processor {
    String process(Object input) {
        // The split() argument divides a String into pieces:
        return Arrays.toString(((String) input).split(" "));
    }
}


/**
 * @Description:
 *               策略设计模式 创建一个能够根据所传递的参数对象的不同而具有不同行为的方法
 *               方法包含所要执行的算法中固定不变的部分,而"策略"包含变化的部分.
 *               策略就是传递进去的参数对象,它包含要执行的代码
 * @author: liujiaze
 * @date: 2017年8月31日 上午11:39:57
 */
public class Apply {
    /**
     * @Description: 此方法中Processor对象就是一个策略
     * @param p
     * @param s
     * @return: void
     * @author: liujiaze
     * @date: 2017年8月31日 下午2:56:16
     */
    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
} /*
   * Output:
   * Using Processor Upcase
   * DISAGREEMENT WITH BELIEFS IS BY DEFINITION INCORRECT
   * Using Processor Downcase
   * disagreement with beliefs is by definition incorrect
   * Using Processor Splitter
   * [Disagreement, with, beliefs, is, by, definition, incorrect]
   */// :~
