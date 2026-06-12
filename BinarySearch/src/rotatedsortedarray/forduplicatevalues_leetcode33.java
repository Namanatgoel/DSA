package rotatedsortedarray;

//this will not work for duplicate valuesleetcode33
public class forduplicatevalues_leetcode33 {
    public static void main() {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(findPivot(arr));
        System.out.println(search(arr, target));
    }

    static int search(int[] nums, int target){
        int pivot = findPivot(nums);

        //to prevent empty array crash, nothing extra needed to do

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
            if (mid<end && arr[mid] > arr[mid + 1]) { //bec else index out of   bound error if mid is the last element
                return mid;
            }
            if (mid>start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            //if elements at the start, end and middle are equal then skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates


                //BUT WHAT IF THE ELEMENTS AT THE START AND THE END WERE THE PIVOTS?
                //CHECK if start is the pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;

                //CHECK if end is the pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //OTHERWISE -> left side is sorted, so pivot should be in right
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                //if condition 1 is true then left side is sorted
                start = mid+1;
            } else{
                end = mid - 1;
            }
        }
        return -1;
    }
}

