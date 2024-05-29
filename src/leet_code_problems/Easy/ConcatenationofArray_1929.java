package leet_code_problems.Easy;

// https://leetcode.com/problems/concatenation-of-array/

import java.util.Arrays;

public class ConcatenationofArray_1929 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(arr1)));    // [1, 2, 1, 1, 2, 1]

        int[] arr2 = {1, 3, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(arr2)));    // [1, 3, 2, 1, 1, 3, 2, 1]
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
