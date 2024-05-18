package Advance.CollectionsFramework.MapInterface;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<Integer, Integer> treemap = new TreeMap<>();

        treemap.put(2, 2);
        treemap.put(1, 1);
        treemap.put(3, 3);
        treemap.put(6, 6);
        treemap.put(5, 5);

        System.out.println("Checking value for key 3");
        System.out.println(treemap);
        System.out.println("Value is:- "+ treemap.get(3));
    }
}
