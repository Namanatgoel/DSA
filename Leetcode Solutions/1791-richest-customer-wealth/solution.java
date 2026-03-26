class Solution {
    public int maximumWealth(int[][] accounts) {
   /*HIGH TIME COMPLEXITY AS TWO FOR LOOPS, then another loop, then a new array
        int[] sum = new int[accounts.length];
        for(int i = 0; i<accounts.length; i++){
            sum[i] = 0;
            for(int j = 0; j<accounts[i].length; j++){
                sum[i] += accounts[i][j];
            }
        }
        int max = sum[0];
        for(int i = 0; i<sum.length; i++){
            if(sum[i]>max){
                max = sum[i];
            }
        }
        return max; */

        int count = 0;
        for(int i = 0; i<accounts.length; i++){
            int val = 0;
            for(int j = 0; j<accounts[i].length; j++){
                val += accounts[i][j];
            }
            if(count<val){
                count = val;
            }
        }
        return count;
    }
}
