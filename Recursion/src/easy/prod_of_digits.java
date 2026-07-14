package easy;

public class prod_of_digits {
    public static void main() {
        int ans = prod_dig(1342);
        System.out.println(ans);
    }

    static int prod_dig(int num){
        //if one digit is remaining, return that digit
        if (num == 0){
            return 1;
        }
        return prod_dig(num/10) * num % 10;
    }

}
