class Solution {
    public int mySqrt(int x) {
        if(x < 2){
            return x;
        }
        long low = 0;
        long high = x;
        int ans = 0;

        while(low<=high){
            long mid = low + (high-low)/2;
            long square = mid*mid;
            if(square == x){
                return (int)mid;
            }
            else if(square<x){
                ans = (int) mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}
