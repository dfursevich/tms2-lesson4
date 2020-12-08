import java.util.Random;

/**
 * @author Dzmitry Fursevich
 */
public class Run4 {
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

        for (int i = 0; i < ar.length; i++) {
            int[] ints = ar[i];
            
        }
    }
}
