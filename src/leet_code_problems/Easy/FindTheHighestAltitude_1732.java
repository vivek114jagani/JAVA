package leet_code_problems.Easy;

// https://leetcode.com/problems/find-the-highest-altitude/

public class FindTheHighestAltitude_1732 {
    public static void main(String[] args) {
        int[] gain1 = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain1)); // [0,-5,-4,1,1,-6] // Output: 1

        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};
        System.out.println(largestAltitude(gain2)); // [0,-4,-7,-9,-10,-6,-3,-1]    // Output: 0
    }

    public static int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;

        for (int i : gain) {
            currentAltitude += i;

            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }
        return maxAltitude;
    }
}
