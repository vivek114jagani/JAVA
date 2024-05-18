package Advance.CollectionsFramework.SetInterface;

import java.util.LinkedHashSet;
import java.util.Spliterator;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<Integer> newset = new LinkedHashSet<>();

        newset.add(1);
        newset.add(2);
        newset.add(3);

        Spliterator<Integer> spliterator = newset.spliterator();

        spliterator.forEachRemaining(v -> System.out.println(v));
    }
}
