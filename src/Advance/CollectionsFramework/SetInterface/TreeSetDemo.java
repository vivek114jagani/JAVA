package Advance.CollectionsFramework.SetInterface;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> treeset = new TreeSet<>();

        treeset.add(12);
        treeset.add(13);
        treeset.add(14);
        treeset.add(15);

        System.out.print("Tree set : " + treeset);
    }
}
