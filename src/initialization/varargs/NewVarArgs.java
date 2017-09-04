package initialization.varargs; 
 // : initialization/NewVarArgs.java
// Using array syntax to create variable argument lists.
/**
 * 可变参数列表
 * @title NewVarArgs
 * @author liujiaze@zbj.com
 * @date 2017年7月31日 下午5:45:33
 * @since v1.0.1
 */
public class NewVarArgs {
    static void printArray(Object... args) { // 可变参数列表
        for (Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Can take individual elements:
        printArray(new Integer(47), new Float(3.14), new Double(11.11));
        printArray(47, 3.14F, 11.11);
        printArray("one", "two", "three");
        printArray(new A(), new A(), new A());
        // Or an array:
        printArray((Object[]) new Integer[] {1, 2, 3, 4});
        printArray(); // Empty list is OK
    }
} /*
   * Output: (75% match)
   * 47 3.14 11.11
   * 47 3.14 11.11
   * one two three
   * A@1bab50a A@c3c749 A@150bd4d
   * 1 2 3 4
   */// :~
