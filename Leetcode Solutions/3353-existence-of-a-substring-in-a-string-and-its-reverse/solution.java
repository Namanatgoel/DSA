class Solution {
    public boolean isSubstringPresent(String s) {
        String news;
        String temp;
        String reversed_s = "";
      
        for(int i = s.length()-1; i>=0; i--){
            reversed_s += s.charAt(i);
        }
        
        for(int i = 0; i<s.length()-1; i++)
        {
            /*
            O(n²) Because: reversed_s += char creates a new string each time.
            Each iteration creates new strings:
            news and temp 
            So operations become roughly: O(n²) substring allocations
            Time  : O(n²)
            Memory: O(n²) temporary strings
            */
        news = s.substring(i,i+2);
        
        for(int j = 0; j<reversed_s.length()-1; j++)
        {
            temp = reversed_s.substring(j,j+2);
            if(news.equals(temp)) return true;
        }
        }
        return false;
    }
}
