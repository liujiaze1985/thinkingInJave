// : interfaces/filters/LowPass.java
package interfaces.filters;

public class LowPass extends Filter {
    /** 切断 */
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input) {
        return input; // Dummy processing
    }
} /// :~
