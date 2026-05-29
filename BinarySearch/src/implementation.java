public class implementation {
    public static void main(String[] args) {
        int[] arr = new int[] {
            -545, -6, 0, 1, 4, 6, 8, 90, 92, 94, 109, 3453534
        } ;
        int target = 0;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else return mid;
        }
        return -1;
    }
}