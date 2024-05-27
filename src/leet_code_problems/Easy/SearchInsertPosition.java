package leet_code_problems.Easy;

public class SearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPosition sip = new SearchInsertPosition();

        // Example 1:-
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        int result1 = sip.searchInsert(nums1, target1);     // result1 = 2
        System.out.println("Output for Example 1: " + result1); // Expected output: 2

//        // Example 2
//        int[] nums2 = {1, 3, 5, 6};
//        int target2 = 2;
//        int result2 = sip.searchInsert(nums2, target2);
//        System.out.println("Output for Example 2: " + result2); // Expected output: 1
//
//        // Example 3
//        int[] nums3 = {1, 3, 5, 6};
//        int target3 = 7;
//        int result3 = sip.searchInsert(nums3, target3);
//        System.out.println("Output for Example 3: " + result3); // Expected output: 4
    }

    public int searchInsert(int[] nums, int target) {
        // target = 5
        // nums[] = [1, 3, 5, 6]
        // index  =  0, 1, 2, 3

        int left = 0, right = nums.length - 1;      // right = 4 - 1  ==  3

        // 1) left=0 <= right=3  ==  true
        while (left <= right) {
            // 1) left=0 + (right=3 - left=0) / 2  ==  mid=1
            int mid = left + (right - left) / 2;

            // 1) nums[mid=1] == 5  ==  false
            if (nums[mid] == target) {
                return mid;
            }

            // 1) nums[mid=1] < 5  ==  true
            else if (nums[mid] < target) {
                // 1) mid=1 + 1  ==  left=2
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // left = 2
        return left;
    }
}
