import java.util.Random;

/**
 * @author Dzmitry Fursevich
 */
public class Run6 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] ar1 = new int[10];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = r.nextInt(100);
        }

        int[] ar2 = new int[10];
        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = r.nextInt(100);
        }

        print(ar1);
        print(ar2);

        int[] ar3 = multiply(ar1, 4);
        print(ar3);
        
        print(multiply(ar1, 5));
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] multiply(int[] array, int p) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * p;
        }
        return result;
    }
}
