import java.util.Arrays;

public class Searchin2DArray{
    public static void main(String[] args){
        int[][] arr = {
                {23,4,1},
                {0,90,9},
                {2,5,14}
        };
        int target = 0;
        int ans[] = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] array, int target){

        for (int row = 0; row < array.length; row++){
            for (int col=0; col < array[row].length; col++){
                if(array[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}