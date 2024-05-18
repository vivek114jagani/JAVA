package Advance.CollectionsAlgorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        al.add("A");
        al.add("F");
        al.add("J");
        al.add("R");
        al.add("K");

        System.out.print("Original contents of al: ");
        Iterator<String> itr = al.iterator();

        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Modify objects being iterated
        ListIterator<String> litr = al.listIterator();

        while(litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + "+");
        }
        System.out.print("Modified contents of al: ");
        itr = al.iterator();

        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Now, display the list backwards
        System.out.print("Modified list backwards: ");

        while(litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
