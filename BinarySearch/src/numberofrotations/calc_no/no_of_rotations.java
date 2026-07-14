package numberofrotations.calc_no;

public class no_of_rotations {
    public static void main() {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot+1;
        //a non rotated array will give pivot = -1 so 0 rotation
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) { //bec else index out of bound error if mid is the last element
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }
            //duplicates will fail the last if and else bec which is true would be difficult to find for [2, 9, 2, 2, 2] as all mid
            //start and end would be equal
            else start = mid + 1;
        }
        return -1;
    }

    static int findPivotwithduplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) { //bec else index out of   bound error if mid is the last element
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            //if elements at the start, end and middle are equal then skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates


                //BUT WHAT IF THE ELEMENTS AT THE START AND THE END WERE THE PIVOTS?
                //CHECK if start is the pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                //CHECK if end is the pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            //OTHERWISE -> left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                //if condition 1 is true then left side is sorted
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

