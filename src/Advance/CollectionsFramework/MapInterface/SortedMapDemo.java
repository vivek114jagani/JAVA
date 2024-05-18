package Advance.CollectionsFramework.MapInterface;

import java.util.*;

/**<a href="{@link}https://www.tutorialspoint.com/java/java_sortedmap_interface.htm">
 * SortedMap Interface reference</a><p>
 * -------------------------------------------<p>
 * The SortedMap interface extends Map. It ensures that the entries are maintained in an ascending key order.
 * <p>
 * Several methods throw a NoSuchElementException when no items are in the invoking map.
 * A ClassCastException is thrown when an object is incompatible with the elements in a map.
 * A NullPointerException is thrown if an attempt is made to use a null object when null is not allowed in the map.
 *
 * <p>
 * Advantages of SortedMap Interface<p>
 *
 * {@code 1) SortedMap ensures that the map is always sorted in ascending order of the keys.
 * Whenever a key-value pair is added to the sortedmap, it is re-sorted.}<p>
 *
 * {@code 2) Being sorted, sortedmap is very efficient in searches.
 * In the case of large read-only datasets, sortedmap is an ideal choice to be implemented.}<p>
 *
 * {@code 3) We can customize the sorting mechanism by using a comparator on the key type.}
 * <p>
 *
 * Disadvantages of SortedMap Interface
 * <p>
 * {@code 1) As a sortedmap has to be sorted every time an entry is added or changed,
 * it becomes a performance bottleneck where changes are very frequent. In such cases, sortedmap is not preferred.}<p>
 * {@code 2) As sortedMap maintains sort ability based on key, a key should be comparable and thus we cannot use a custom key if it is not implementing the comparable interface.}
 * */

public class SortedMapDemo {

    public static void main(String[] args) {

        SortedMap<String, Double> map = new TreeMap<>();

        map.put("Zara", 3434.34);
        map.put("Mahnaz", 123.22);
        map.put("Ayan", 1378.00);
        map.put("Daisy", 99.22);
        map.put("Qadir", -19.08);

        Set<Map.Entry<String, Double>> set = map.entrySet();

        Iterator<Map.Entry<String, Double>> i = set.iterator();

        while (i.hasNext()) {
            Map.Entry<String, Double> me = i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
