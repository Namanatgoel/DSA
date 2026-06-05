public class floor {
    public static void main(String[] args) {
        int[] arr = new int[] {
                2, 3, 5, 9, 14, 16, 18
        } ;
        int target = 1;
        int ans = Floor(arr, target);
        System.out.println(ans);
    }

    //return the index of greatest no <= target
    static int Floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //what if there is no number less than or equals to the target, target is the smallest number, like here 1
// the below condition is not needed as autmatically the end = 0 - 1 return -1 only for such a condition
  //      if(target < arr[start]) return -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else return mid;
        }
        return end;
    }
}