package Advance.DataStructures;

import java.util.Enumeration;
import java.util.Vector;

/**The Enumeration interface isn't itself a data structure, but it is very important within the context of other data structures.
 * The Enumeration interface defines a means to retrieve successive elements from a data structure.
 * <p>For example, Enumeration defines a method called nextElement that is used to get the next element in a data structure that contains multiple elements.
 * */

public class EnumerationDemo {
    public static void main(String[] args) {

        Enumeration<String> days;
        Vector<String> dayNames = new Vector<>();

        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();

        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }

    }
}
