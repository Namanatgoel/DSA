class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
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
