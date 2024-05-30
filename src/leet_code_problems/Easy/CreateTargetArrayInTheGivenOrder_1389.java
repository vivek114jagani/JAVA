package leet_code_problems.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/create-target-array-in-the-given-order/

public class CreateTargetArrayInTheGivenOrder_1389 {
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 2, 3, 4};
        int[] index1 = {0, 1, 2, 2, 1};
        // nums       index     target
        // 0            0        [0]
        // 1            1        [0,1]
        // 2            2        [0,1,2]
        // 3            2        [0,1,3,2]
        // 4            1        [0,4,1,3,2]
        System.out.println(Arrays.toString(createTargetArray(nums1, index1)));  // [0, 4, 1, 3, 2]
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }

        int[] targetArray = new int[targetList.size()];
        for (int i = 0; i < targetList.size(); i++) {
            targetArray[i] = targetList.get(i);
        }
        return targetArray;
    }
}
