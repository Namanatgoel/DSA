class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] result = Arrays.copyOf(nums, len*2);
        System.arraycopy(result, 0, result, len, len);
        return result;
    }
}
