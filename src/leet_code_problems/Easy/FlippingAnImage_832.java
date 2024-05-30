package leet_code_problems.Easy;

// https://leetcode.com/problems/flipping-an-image/

import java.util.Arrays;

public class FlippingAnImage_832 {
    public static void main(String[] args) {
        int[][] image1 = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        System.out.println(Arrays.deepToString(flipAndInvertImage(image1)));    // First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
        // Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]] <= OUTPUT

        int[][] image2 = {
                {1, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 0, 1, 0}
        };
        System.out.println(Arrays.deepToString(flipAndInvertImage(image2)));    // First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
        // Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]] <= OUTPUT
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int i = 0; i < n; i++) {
            // Flip each row horizontally
            for (int j = 0; j < (n + 1) / 2; j++) {
                // Swap and invert the elements
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][n - 1 - j] ^ 1;
                image[i][n - 1 -j] = temp;
            }
        }
        return image;

/*
        for(int i = 0; i < image[0].length; i++){
            int left = 0;
            int right = image.length-1;
            while(left < right){
                int tmp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = tmp;
                left++;
                right--;
            }
        }
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[0].length; j++){
                if(image[i][j] == 0)
                    image[i][j] = 1;
                else image[i][j] = 0;
            }
        }
        System.gc();
        return image;
*/
    }
}
