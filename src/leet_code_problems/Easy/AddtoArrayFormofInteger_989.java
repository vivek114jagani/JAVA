package leet_code_problems.Easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/add-to-array-form-of-integer/

public class AddtoArrayFormofInteger_989 {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 0, 0};
        int k1 = 34;
        System.out.println(addToArrayForm(num1, k1));   // 1200 + 34 = 1234 // [1, 2, 3, 4]

        int[] num2 = {2, 7, 4};
        int k2 = 181;
        System.out.println(addToArrayForm(num2, k2));   // 274 + 181 = 455  // [4, 5, 5]

        int[] num3 = {2, 1, 5};
        int k3 = 806;
        System.out.println(addToArrayForm(num3, k3));   // 215 + 806 = 1021 // [1, 0, 2, 1]
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int n = num.length;

        for (int i = n - 1; i >= 0 || k > 0; i--) {
            if (i >= 0) {
                k += num[i];
            }

            result.add(0, k % 10);
            k /= 10;
        }

        return result;
    }
}
