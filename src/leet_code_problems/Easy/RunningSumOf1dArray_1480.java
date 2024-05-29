package leet_code_problems.Easy;

import java.util.Arrays;

// https://leetcode.com/problems/running-sum-of-1d-array/

public class RunningSumOf1dArray_1480 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(arr1)));  // [1, 3, 6, 10]

        int[] arr2 = {1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(runningSum(arr2)));  // [1, 2, 3, 4, 5]


        int[] arr3 = {3, 1, 2, 10, 1};
        System.out.println(Arrays.toString(runningSum(arr3)));  // [3, 4, 6, 16, 17]
    }

    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }

        return runningSum;
    }
}
