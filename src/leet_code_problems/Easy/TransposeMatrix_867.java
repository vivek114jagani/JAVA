package leet_code_problems.Easy;

import java.util.Arrays;

// https://leetcode.com/problems/transpose-matrix/

public class TransposeMatrix_867 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(transpose(matrix1)));    // [[1, 4, 7], [2, 5, 8], [3, 6, 9]]

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(Arrays.deepToString(transpose(matrix2)));    // [[1, 4], [2, 5], [3, 6]]
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }
}
