package operators;

// : operators/Literals.java
import static net.mindview.util.Print.print;

/**
 * @title Literals 直接量 p47
 * @author liujiaze@zbj.com
 * @date 2017年7月27日 下午3:36:21
 * @since v1.0.1
 */
public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f; // Hexadecimal (lowercase)
        print("i1: " + Integer.toBinaryString(i1));
        int i2 = 0X2F; // Hexadecimal (uppercase)
        print("i2: " + Integer.toBinaryString(i2));
        int i3 = 0177; // Octal (leading zero)
        print("i3: " + Integer.toBinaryString(i3));
        char c = 0xffff; // max char hex value
        print("c: " + Integer.toBinaryString(c));
        byte b = 0x7f; // max byte hex value
        print("b: " + Integer.toBinaryString(b));
        short s = 0x7fff; // max short hex value
        print("s: " + Integer.toBinaryString(s));
        long n1 = 200L; // long suffix
        long n2 = 200l; // long suffix (but can be confusing)
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F; // float suffix
        float f3 = 1f; // float suffix
        double d1 = 1d; // double suffix
        double d2 = 1D; // double suffix
        // (Hex and Octal also work with long)
    }
}
/*
 * Output:
 * i1: 101111
 * i2: 101111
 * i3: 1111111
 * c: 1111111111111111
 * b: 1111111
 * s: 111111111111111
 */// :~
/*
 * 二进制数没有直接常量表示方法,在使用十六进制和八进制户数法时,可以通过使用Integer和Long类的静态方法toBinaryString()显示二进制形式结果
 * ** 如果将比较小的类型传递给Integer.toBinaryString()方法,则该类型将自动被转换为int
 */
