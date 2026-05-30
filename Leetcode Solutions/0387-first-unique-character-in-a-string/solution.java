class Solution {
    public int firstUniqChar(String s) {
        int charcount[] = new int[26];
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            charcount[ch - 'a']++;
        }
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(charcount[ch-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
