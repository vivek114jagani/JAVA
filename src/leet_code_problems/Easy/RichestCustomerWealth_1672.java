package leet_code_problems.Easy;

// https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth_1672 {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {3, 2, 1}
        };
        System.out.println(maximumWealth(arr1));    // 6

        int[][] arr2 = {
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(maximumWealth(arr2));    // 10
    }

    public static int maximumWealth(int[][] accounts) {

        // accounts=[ [1, 2, 3],   [3, 2, 1]]
        // index  = [0[0, 1, 2], 1[0, 1, 2]]

        int ans = Integer.MIN_VALUE; // 6

        // 1) person[0]=[1, 2, 3]
        // 2) person[1]=[3, 2, 1]
        for (int[] person : accounts) {
            int sum = 0; // 1   // 3    // 6
            // sum = 0; // 3    // 5    // 6

            // 1) account=1
            // 1.1) account=2
            // 1.2) account=3
            // 2) account=3
            // 2.1) account=2
            // 2.2) account=1
            for (int account : person) {

                // 1) sum=0 + account=1  ==  sum=1
                // 1.1) sum=1 + account=2  ==  sum=3
                // 1.2) sum=3 + account=3  ==  sum=6
                // 2) sum=0 + account=3  ==  sum=3
                // 2.1) sum=3 + account=2  ==  sum=5
                // 2.2) sum=5 + account=1  ==  sum=6
                sum += account;
            }

            // 1.2) sum=6 > ans=MIN_VALUE  ==  true
            // 2.2) sum=6 > ans=6  ==  false
            if (sum > ans) {

                // 1.2) sum=6  ==  ans=6
                ans = sum;
            }
        }

        // return ans = 6
        return ans;
    }
}
