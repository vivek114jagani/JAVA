package leet_code_problems.Easy;

// https://leetcode.com/problems/number-of-good-pairs/

public class NumberofGoodPairs_1512 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums1)); // 4

        int[] nums2 = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(nums2)); // 6

        int[] nums3 = {1, 2, 3};
        System.out.println(numIdenticalPairs(nums3)); // 0
    }

    public static int numIdenticalPairs(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    result++;
                }
            }
        }
        return result;
    }
}
