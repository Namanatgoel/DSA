public class ceiling {
    public static void main(String[] args) {
        int[] arr = new int[] {
                2, 3, 5, 9, 14, 16, 18
        } ;
        int target = 19;
        int ans = Ceiling(arr, target);
        System.out.println(ans);
    }
    //return the index of smallest no >= target
    static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //what if the last index is also not greater than or equal to the target

        if(target > arr[end]) return -1;
        // w/o the above statement, it return end+1
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else return mid;
        }
        return start;
    }
}