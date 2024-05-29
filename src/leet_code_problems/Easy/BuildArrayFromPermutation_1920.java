package leet_code_problems.Easy;

import java.util.Arrays;

// https://leetcode.com/problems/build-array-from-permutation/

public class BuildArrayFromPermutation_1920 {
    public static void main(String[] args) {
        int[] arr1 = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(arr1)));  // [0, 1, 2, 4, 5, 3]

        int[] arr2 = {5, 0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(buildArray(arr2)));  // [4, 5, 0, 1, 2, 3]
    }

    public static int[] buildArray(int[] nums) {
        int length = nums.length;
        int [] arr1 = new int[length];

        for(int i=0;i<length;i++){
            arr1[i] = nums[nums[i]];
        }

        nums = arr1;
        return nums;
    }
}
