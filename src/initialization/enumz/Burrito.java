package initialization.enumz; 
 // : initialization/Burrito.java
/**
 * 在 swith 中使用 enum
 * 可以将enum当作其他像模像样类来处理
 * @title Burrito
 * @author liujiaze@zbj.com
 * @date 2017年8月1日 下午1:38:26
 * @since v1.0.1
 */
public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public void describe() {
        System.out.print("This burrito is ");
        switch (degree) {
            case NOT:
                System.out.println("not spicy at all.");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot.");
                break;
            case HOT:
            case FLAMING:
            default:
                System.out.println("maybe too hot.");
        }
    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(Spiciness.NOT), greenChile = new Burrito(Spiciness.MEDIUM),
                jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
} /*
   * Output:
   * This burrito is not spicy at all.
   * This burrito is a little hot.
   * This burrito is maybe too hot.
   */// :~
