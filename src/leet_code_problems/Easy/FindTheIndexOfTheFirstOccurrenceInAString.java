package leet_code_problems.Easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        FindTheIndexOfTheFirstOccurrenceInAString fifos = new FindTheIndexOfTheFirstOccurrenceInAString();

        // Example 1
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        int result1 = fifos.strStr(haystack1, needle1);
        System.out.println("Output for Example 1: " + result1); // Expected output: 0

        // Example 2
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        int result2 = fifos.strStr(haystack2, needle2);
        System.out.println("Output for Example 2: " + result2); // Expected output: -1
    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
