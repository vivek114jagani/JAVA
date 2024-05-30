package leet_code_problems.Easy;

import java.util.HashSet;

// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class CheckIfTheSentenceIsPangram_1832 {
    public static void main(String[] args) {
        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence1));  // true

        String sentence2 = "leetcode";
        System.out.println(checkIfPangram(sentence2));  // false
    }

    public static boolean checkIfPangram(String sentence) {
//        HashSet<Character> mp = new HashSet<>();
//
//        for (int i = 0; i < sentence.length(); i++) {
//            mp.add(sentence.charAt(i));
//        }
//
//        for (char i = 'a'; i <= 'z'; i++) {
//            if (!mp.contains(i))    return false;
//        }
//
//        return true;

        return sentence.contains("a") && sentence.contains("b") && sentence.contains("c") && sentence.contains("d") &&
                sentence.contains("e") && sentence.contains("f") && sentence.contains("g") &&sentence.contains("h") &&
                sentence.contains("i") && sentence.contains("j") && sentence.contains("k") && sentence.contains("l") &&
                sentence.contains("m") && sentence.contains("n") && sentence.contains("o") && sentence.contains("p") &&
                sentence.contains("q") && sentence.contains("r") && sentence.contains("s") && sentence.contains("t") &&
                sentence.contains("u") && sentence.contains("v") && sentence.contains("w") && sentence.contains("x") &&
                sentence.contains("y") && sentence.contains("z");
    }
}
