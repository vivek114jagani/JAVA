package leet_code_problems.Easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        PlusOne plusOne = new PlusOne();

        // Example 1 :-
        int[] digits1 = {1, 2, 3};
        int[] result1 = plusOne.plusOne(digits1);   // result1[] = [1, 2, 4]
        System.out.println(Arrays.toString(result1));   //  [1, 2, 4]

//        // Example 2 :-
//        int[] digits2 = {4, 3, 2, 1};
//        int[] result2 = plusOne.plusOne(digits2);
//        System.out.println(Arrays.toString(result2));

        // Example 3 :-
        int[] digits3 = {9};
        int[] result3 = plusOne.plusOne(digits3);   // result3[] = [1, 0]
        System.out.println(Arrays.toString(result3));   // [1, 0]

        // Example 4 :-
        int[] digits4 = {4, 5, 9};
        int[] result4 = plusOne.plusOne(digits4);   // result4[] = [4, 6, 0]
        System.out.println(Arrays.toString(result4));   // [4, 6, 0]
    }

    public int[] plusOne(int[] digits) {

        // 1) digits[] = [1, 2, 3]
        // 1) index    =  0, 1, 2

        // 2) digits[] = [9]
        // 2) index    =  0

        // 3) digits[] = [4, 5, 9]
        // 3) index    =  0, 1, 2

        // 1) i=digits,length-1 = 2    2>=0  ==  true
        // 2) i=digits,length-1 = 0    0>=0  ==  true
        // 3) i=digits,length-1 = 2    2>=0  ==  true
        // digits[] = [4, 5, 0]
        // index    =  0, 1, 2
        // i--  ==  2-1 = 1
        // 3.1) i=digits,length-1 = 1    1>=0  ==  true
        for(int i = digits.length - 1; i >= 0; i--) {

            // 1) digits[2]=3 < 9  ==  true
            // 2) digits[0]=9 < 9  ==  false
            // 3) digits[2]=9 < 9  ==  false
            // 3.1) digits[1]=5 < 9  ==  true
            if(digits[i] < 9) {

                // 1) digits[2]=3++  ==  4  ==  digits[2]=4
                // 3.1) digits[1]=5++  ==  6  ==  digits[1]=6
                digits[i]++;

                // 1) digits[] = [1, 2, 4]
                // 3.1) digits[] = [4, 6, 0]
                return digits;
            }

            // 2) digits[0]=9 = 0  ==  digits[0]=0
            // 3) digits[2]=9 = 0  ==  digits[2]=9
            digits[i] = 0;
        }

        // 2) [digits.length+1]=[1+1]=[2] ==  result[]=[0, 0]
        int[] result = new int[digits.length + 1];

        // 2) result[0] = 1  ==  result[1, 0]
        result[0] = 1;

        // 2) result[] = [1, 0]
        return result;
    }
}
