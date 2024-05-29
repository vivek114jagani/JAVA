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
        int ans = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            int sum = 0;
            for (int account : person) {
                sum += account;
            }

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
