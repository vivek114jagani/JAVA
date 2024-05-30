package leet_code_problems.Easy;

// https://leetcode.com/problems/count-items-matching-a-rule/

import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingARule_1773 {
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        );

        String ruleKey1 = "color";
        String ruleValue1 = "silver";
        System.out.println(countMatches(items, ruleKey1, ruleValue1)); // Output: 1

        String ruleKey2 = "type";
        String ruleValue2 = "phone";
        System.out.println(countMatches(items, ruleKey2, ruleValue2)); // Output: 2
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index;

        switch (ruleKey) {
            case "type" -> index = 0;
            case "color" -> index = 1;
            case "name" -> index = 2;
            default -> throw new IllegalArgumentException("Invalid ruleKey: " + ruleKey);
        }

        for(List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
