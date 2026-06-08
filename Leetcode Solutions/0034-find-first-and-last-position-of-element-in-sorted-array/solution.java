class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        //check for the first occurence of the target first
        ans[0] = search(nums, target, true);
        if (ans[0]!= -1)
        ans[1] = search(nums, target, false);
        
        return ans;

    }
    //this func just returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int s = 0;
        int e = nums.length - 1;

        while(s<=e){
            int m = s + (e-s)/2;

            if (target < nums[m]){
                e = m - 1;
            }

            else if (target > nums[m]){
                s = m + 1;
            }
            
            else {
                //potential ans found
                ans = m;
                if(findStartIndex){
                    e = m -1;
                }else{
                    s = m +1;
                }
            }

        }
        return ans;
    }
}

   /*     int s = nums[0];
        int e = nums[nums.length - 1];
        
        int temp[] = new int[nums.length];

        while(e>=s){
            int m = s + (e-s)/2;
            if (nums[m] < target){
                s = m + 1;
            }
            else if(nums[m] > target){
                e = m - 1;
            }
            else {
                int i = 0;
                temp[i] = m;
                i++;
            }
        }
        Arrays.sort(temp);
        return temp;*/

