public class BS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 78;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        //start and end in argument to pass in future requests else can't
        if (s > e) {
            return -1;
        }

        //variable specific to that function call will go in the body of the func
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            //make sure to return the result of a function call of the return type
            //else stack breaks, main wont be returned and all

            //recurrsion call to the left side
            return search(arr, target, s, m - 1);
            // "Whatever the sub-search finds, hand it directly back to whoever called me."
        }
        return search(arr, target, m + 1, e);
    }
}