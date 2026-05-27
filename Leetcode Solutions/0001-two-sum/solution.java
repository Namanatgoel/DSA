class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] sol = new int[2];
        do{
            for(int i = 0; i<nums.length; i++){
                for(int j = nums.length-1; j>i; j--){
                    if (nums[i]+nums[j] == target){
                        sol[0] = i;
                        sol[1] = j;
                        return sol;
                    }
                }
            }
        }while(sum != target);
    return sol;
    }
}
