package leet_code_problems.Easy;

// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

public class SubtractTheProductAndSumofDigitsofAnInteger_1281 {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));   // 15

        int m = 4421;
        System.out.println(subtractProductAndSum(m));   // 21
    }

    public static int subtractProductAndSum(int n) {

        // n = 234  // 23   // 2    // 0

        int multi = 1; // 4   // 12   // 24
        int sum = 0; // 4   // 7    // 9
        int rem; // 4   // 3    // 2

        // 1) n=234 > 0  ==  true
        // 2) n=23 > 0  ==  true
        // 3) n=2 > 0  ==  true
        // 4) n=0 > 0  ==  fale
        while(n > 0) {

            // 1) n=234 % 10  ==  rem=4
            // 2) n=23 % 10  ==  rem=3
            // 3) n=2 % 10  ==  rem=2
            rem = n % 10;

            // 1) multi=1 * rem=4  ==  multi=4
            // 2) multi=4 * rem=3  ==  multi=12
            // 3) multi=12 * rem=2  ==  multi=24
            multi *= rem;

            //1) sum=0 + rem=4  ==  sum=4
            //2) sum=4 + rem=3  ==  sum=7
            //3) sum=7 + rem=2  ==  sum=9
            sum += rem;

            // 1) n=234 / 10  ==  n=23
            // 2) n=23 / 10  ==  n=2
            // 3) n=2 / 10  ==  n=0
            n /= 10;
        }

        // 4) multi=24 - sum=9  ==  return 24-9 = 15
        return multi - sum;
    }
}
