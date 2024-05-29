package leet_code_problems.Easy;

// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

public class SubtractTheProductAndSumofDigitsofAnInteger_1281 {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));

        int m = 4421;
        System.out.println(subtractProductAndSum(m));
    }

    public static int subtractProductAndSum(int n) {
        int multi = 1;
        int sum = 0;
        int rem;

        while(n > 0) {
            rem = n % 10;
            multi *= rem;
            sum += rem;
            n /= 10;
        }
        return multi - sum;
    }
}
