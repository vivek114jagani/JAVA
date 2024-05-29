package leet_code_problems.Easy;

// https://leetcode.com/problems/palindrome-number/

public class PalindromeNumber_9 {

    public static void main(String[] args) {
        // Example 1
        int x1 = 121;
        System.out.println("Example 1: " + isPalindrome(x1)); // true

        // Example 2
        int x2 = -121;
        System.out.println("Example 2: " + isPalindrome(x2)); // false

        // Example 3
        int x3 = 10;
        System.out.println("Example 3: " + isPalindrome(x3)); // false
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
}
