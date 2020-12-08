import java.util.Random;

/**
 * @author Dzmitry Fursevich
 */
public class Run2 {
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

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (i == j) {
                    if (ar[i][j] < min) {
                        min = ar[i][j];
                    }
                }
            }
        }

        System.out.println("min = " + min);

        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i][i] < min2) {
                min2 = ar[i][i];
            }
        }

        System.out.println("min2 = " + min2);
    }
}
