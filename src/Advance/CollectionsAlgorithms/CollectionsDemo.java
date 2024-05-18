package Advance.CollectionsAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println("Initial collection value: " + list);
        // add values to this collection
        Collections.addAll(list, 6, 7, 8);
        System.out.println("Final collection value: "+list);
    }
}
