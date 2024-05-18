package Advance.DataStructures;

import java.util.Hashtable;

/**The Hashtable class provides a means of organizing data based on some user-defined key structure.
 * <p>For example, in an address list hash table you could store and sort data based on a key such as ZIP code rather than on a person's name.
 * <p>The specific meaning of keys with regard to hash tables is totally dependent on the usage of the hash table and the data it contains.
 * <p>Following are the important points about Hashtable −<p>
 * {@code 1) In this any non-null object can be used as a key or as a value.}<p>
 * {@code 2) If many entries are to be made into a Hashtable, creating it with a sufficiently large capacity may allow
 * the entries to be inserted more efficiently than letting it perform automatic rehashing as needed to grow the table.}
 **/

public class HashTableDemo {
    public static void main(String[] args) {
        // Creat a HashTable.
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();

        // Populated hash table.
        hashtable.put(1, 1);
        hashtable.put(2, 2);
        hashtable.put(3, 3);

        System.out.println("Initial table elements: " + hashtable);
        System.out.println("Hash table contains 2 as value: " + hashtable.contains(2));
        System.out.println("Hash table contains 4 as value: " + hashtable.contains(4));
    }
}
