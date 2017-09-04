// : interfaces/filters/Waveform.java
package interfaces.filters;

/**
 * @Description: 电子滤波器
 * @author: liujiaze
 * @date: 2017年8月31日 下午2:58:30
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Waveform " + id;
    }
} /// :~
