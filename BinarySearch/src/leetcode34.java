import java.util.Arrays;

public class leetcode34 {
    static void main() {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result  = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] searchRange(int[] nums, int target) {
    int s = 0;
    if(nums.length == 0){
        return new int[]{-1,-1};
    }
    int e = nums.length - 1;

    int temp[] = new int[nums.length];
    int i = 0;
        while(e>=s){
        int m = s + (e-s)/2;
        if (nums[m] > target){
            e = m - 1;
        }
        else if(nums[m] < target){
            s = m + 1;
        }
        else {
            temp[i] = m;
            i++;
        }
    }
        if (temp.length == 0) return new int[]{-1, -1};
        Arrays.sort(temp);
        return new int[]{temp[0],temp[temp.length-1]};
}
}

