package leet_code_problems;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many String insert into the array :- ");
        int n = input.nextInt();
        input.nextLine();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter string " + (i + 1) + ":- ");
            arr[i] = input.nextLine();
        }

        System.out.println("Longest Common Prefix is :- " + longestCommonPrefix(arr));
    }

    /*
    * Certainly! This Java code defines a function named longestCommonPrefix that takes an array of strings (strs)
    * as input and returns the longest common prefix among those strings.
    *
    *  Here's a step-by-step explanation of the code:
    *
    * 1. The function first checks if the input array strs is either null or empty (i.e., it has a length of 0).
    *    If strs is null or empty, it immediately returns an empty string "" because there is no common prefix to find.
    *
    * 2. If strs is not null and has at least one string, it initializes the prefix variable with the first string
    *    in the array (i.e., strs[0]). This is done because we'll start comparing the other strings to this initial prefix.
    *
    * 3. The function then enters a loop that iterates over the rest of the strings in the strs array (starting from
    *    index 1). It uses a for loop with an iterator i to do this.
    *
    * 4. Inside the loop, the code uses a while loop to compare the current string strs[i] with the current prefix.
    *    It does this by checking whether the prefix is a prefix of the current string using the indexOf method.
    *    The indexOf method returns the starting index of the substring in the given string, and if the substring is
    *    not found, it returns -1.
    *
    * 5. If the indexOf method returns a value other than 0, it means that the prefix is not a prefix of the current
    *    string. In this case, the code enters the while loop, which does the following:
    *       i. It shortens the prefix by removing the last character using substring(0, prefix.length() - 1).
    *       ii. If the prefix becomes an empty string (i.e., prefix.isEmpty() returns true), it means there is no
    *           common prefix, and the function returns an empty string "".
    *
    * 6. If the prefix is a valid prefix for the current string, the loop continues to the next string in the array,
    *    and the process repeats.
    *
    * 7. Once the loop finishes, the function returns the prefix, which is the longest common prefix among all the
    *    strings in the strs array.
    *
    * In essence, this code iterates through the strings in the array and keeps reducing the prefix until it finds the
    * longest common prefix among all the strings or determines that there is no common prefix.
    * */
    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
