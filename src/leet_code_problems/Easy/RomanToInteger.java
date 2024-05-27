package leet_code_problems.Easy;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the roman numbers :- ");
        String romannumbers = input.nextLine();
        System.out.println(romanToInt(romannumbers));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int n = s.length();

        int num = roman.get(s.charAt(n-1));

        for(int i = n - 2; i >= 0; i--){
            if(roman.get(s.charAt(i)) >= roman.get(s.charAt(i + 1))){
                num += roman.get(s.charAt(i));
            } else{
                num -= roman.get(s.charAt(i));
            }
        }
        return num;
    }
}
