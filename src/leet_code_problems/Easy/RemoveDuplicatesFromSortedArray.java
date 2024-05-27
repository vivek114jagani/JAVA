package leet_code_problems.Easy;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        // new nums[] = [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
        // newLength = 4
        int newLength = removeDuplicatesFromSortedArray.removeDuplicates(nums);

        System.out.println("The new length is: " + newLength);  // 4
        System.out.print("The modified array is: ");
        for (int i = 0; i <= newLength; i++) {       // 0 TO 4
            // 0 1 2 3 4
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;  // 1    // 2    // 3    // 4

        // nums[] = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
        // index  =  0, 1, 2, 3, 4, 5, 6, 7, 8, 9

        for (int j = 1; j < nums.length; j++) {

            // 1) nums[1]=0 != nums[0]=0  == false
            // 2) nums[2]=1 != nums[0]=0  == true
            // nums[] = [0, 1, 1, 1, 1, 2, 2, 3, 3, 4]
            // index  =  0, 1, 2, 3, 4, 5, 6, 7, 8, 9
            // 3) nums[3]=1 != nums[1]=1  == false
            // 4) nums[4]=1 != nums[1]=1  == false
            // 5) nums[5]=2 != nums[1]=1  == true
            // nums[] = [0, 1, 2, 1, 1, 2, 2, 3, 3, 4]
            // index  =  0, 1, 2, 3, 4, 5, 6, 7, 8, 9
            // 6) nums[6]=2 != nums[2]=2  ==  false
            // 7) nums[7]=3 != nums[2]=2  ==  true
            // nums[] = [0, 1, 2, 3, 1, 2, 2, 3, 3, 4]
            // index  =  0, 1, 2, 3, 4, 5, 6, 7, 8, 9
            // 8) nums[8]=3 != nums[3]=3  ==  false
            // 9) nums[9]=4 != nums[3]=3  ==  true
            // nums[] = [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
            // index  =  0, 1, 2, 3, 4, 5, 6, 7, 8, 9
            if (nums[j] != nums[i]) {

                // 2) i++ == 0+1 == 1
                // 5) i++ == 1+1 == 2
                // 7) i++ == 2+1 == 3
                // 8) i++ == 3+1 == 4
                i++;

                // 2) nums[1]=0 == nums[2]=1  ==  nums[1]=1
                // 5) nums[2]=1 == nums[5]=2  ==  nums[2]=2
                // 7) nums[3]=1 == nums[7]=3  ==  nums[3]=3
                // 9) nums[4]=1 == nums[9]=4  ==  nums[4]=4
                nums[i] = nums[j];
            }
        }
        // i == 4
        return i;
    }
}
