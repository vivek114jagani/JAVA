package Basics;

import java.util.Arrays;
import java.util.List;

public class For_each_loop {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("James", "Larry", "Tom", "Lacy");

        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }
    }
}
