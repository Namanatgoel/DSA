class Solution {
public:
    bool isPalindrome(int x) {
        if (x<0) return false;
        int rev = 0;
        int duplicate = x;
        while(duplicate>0){
            int rem = duplicate%10;
              if (rev > INT_MAX/10 || rev < INT_MIN/10)
        return 0;
            rev = rev*10 + rem;
            duplicate /= 10;
        }
        if(rev==x) return true;
        else return false;
    }
};
