import java.util.Arrays;

public class sortedmatrix {
    //matrix is sorted strictly top left element to the bottom right element
    public static void main() {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr, 6)));
    }

    //search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        //it basically takes the row in which u want to search and what u want to search
        //also it checks from which col to start and end search at
        while (cStart <= cEnd) {
            //simple BS
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; //be cautious over here
        //matrix maybe empty
        //edge case
        if (rows == 1) {
            //we need 1 more func, as we apply to individual rows as well
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        //or can do the whole thing for column elimination as well

        int cMid = cols / 2;

        //run the loop till 2 rows are remaining
        //and the condition for them would be like rowStart = rowEnd - 1, like 0, 1 rows or 1 and 2 row or 2 and 3 row
        while (rStart < (rEnd - 1)) {
            //while this is true, it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            } else if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else rEnd = mid;
        }
        //now we have two rows
        //check if the target is in the column of two rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        //rEnd = rStart + 1 as the above while loop condition will be voilated
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        //otherwise search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        //otherwise search in 2nd half
        if (target >= matrix[rStart][cMid - 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        //otherwise search in 3rd half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        //otherwise search in 4th half
        else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}
