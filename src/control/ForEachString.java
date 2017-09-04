package control;  // : control/ForEachString.java

/**
 * @title ForEachString
 * @author liujiaze@zbj.com
 * @date 2017年7月28日 下午1:43:53
 * @since v1.0.1
 */
public class ForEachString {
    public static void main(String[] args) {
        for (char c : "An African Swallow".toCharArray())
            System.out.print(c + " ");
    }
} /*
   * Output:
   * A n A f r i c a n S w a l l o w
   */// :~
/*
 * .toCharArray() 返回一个char数组
 */
