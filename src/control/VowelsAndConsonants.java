package control;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

// : control/VowelsAndConsonants.java
// Demonstrates the switch statement.
import java.util.Random;

/**
 * switch 随机生成字母,并判断它们是vowel(元音)还是consonant(辅音)
 * @title VowelsAndConsonants
 * @author liujiaze@zbj.com
 * @date 2017年7月28日 下午4:48:11
 * @since v1.0.1
 */
public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            printnb((char) c + ", " + c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    print("vowel");
                    break;
                case 'y':
                case 'w':
                    print("Sometimes a vowel");
                    break;
                default:
                    print("consonant");
            }
        }
    }
} /*
   * Output:
   * y, 121: Sometimes a vowel
   * n, 110: consonant
   * z, 122: consonant
   * b, 98: consonant
   * r, 114: consonant
   * n, 110: consonant
   * y, 121: Sometimes a vowel
   * g, 103: consonant
   * c, 99: consonant
   * f, 102: consonant
   * o, 111: vowel
   * w, 119: Sometimes a vowel
   * z, 122: consonant
   * ...
   */// :~