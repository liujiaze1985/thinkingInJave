package control; // : control/ForEachInt.java

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;
import static net.mindview.util.Range.range;

/**
 * @title ForEachInt
 * @author liujiaze@zbj.com
 * @date 2017年7月28日 下午1:45:13
 * @since v1.0.1
 */
public class ForEachInt {
    public static void main(String[] args) {
        for (int i : range(10)) // 0..9
            printnb(i + " ");
        print();
        for (int i : range(5, 10)) // 5..9
            printnb(i + " ");
        print();
        for (int i : range(5, 20, 3)) // 5..20 step 3
            printnb(i + " ");
        print();
    }
} /*
   * Output:
   * 0 1 2 3 4 5 6 7 8 9
   * 5 6 7 8 9
   * 5 8 11 14 17
   */// :~
/*
 * 对于在一个整型值序列中步进的for语句,foreach语法将不起作用,除非先创建一个int数组.
 */

