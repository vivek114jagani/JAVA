package Advance.MethodReference;

import java.util.Arrays;
import java.util.List;

public class Instance {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,4,9,8,7,3);
        System.out.println("Sorted using lambda expression");
        numbers = numbers.stream().sorted((a,b) -> a.compareTo(b)).toList();

        System.out.println(numbers);

        numbers = Arrays.asList(1,2,4,9,8,7,3);
        System.out.println("Sorted using method reference" );
        numbers = numbers.stream().sorted(Integer::compareTo).toList();

        System.out.println(numbers);
    }
}

