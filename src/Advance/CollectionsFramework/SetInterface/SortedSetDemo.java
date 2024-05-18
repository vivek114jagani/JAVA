package Advance.CollectionsFramework.SetInterface;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

    public static void main(String[] args) {

        SortedSet<String> set = new TreeSet<>();

        set.add("b");
        set.add("c");
        set.add("a");
        set.add("d");
        set.add("e");
        set.add("f");

        System.out.println(set);

        set.remove("c");
        set.remove("f");

        Iterator it = set.iterator();

        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(element.toString());
        }

        set.clear();

        System.out.println(set);
    }
}
