package leet_code_problems.Easy;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class FindNumberswithEvenNumberofDigits_1295 {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));  // 2
    }

    public static int findNumbers(int[] nums) {
        // nums = [12, 345, 2, 6, 7896]

        int count = 0;  // 1    // 2

        // 1) num=12 : nums[12, 345, 2, 6, 7896]
        // 2) num=345 : nums[12, 345, 2, 6, 7896]
        // 3) num=2 : nums[12, 345, 2, 6, 7896]
        // 4) num=6 : nums[12, 345, 2, 6, 7896]
        // 5) num=7896 : nums[12, 345, 2, 6, 7896]
        for(int num : nums) {

            // 1) even(num=12)  ==  true
            // 2) even(num=345)  ==  false
            // 3) even(num=2)  ==  false
            // 4) even(num=6)  ==  false
            // 5) even(num=7896)  ==  true
            if (even(num)) {

                // 1) count++ = 0+1  ==  count=1
                // 5) count++ = 1+1  ==  count=2
                count++;
            }
        }

        // return count=2
        return count;
    }

    // function to check whether a number contains even digits or not
    private static boolean even(int num) {
        // 1) num = 12
        // 2) num = 345
        // 3) num = 2
        // 4) num = 6
        // 5) num = 7896

        // 1) numberOfDigits = 2
        // 2) numberOfDigits = 3
        // 3) numberOfDigits = 1
        // 4) numberOfDigits = 1
        // 5) numberOfDigits = 4
        int numberOfDigits = digits(num);

        // 1) numberOfDigits=2 % 2 == 0  ==  return true
        // 2) numberOfDigits=3 % 2 == 0  ==  return false
        // 3) numberOfDigits=1 % 2 == 0  ==  return false
        // 4) numberOfDigits=1 % 2 == 0  ==  return false
        // 5) numberOfDigits=4 % 2 == 0  ==  return true
        return numberOfDigits % 2 == 0;
    }

    // count number of digits in a number
    private static int digits(int num) {
        // 1) num = 12
        // 2) num = 345
        // 3) num = 2
        // 4) num = 6
        // 5) num = 7896

        // 1) num=12 < 0  ==  false
        // 2) num=345 < 0  ==  false
        // 3) num=2 < 0  ==  false
        // 4) num=6 < 0  ==  false
        // 5) num=7896 < 0  ==  false
        if (num < 0) {
            num *= -1;
        }

        // 1) (int)(Math.log10(num=12))+1  ==  return 2
        // 2) (int)(Math.log10(num=345))+1  ==  return 3
        // 3) (int)(Math.log10(num=2))+1  ==  return 1
        // 4) (int)(Math.log10(num=6))+1  ==  return 1
        // 5) (int)(Math.log10(num=7896))+1  ==  return 4
        return (int)(Math.log10(num)) + 1;
    }
}
