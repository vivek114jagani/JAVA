package Advance.MethodReference;

import java.util.ArrayList;
import java.util.List;

public class Static {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        System.out.println("Printing using for each loop");
        // Approach 1: for loop to print all elements
        for (String name: names) {
            System.out.println(name);
        }

        System.out.println("Printing using for each loop with lambda expression");
        // Approach 2: lambda expression to print the elements in for each loop
        names.forEach(s->System.out.println(s));

        System.out.println("Printing using for each loop with method reference" );
        // Approach 3: Method reference to print elements in for each loop
        names.forEach(System.out::println);
    }
}
