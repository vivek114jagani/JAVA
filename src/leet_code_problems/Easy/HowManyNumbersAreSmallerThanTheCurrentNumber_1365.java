package leet_code_problems.Easy;

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber_1365 {
    public static void main(String[] args) {
        int[] arr1 = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr1)));   // [4, 0, 1, 1, 3]

        int[] arr2 = {6, 5, 4, 8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr2)));   // [2, 1, 0, 3]

        int[] arr3 = {7, 7, 7, 7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr3)));   // [0, 0, 0, 0]
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        1st Method.
//
//        int length = nums.length;
//        int total = 0;
//        int[] result = new int[length];
//
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length; j++) {
//                if (nums[j] < nums[i] && j != i) {
//                    total++;
//                }
//            }
//            result[i] = total;
//            total = 0;
//        }
//        return result;

//        2nd Method
        int[] sortNums = nums.clone();
        Arrays.sort(sortNums);
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = findIndex(sortNums, nums[i]);
        }
        return result;
    }

    private static int findIndex(int[] sortNums, int num) {
        int start = 0;
        int end = sortNums.length;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (sortNums[mid] < num) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
