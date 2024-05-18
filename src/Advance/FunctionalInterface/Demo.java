package Advance.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEvenNumber = n -> n % 2 == 0;
        numbers = numbers.stream().filter(isEvenNumber).toList();

        System.out.println(numbers);
    }
}
