package leet_code_problems.Easy;

// https://leetcode.com/problems/sqrtx/

public class Sqrtx_69 {
    public static void main(String[] args) {
        Sqrtx_69 sqrtx = new Sqrtx_69();

        int x1 = 4;
        System.out.println(sqrtx.mySqrt(x1));   // 2

        int x2 = 8;
        System.out.println(sqrtx.mySqrt(x2));   // 2
    }

    public int mySqrt(int x) {

        // 1) x = 4
        // 2) x = 8

        // 1) x=4 < 2  ==  false
        // 2) x=8 < 2  ==  false
        if (x < 2) {
            return x;
        }

        int left = 1;   // 1) left=1    // left=2
        // 2) left=1    // left=3

        int right = x / 2;  // 1) x=4 / 2  ==  right=2
        // 2) x=8 / 2  ==  right=4  // right=2

        // 1) left=1 <= right=2  ==  true
        // 1.1) left=2 <= right=2  ==  true
        // -------------------------------------------------------------
        // 2) left=1 <= right=4  ==  true
        // 2.1) left=3 <= right=4  ==  true
        // 2.2) left=3 <= right=2  ==  false
        while (left <= right) {

            // 1) left=1 + (right=2 - left=1) / 2  ==  mid=1
            // 1.1) left=2 + (right=2 - left=2) / 2  ==  mid=2
            // -------------------------------------------------------------
            // 2) left=1 + (right=4 - left=1) / 2  ==  mid=2
            // 2.1) left=3 + (right=4 - left=3) / 2  ==  mid=3
            int mid = left + (right - left) / 2;

            // 1) mid=1 * mid=1  ==  square=1
            // 1.1) mid=2 * mid=2  ==  square=4
            // -------------------------------------------------------------
            // 2) mid=2 * mid=2  ==  square=4
            // 2.1) mid=3 * mid=3  ==  square=9
            long square = (long) mid * mid;

            // 1) square=1 == x=4   ==   false
            // 1.1) square=4 == x=4   ==   true
            // -------------------------------------------------------------
            // 2) square=4 == x=8   ==   false
            // 2.1) square=9 == x=8   ==   false
            if (square == x) {

                // return mid=2
                return mid;
            }

            // 1) square=1 < x=4  ==  true
            // -------------------------------------------------------------
            // 2) square=4 < x=8  ==  true
            // 2.1) square=9 < x=8  ==  false
            else if (square < x) {

                // 1) mid=1 + 1  ==  left=2
                // -------------------------------------------------------------
                // 2) mid=2 + 1  ==  left=3
                left = mid + 1;
            } else {

                // 2.1) mid=3 - 1  ==  right=2
                right = mid - 1;
            }
        }

        // 2.2) return right=2
        return right;
    }
}
