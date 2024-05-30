package leet_code_problems.Easy;

public class MatrixDiagonalSum_1572 {
    public static void main(String[] args) {
        int[][] indices1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(diagonalSum(indices1));   // 25

        int[][] indices2 = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        System.out.println(diagonalSum(indices2));   // 8

        int[][] indices3 = {
                {5}
        };
        System.out.println(diagonalSum(indices3));   // 5
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j || (i + j) == mat.length - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
