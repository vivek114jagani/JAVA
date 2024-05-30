package leet_code_problems.Easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

public class KidsWithTheGreatestNumberofCandies_1431 {
    public static void main(String[] args) {
        int[] candies1 = {2, 3, 5, 1, 3};
        int extraCandies1 = 3;
        System.out.println(kidsWithCandies(candies1, extraCandies1));    // [true, true, true, false, true]

        int[] candies2 = {4, 2, 1, 1, 2};
        int extraCandies2 = 1;
        System.out.println(kidsWithCandies(candies2, extraCandies2));    // [true, false, false, false, false]

        int[] candies3 = {12, 1, 12};
        int extraCandies3 = 10;
        System.out.println(kidsWithCandies(candies3, extraCandies3));    // [true, false, true]
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // In this program i have used to Greedy Algorithm to solve this problem

        // Step 1: Find the maximum number of candies any kid has
        int maxCandie = Integer.MIN_VALUE;
        for (int candy : candies) {
            // maxCandie = Math.max(candy, maxCandie);
            if (candy > maxCandie) {
                maxCandie = candy;
            }
        }

        // Step 2: Create the result list
        List<Boolean> result = new ArrayList<>();

        // Step 3: Check for each kid if they can have the greatest number of candies
        for (int candy : candies) {
            // result.add(candy + extraCandies >= maxCandie);
            int sum = candy + extraCandies;
            if(sum >= maxCandie) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        // Step 4: Return the result list
        return result;
    }
}
