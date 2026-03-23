class Solution {
    public boolean isPerfectSquare(int num) {
        /*
        check for root only till root(num)
        */
        int i=1;
        while(i<=Math.sqrt(num)){
            if(i==Math.sqrt(num)){
                return true;
            }
            i++;
        }
        return false;
    }
}
