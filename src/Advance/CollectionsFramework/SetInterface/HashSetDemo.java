package Advance.CollectionsFramework.SetInterface;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> newset = new HashSet<>();

        newset.add(1);
        newset.add(2);
        newset.add(3);

        System.out.println("Hash set values: " + newset);
    }
}
