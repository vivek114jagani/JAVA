package Advance.TeeingCollectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        // 'Stream.of(1, 2, 3, 4, 5, 6, 7)' yeh ek stream banata hai in integers ka: 1, 2, 3, 4, 5, 6, 7.
        double mean = Stream.of(1, 2, 3, 4, 5, 6, 7)
                .collect(
                        /* 'Collectors.teeing( ... )' yeh ek special collector hai jo do alag collectors ko combine karta hai
                        aur unka result ek custom operation mein use karta hai.*/
                        Collectors.teeing(
                            /* 'Collectors.summingDouble(i -> i)' yeh collector stream ke sabhi elements ka sum calculate karta hai.
                            'i -> i' ek lambda expression hai jo stream ke har element ko double mein convert karta hai
                            (yaha pe unnecessary hai kyunki elements already integers hain). */
                            Collectors.summingDouble(i -> i),
                            // 'Collectors.counting()' yeh collector stream ke elements ko count karta hai.
                            Collectors.counting(),
                            /*'(sum, n) -> sum / n' yeh lambda expression do results (sum aur count) ko combine karta hai.
                            Yeh sum ko count se divide karke mean (average) calculate karta hai.*/
                            (sum, n) -> sum / n));

        System.out.println(mean);
    }
}
