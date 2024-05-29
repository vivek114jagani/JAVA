package leet_code_problems.Easy;

// https://leetcode.com/problems/climbing-stairs/

public class ClimbingStairs_70 {

    public static void main(String[] args) {
        ClimbingStairs_70 climbingStairs = new ClimbingStairs_70();

        System.out.println(climbingStairs.climbStairs(2));
        System.out.println(climbingStairs.climbStairs(3));
    }

    public int climbStairs(int n) {
//        if(n == 0 || n == 1) {
//            return 1;
//        }
//        return climbStairs(n - 1) + climbStairs(n - 2);

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }
}
