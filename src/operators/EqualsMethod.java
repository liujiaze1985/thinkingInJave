package operators;

// : operators/EqualsMethod.java
/**
 * @title EqualsMethod
 * @author liujiaze@zbj.com
 * @date 2017年7月27日 下午3:22:45
 * @since v1.0.1
 */
public class EqualsMethod {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1.equals(n2));
    }
} /*
   * Output:
   * true
   */// :~
/*
 * p44
 * 比较两个对象实际内容是否相同,equals()不适用于"基本类型",基本类型使用==和!=
 */
