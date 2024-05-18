package Advance.CollectionsFramework.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        // Creating two List using List Interface.
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Adding Element to list1.
        list1.add(0, 10);
        list1.add(1, 20);

        // Printing list 1
        System.out.println("list1 : " + list1);

        // Adding elements to list 2
        list2.add(10);
        list2.add(20);
        list2.add(30);

        // Adding all elements of list 2 in list 1
        list1.addAll(1, list2);

        // Printing list 1
        System.out.println("list1 after added list2 : " + list1);

        // Printing list 2
        System.out.println("list2 : " + list2);

        // Removes an element from list 1 (from index 1)
        list1.remove(1);

        // Printing list 1
        System.out.println("list1 after removing an element: " + list1);

        // get() method
        System.out.println("list1 using get() : " + list1.get(2));

        // Replacing element
        list1.set(0, 50);

        // Printing the list 1
        System.out.println("list1 : " + list1);
    }
}
