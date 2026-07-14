package easy;

public class sum_of_digits {
    public static void main() {
        int ans = sum_dig(1342);
        System.out.println(ans);
    }

    static int sum_dig(int num){
        if (num == 0){
            return 0;
        }
        return sum_dig(num/10) + num % 10;
    }

}
