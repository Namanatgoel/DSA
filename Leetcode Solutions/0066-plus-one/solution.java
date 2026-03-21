class Solution {
    public int[] plusOne(int[] digits) {
        /* UNOPTIMIZED SOLUTION
        digits[digits.length-1] += 1;
        int i = digits.length;
        while(i>0){
        if(digits[i-1]==10){
            digits[i-1] = 0;
            if(i==1){
            int new_size = digits.length+1;
            int[] new_digits = new int[new_size];
            System.arraycopy(digits, 0, new_digits, 1, digits.length);
            new_digits[0] = 1;
            return new_digits;
        }
        else{
        digits[i-2] += 1;
        }
        }
        i--;
        }
        return digits;
        */
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }
}
