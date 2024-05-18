package Advance.DataStructures;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

/**The Dictionary class is an abstract class that defines a data structure for mapping keys to values.
 * <p>This is useful in cases where you want to be able to access data via a particular key rather than an integer index.
 * <p>Since the Dictionary class is abstract, it provides only the framework for a key-mapped data structure rather than a specific implementation.
 * <p>Following are the important points about Dictionary −<p>
 * {@code 1) In this class every key and every value is an object.}<p>
 * {@code 2) In his class object every key is associated with at most one value.}*/

public class DictionaryDemo {
    public static void main(String[] args) {
        // Creat a new hash table.
        Dictionary<Integer, Integer> dictionary = new Hashtable<>();

        // add 2 element.
        dictionary.put(1, 1);
        dictionary.put(2, 2);
        dictionary.put(3, 3);


        Enumeration<Integer> enumeration = dictionary.keys();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
