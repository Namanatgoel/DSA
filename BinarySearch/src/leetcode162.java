public class leetcode162 {
    public static void main() {
        int[] nums = {3,5,6,4,1,2,1,2,3,9,2,1};
        //it gets stuck in local maxima
        //similar to gradient descent problem
        // O(log N) is Impossible for "Minimum Peak"
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end){
            int mid = start + (end-start)/2;
            if(nums[mid]>nums[mid+1]){
                //take the left part cause we are in dec part of array
                end = mid;
            }
            else{
                start = mid+1;
            }
            //as start == end in the end so they point to just one point to just one element
            //
        }
        return start; //or end as both would be equal
    }
}

