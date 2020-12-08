import java.util.Random;

/**
 * @author Dzmitry Fursevich
 */
public class Run3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] ar = new int[4][4];

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = r.nextInt(100);
            }
        }

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (i == ar[i].length - j - 1) {
                    if (ar[i][j] > max) {
                        max = ar[i][j];
                    }
                }
            }
        }

        System.out.println("max = " + max);
    }
}
