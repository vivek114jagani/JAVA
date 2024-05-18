package Advance.CollectionsFramework.MapInterface;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> newmap = new LinkedHashMap<>();

        newmap.put(1, "Vivek");
        newmap.put(2, "Jay");
        newmap.put(3, "Tejas");

        System.out.println("Initial map elements:- " + newmap);

        System.out.println("Value:- " + newmap.get(1));
    }
}
