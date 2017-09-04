// : interfaces/interfaceprocessor/FilterProcessor.java
package interfaces.interfaceprocessor;

import interfaces.filters.BandPass;
import interfaces.filters.Filter;
import interfaces.filters.HighPass;
import interfaces.filters.LowPass;
import interfaces.filters.Waveform;

/**
 * @Description: 适配器设计模式:适配器中的代码将接受你拥有的接口,并产生你所需要的接口
 *               FilterAdapter的构造器接受你所拥有的接口Filter,然后生成具有你所需要的Processor接口的对象
 * @author: liujiaze
 * @date: 2017年8月31日 下午3:41:53
 */
class FilterAdapter implements Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    public String name() {
        return filter.name();
    }

    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}


/**
 * @Description: TODO
 * @author: liujiaze
 * @date: 2017年8月31日 下午3:40:43
 */
public class FilterProcessor {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
        Apply.process(new FilterAdapter(new HighPass(2.0)), w);
        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }
} /*
   * Output:
   * Using Processor LowPass
   * Waveform 0
   * Using Processor HighPass
   * Waveform 0
   * Using Processor BandPass
   * Waveform 0
   */// :~
