import java.util.Arrays;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = new int[]{
                -545, -6, 0, 1, 4, 6, 8, 90, 92, 94, 109, 3453534
        };
        int target  = 0;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether asc or dsc
 /*       boolean isAsc;`
        if(arr[start]<arr[end]){
            isAsc = true;
        } else isAsc = false; */

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}