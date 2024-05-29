package leet_code_problems.Easy;

// https://leetcode.com/problems/remove-element/

public class RemoveElement_27 {
    public static void main(String[] args) {

        RemoveElement_27 removeElement = new RemoveElement_27();

        // Example 1:-
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        // new nums[] = [2, 2, 2, 3]
        // k1 = 2
        int k1 = removeElement.removeElement(nums1, val1);
        System.out.println("The new length is: " + k1); // 2
        System.out.print("The modified array is: ");
        for (int i = 0; i < k1; i++) {  // 0 TO 2
            // 2, 2
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        // Example 2:-
//        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
//        int val2 = 2;
//        int k2 = removeElement.removeElement(nums2, val2);
//        System.out.println("The new length is: " + k2);
//        System.out.print("The modified array is: ");
//        for (int i = 0; i < k2; i++) {
//            System.out.print(nums2[i] + " ");
//        }
//        System.out.println();
    }

    public int removeElement(int[] nums, int val) {
        int k = 0;  // 1    // 2

        // val = 3
        // nums[] = [3, 2, 2, 3]
        // index  =  0, 1, 2, 3

        for(int i = 0; i < nums.length; i++) {

            // 1) nums[0]=3 != val=3  ==  false
            // 2) nums[1]=2 != val=3  == true
            // nums[] = [2, 2, 2, 3]
            // index  =  0, 1, 2, 3
            // 3) nums[2]=2 != val=3  ==  true
            // nums[] = [2, 2, 2, 3]
            // index  =  0, 1, 2, 3
            // 4) nums[3]=3 != val=3  ==  false
            if(nums[i] != val) {

                // 2) nums[0] = nums[1]=2  == nums[0]=2
                // 3) nums[1] = nums[2]=2  == nums[1]=2
                nums[k] = nums[i];

                // k++ == 0+1=1
                // k++ == 1+1=2
                k++;
            }
        }
        // k == 2
        return k;
    }
}
