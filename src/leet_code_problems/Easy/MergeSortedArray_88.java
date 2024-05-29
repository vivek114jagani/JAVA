package leet_code_problems.Easy;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/

public class MergeSortedArray_88 {

    public static void main(String[] args) {
        MergeSortedArray_88 mergeSortedArray = new MergeSortedArray_88();

        // Example 1 :-
        int[] nums1_1 = {1, 2, 3, 0, 0, 0};
        int m1 = 3;
        int[] nums2_1 = {2, 5, 6};
        int n1 = 3;
        mergeSortedArray.merge(nums1_1, m1, nums2_1, n1);
        System.out.println(Arrays.toString(nums1_1));

        // Example 2 :-
        int[] nums1_2 = {1};
        int m2 = 1;
        int[] nums2_2 = {};
        int n2 = 0;
        mergeSortedArray.merge(nums1_2, m2, nums2_2, n2);
        System.out.println(Arrays.toString(nums1_2));

        // Example 3 :-
        int[] nums1_3 = {0};
        int m3 = 0;
        int[] nums2_3 = {1};
        int n3 = 1;
        mergeSortedArray.merge(nums1_3, m3, nums2_3, n3);
        System.out.println(Arrays.toString(nums1_3));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;

        while (i >= 0 || j >= 0) {
            if (j < 0 || (i >= 0 && nums1[i] >= nums2[j])) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
