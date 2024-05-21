package Advance;

/*Streams were introduced in Java to help developers perform aggregate operations from a sequence of objects.
 * With Java 9, few more methods are added to make streams better.
 * */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Stream.of("a", "b", "c", "", "e", "f").takeWhile(s -> !s.isEmpty())
                .forEach(System.out::print);

        System.out.println();
        System.out.println();

        Stream.of("a", "b", "c", "", "e", "f").dropWhile(s -> !s.isEmpty())
                .forEach(System.out::print);

        System.out.println();

        Stream.of("a", "b", "c", "", "e", "", "f").dropWhile(s -> !s.isEmpty())
                .forEach(System.out::print);

        System.out.println();
        System.out.println();

        IntStream.iterate(3, x -> x < 10, x -> x + 3).forEach(System.out::println);

        System.out.println();

        long count = Stream.ofNullable(100).count();
        System.out.println(count);

        count = Stream.ofNullable(null).count();
        System.out.println(count);

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Using JAVA 7: ");

        // Count empty strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        System.out.println("List: " + strings);

        long count1 = getCountEmptyStringUsingJava7(strings);
        System.out.println("Empty Strings: " + count1);

        count1 = getCountLength3UsingJava7(strings);
        System.out.println("Strings of length 3: " + count1);

        System.out.println("*********************************************************");

        //Eliminate empty string
        List<String> filtered = deleteEmptyStringUsingJava7(strings);
        System.out.println("Filtered List: " + filtered);

        System.out.println("*********************************************************");

        //Eliminate empty string and join using comma.
        String mergeString = getMergedStringUsingJava7(strings);
        System.out.println("Merged String: " + mergeString);

        System.out.println("*********************************************************");

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        //get list of square of distinct numbers
        List<Integer> squaresList = getSquares(numbers);
        System.out.println("Squares List: " + squaresList);

        System.out.println("*********************************************************");

        List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);

        System.out.println("List : " + integers);
        System.out.println("Highest number in List : " + getMax(integers));
        System.out.println("Lowest number in List : " + getMin(integers));
        System.out.println("Sum of all numbers : " + getSum(integers));
        System.out.println("Average of All Numbers : " + getAverage(integers));

        System.out.println("*********************************************************");

        System.out.println("Random Numbers: ");
        //print ten random numbers
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("Using Java 8: ");
        System.out.println("List: " +strings);

        count1 = strings.stream().filter(String::isEmpty).count();
        System.out.println("Empty Strings: " + count1);

        count1 = strings.stream().filter(string -> string.length() == 3).count();
        System.out.println("Strings of length 3: " + count1);

        System.out.println("*********************************************************");

        filtered = strings.stream().filter(string ->!string.isEmpty()).toList();
        System.out.println("Filtered List: " + filtered);

        System.out.println("*********************************************************");

        mergeString = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergeString);

        System.out.println("*********************************************************");

        squaresList = numbers.stream().map( i ->i*i).distinct().toList();
        System.out.println("Squares List: " + squaresList);

        System.out.println("*********************************************************");

        System.out.println("List: " +integers);

        IntSummaryStatistics stats = integers.stream().mapToInt((x) ->x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
        System.out.println("Random Numbers: ");

        System.out.println("*********************************************************");

        System.out.println("Random Numbers: ");
        random.ints().limit(10).sorted().forEach(System.out::println);

        System.out.println("*********************************************************");

        //parallel processing
        count1 = strings.parallelStream().filter(String::isEmpty).count();
        System.out.println("Empty Strings: " + count1);
    }

    private static int getCountEmptyStringUsingJava7(List<String> strings) {
        int count = 0;
        for (String string : strings) {
            if (string.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    private static int getCountLength3UsingJava7(List<String> strings) {
        int count = 0;
        for (String string : strings) {
            if (string.length() == 3) {
                count++;
            }
        }
        return count;
    }

    private static List<String> deleteEmptyStringUsingJava7(List<String> strings) {
        List<String> filteredList = new ArrayList<>();
        for (String string : strings) {
            if (!string.isEmpty()) {
                filteredList.add(string);
            }
        }
        return filteredList;
    }

    private static String getMergedStringUsingJava7(List<String> strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for(String string: strings) {
            if(!string.isEmpty()) {
                stringBuilder.append(string);
                stringBuilder.append(", ");
            }
        }
        String mergedString = stringBuilder.toString();
        return mergedString.substring(0, mergedString.length()-2);
    }

    private static List<Integer> getSquares(List<Integer> numbers) {
        List<Integer> squaresList = new ArrayList<>();
        for(Integer number: numbers) {
            Integer square = number * number;
            if(!squaresList.contains(square)) {
                squaresList.add(square);
            }
        }
        return squaresList;
    }

    private static int getMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++) {
            Integer number = numbers.get(i);
            if(number > max) {
                max = number;
            }
        }
        return max;
    }

    private static int getMin(List<Integer> numbers) {
        int min = numbers.get(0);
        for(int i= 1;i < numbers.size();i++) {
            Integer number = numbers.get(i);
            if(number < min) {
                min = number;
            }
        }
        return min;
    }

    private static int getSum(List numbers) {
        int sum = (int)(numbers.get(0));
        for(int i = 1;i < numbers.size();i++) {
            sum += (int)numbers.get(i);
        }
        return sum;
    }

    private static int getAverage(List<Integer> numbers) {
        return getSum(numbers) / numbers.size();
    }
}
