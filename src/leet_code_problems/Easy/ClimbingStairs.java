package leet_code_problems.Easy;

public class ClimbingStairs {

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();

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
