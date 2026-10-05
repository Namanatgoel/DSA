class Solution {
    public int hammingWeight(int n) {
        //either n-1 & n till n = 0
        // or shift 1 << i and mask ie & with the number n to find
        
        
        // BUILT-IN FUNCTION
        /* return Integer.bitCount(n); */

        int res = 0;
        for(int i = 0; i<32; i++){
            if((1<<i & n) != 0 ){
                res++;
            }
        }
        return res;
    }
}
