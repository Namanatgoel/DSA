public class leetcode702 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        //first find the range
        //start with a box of size 2
        int start = 0;
        int end = 1;

        //condition for target to lie in the given range
        //check if target > end then it dont lie
        while(target > arr[end]){
            int newStart = end+1;
            //end = previous end + sizeofbox*2
            end = end + (end - start + 1)*2; //using old start over here
            start = newStart;
        }
        return BinarySearch(arr, target, start, end);

    }
    static int BinarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
