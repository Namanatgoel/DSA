class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        /*
        loop through pairs in the 2D array
        equate the slope = (y2 - y1) / (x2 - x1)
        */
        int dy = coordinates[1][1] - coordinates[0][1];
        int dx = coordinates[1][0] - coordinates[0][0];
    for(int i = 2; i<coordinates.length; i++ )
        {
            int curr_dx = coordinates[i][0] - coordinates[0][0];
            int curr_dy = coordinates[i][1] - coordinates[0][1];
            if(dy*curr_dx != curr_dy*dx){
                return false;
            }
        }
        return true;
    /*
    dy * curr_dx == curr_dy * dx
    no div check cause div by 0 is painful and float is also painful, so int and multiply, also no looping
    through all the pairs as that is O(n^2)
    here we check each point against just one constant diff so O(n)
    */
}
}
