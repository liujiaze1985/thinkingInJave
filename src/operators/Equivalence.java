package operators;

// : operators/Equivalence.java
/**
 * @title Equivalence 等价 p44
 * @author liujiaze@zbj.com
 * @date 2017年7月27日 下午3:20:14
 * @since v1.0.1
 */
public class Equivalence {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
    }
} /*
   * Output:
   * false
   * true
   */// :~
/*
 * ==和!=比较的是对象的引用
 */
