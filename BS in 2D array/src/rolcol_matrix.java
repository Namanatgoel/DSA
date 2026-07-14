import java.lang.reflect.Array;
import java.util.Arrays;

public class rolcol_matrix {
    public static void main() {
        //matrix is rowwise and colwise sorted
        int[][] arr = {
                {10, 20, 30},
                {15, 25, 35},
                {28, 29, 37},
                {33, 34, 38}
        };

        System.out.println(Arrays.toString(search(arr, 37)));
    }
    static int[]search(int[][] matrix, int target){
        int r = 0;
        int c = matrix[0].length - 1;

        while(r < matrix[0].length && c >= 0 ){
            if(matrix[r][c] == target){
                return new int[]{r, c};
            }
            if(matrix[r][c] < target){
                r++;
            }
            else c--;
        }
        return new int[]{-1, -1};
    }

}
