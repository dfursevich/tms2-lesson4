import java.util.Random;

/**
 * @author Dzmitry Fursevich
 */
public class Run1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] ar = new int[3][4];

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = r.nextInt(10);
            }
        }

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] line : ar) {
            for (int el : line) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
