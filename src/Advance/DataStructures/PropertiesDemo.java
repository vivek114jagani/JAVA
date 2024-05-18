package Advance.DataStructures;

import java.util.Properties;

/**Properties is a subclass of Hashtable. It is used to maintain lists of values in which the key is a String and the value is also a String.
 * <p>The Properties class is used by many other Java classes.
 * For example, it is the type of object returned by System.getProperties( ) when obtaining environmental values.
 * */

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.put("1", "I");
        properties.put("2", "AM");
        properties.put("3", "VIVEK");
        properties.put("4", "JAGANI");

        System.out.println(properties);
        System.out.println("Value1: " + properties.getProperty("1"));
        System.out.println("Value2: " + properties.getProperty("2"));
        System.out.println("Value3: " + properties.getProperty("3"));
        System.out.println("Value4: " + properties.getProperty("4"));
    }
}
