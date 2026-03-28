class Solution {
    public int lengthOfLastWord(String s) {
        /* MY APPROACH
        int count = 0;
        for(int i = s.trim().length()-1; i>=0; i--){
            if(s.trim().charAt(i)!=' '){
                count++;
            }
            else break;
        }
        return count;
        */

        /* BEST SOL*/

        int length = 0;
        int i = s.length() - 1;
        while(i>=0 && s.charAt(i) == ' '){
            i--;
        }
        while(i>=0 && s.charAt(i) != ' '){
            length++;
            i--;
        }
        return length;
    }
}
