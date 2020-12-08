/**
 * @author Dzmitry Fursevich
 */
public class Run5 {
    public static void main(String[] args) {
        int a = 10;

        for (int i = 0; i < a / 2; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = (a + 1) / 2; i < a; i++) {
            System.out.print(i + " ");
        }
    }
}
