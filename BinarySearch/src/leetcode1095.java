public class leetcode1095 {
    public static void main() {

    }

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        //firstTry searches in first half
        int firstTry = orderAgnosticBS(arr, target, 0, peak);

        //if firstTry returns -1, ie element is in 2nd half so search there
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //take the left part cause we are in dec part of array
                end = mid;
            } else {
                start = mid + 1;
            }
            //as start == end in the end so they point to just one point to just one element
            //
        }
        return start; //or end as both would be equal
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
     //   int start = 0;
   //     int end = arr.length - 1;

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
