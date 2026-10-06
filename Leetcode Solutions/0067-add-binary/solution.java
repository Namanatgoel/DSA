class Solution {
    public String addBinary(String a, String b) {
        /*
        * 11 + 1 -> 100
        pass each digit > 1
        we are given only binary so
        we can use AND, OR etc
        we want a logic gate XOR, 
        1^1 = 0
        0^0 = 0
        1^0 = 1
        0^1 = 1
        */
        /*
        1^1 = 0 pr hi carry over hai, matlab ek more significant bit ka addition h
        and that new bit is again done XOR with the old 2 bits
        example: 11^1 -> 
        1^1 = 0
        so 1 carry
        now for the MSB, 1^1^0 = 0
        means new MSB made with 0^1 = 1
        */
        //char arr[] = new char[String a]

        //approach 1

       /* int res = 0;
        while(num>0 || num1>0){
            int dig1 = num%10;
            int dig2 = num1%10;
            int xor = dig1 ^ dig2;
            res = res*10 + xor;
            num = num/10;
            num1 = num1/10;
        }
        String result = Integer.toString(res);
        return result;*/

        //approach 2
/*
        int num = Integer.parseInt(a,10);
        int num1 = Integer.parseInt(b,10);
        int result = num + num1;
        String numberString = Integer.toString(result);
        int result1 = Integer.parseInt(numberString,2);
        String isfinal = Integer.toString(result1);
        return isfinal;*/

        //approach 3
        //use DISCO knowledge to add using Full Adder
        //but how to count the number of bits in them
/*        int cin = 0;
        int sum = a^b^cin;
//        int carry = (cin&&a)|(b&&a)|(cin&&b);
        return sum;*/

        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i>= 0 || j>= 0 || carry == 1){
            int sum = carry;
            if(i>= 0){
                sum += a.charAt(i) - '0';
                i--;
            }
            if(j>= 0){
                sum += b.charAt(j) - '0';
                j--;
            }
            sb.append(sum%2);
            carry = sum/2;
        }

        return sb.reverse().toString();
    }
}

