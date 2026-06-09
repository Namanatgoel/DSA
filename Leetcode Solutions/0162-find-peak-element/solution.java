class Solution {
    public int findPeakElement(int[] nums) {
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
