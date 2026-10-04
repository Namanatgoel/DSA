class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> elementsCount = new HashMap<>();
        for (int num:nums){
            if (elementsCount.containsKey(num)){
                return true;
            }
            else{
                elementsCount.put(num, 1);
            }
        }
        return false;
    }
}
