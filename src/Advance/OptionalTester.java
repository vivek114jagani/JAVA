package Advance;

import java.util.Optional;

public class OptionalTester {
    public static void main(String[] args) {
        Integer value1 = null;
        Integer value2 = 10;

        // Optional.empty - return an empty optional object
        Optional<Integer> empty = Optional.empty();

        //Optional.ofNullable - allows passed parameter to be null.
        Optional<Integer> a = Optional.ofNullable(value1);

        //Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.of(value2);

        System.out.println("value of a: " + (a.isPresent() ? a.get(): "0"));
        System.out.println("value of b: " +  (b.isPresent() ? b.get(): "0"));
        System.out.println("value of empty: " +  (empty.isPresent() ? empty.get(): "0"));
    }
}
