public class leetcode744 {
    public static void main(String[] args) {
        char[] arr = new char[] {
                'c','f','j'
        } ;
        int target = 'a';
        char ans = (char) Ceiling(arr, target);
        System.out.println(ans);
    }
    //return the index of smallest no > target
    static int Ceiling(char[] letters, int target) {
        int start = 0;
        int end = letters.length - 1;

        //what if the last index is also not greater than or equal to the target

        if(target > letters[end]) return 0;
        // w/o the above statement, it return end+1

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else if (target > letters[mid]) {
                start = mid + 1;
            } //else return mid;
        }
        return start;
    }
}