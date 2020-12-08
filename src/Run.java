/**
 * @author Dzmitry Fursevich
 */
public class Run {
    public static void main(String[] args) {
        int[] ar = new int[] {1, 2, 4};

        int[][] ar2DimWithZero = new int[2][3];
        //2 * 3
        int[][] ar2Dim = new int[][] {
                {1, 2, 4},
                {5, 0, 1}
        };

        int[] line = ar2Dim[0];

        int rows = ar2Dim.length;
        int cols = ar2Dim[0].length;
    }
}
