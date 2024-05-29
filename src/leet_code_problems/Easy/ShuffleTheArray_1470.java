package leet_code_problems.Easy;

import java.util.Arrays;

// https://leetcode.com/problems/shuffle-the-array/

public class ShuffleTheArray_1470 {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 1, 3, 4, 7};
        int n1 = 3;
        System.out.println(Arrays.toString(shuffle(arr1, n1)));  // [2, 3, 5, 4, 1, 7]

        int[] arr2 = {1, 2, 3, 4, 4, 3, 2, 1};
        int n2 = 4;
        System.out.println(Arrays.toString(shuffle(arr2, n2)));  // [1, 4, 2, 3, 3, 2, 4, 1]

        int[] arr3 = {1, 1, 2, 2};
        int n3 = 2;
        System.out.println(Arrays.toString(shuffle(arr3, n3)));  // [1, 2, 1, 2]
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }

        return result;
    }
}
