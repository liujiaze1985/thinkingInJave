package control;  // : control/ForEachFloat.java
import java.util.Random;

/**
 * @title ForEachFloat foreach float数组
 * @author liujiaze@zbj.com
 * @date 2017年7月28日 下午1:41:32
 * @since v1.0.1
 */
public class ForEachFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float f[] = new float[10];
        for (int i = 0; i < 10; i++)
            f[i] = rand.nextFloat(); // 设置一个随机的float值
        for (float x : f)
            System.out.println(x);
    }
} /*
   * Output:
   * 0.72711575
   * 0.39982635
   * 0.5309454
   * 0.0534122
   * 0.16020656
   * 0.57799757
   * 0.18847865
   * 0.4170137
   * 0.51660204
   * 0.73734957
   */// :~
