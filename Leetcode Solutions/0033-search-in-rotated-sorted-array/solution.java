class Solution {
    static int search(int[] nums, int target){
        int pivot = findPivot(nums);
        
        //to prevent empty array crash
        
        //if pivot not found then means array is not rotated
        if(pivot == -1){
            //normal BS
            return binarySearch(nums, target, 0, nums.length-1);
        }

        //if pivot found, you have found 2 asc sorted arrays
        else if(nums[pivot] == target){
            return pivot;
        }

        else if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    public static void main() {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases over here
            if (mid<end && arr[mid] > arr[mid + 1]) { //bec else index out of bound error if mid is the last element
                return mid;
            }
            else if (mid>start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            else if (arr[start] >= arr[mid]){
                end = mid - 1;
            }
            else start = mid+1;
        }
        return -1;
    }
}
