package Advance.CollectionsFramework.SetInterface;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        int[] count = {34, 22, 10, 60, 30, 22};
        Set<Integer> set = new HashSet<>();

        try {

            for (int i = 0; i < 5; i++) {
                set.add(count[i]);
            }
            System.out.println(set);

            TreeSet<Integer> sortedSet = new TreeSet<>(set);
            System.out.println("The Sorted List is:- ");
            System.out.println(sortedSet);

            System.out.println("The First element of the set is:- "+ sortedSet.first());
            System.out.println("The last element of the set is:- "+ sortedSet.last());

        } catch (Exception ignored) {}
    }
}
