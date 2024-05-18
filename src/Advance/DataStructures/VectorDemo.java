package Advance.DataStructures;

import java.util.Enumeration;
import java.util.Vector;

/**The Vector class is similar to a traditional Java array, except that it can grow as necessary to accommodate new elements.
 * <p>Like an array, elements of a Vector object can be accessed via an index into the vector.
 * <p>The nice thing about using the Vector class is that you don't have to worry about setting it to a specific size upon creation;
 * it shrinks and grows automatically when necessary.
 * */

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector(3, 2);
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("Capacity after four additions: " + v.capacity());

        v.addElement(3.45);
        System.out.println("Current capacity: " + v.capacity());

        v.addElement(5.26);
        v.addElement(5);
        v.addElement(9.5F);
        v.addElement(10);
        System.out.println("Current capacity: " + v.capacity());

        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + v.lastElement());

        if (v.contains(3)) {
            System.out.println("Vector contains 3.");
        }

        // enumerate the elements in the vector.
        Enumeration vEnum = v.elements();
        System.out.println("\nElements in vector:");

        while (vEnum.hasMoreElements()) {
            System.out.print(vEnum.nextElement() + " ");
        }
        System.out.println();
    }
}
