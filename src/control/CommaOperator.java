package control;

// : control/CommaOperator.java
/**
 * @title CommaOperator 逗号操作符
 * @author liujiaze@zbj.com
 * @date 2017年7月28日 下午1:36:41
 * @since v1.0.1
 */
public class CommaOperator {
    public static void main(String[] args) {
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
} /*
   * Output:
   * i = 1 j = 11
   * i = 2 j = 4
   * i = 3 j = 6
   * i = 4 j = 8
   */// :~
/*
 * Java里唯一用到逗号操作符的地方就是for循环的控制表达式
 * 在一个控制表达式中,定义多个变量的这种能力只限于for循环适用,在其他任何选择勤劳迭代语句中都不能使用这种方式.
 */
