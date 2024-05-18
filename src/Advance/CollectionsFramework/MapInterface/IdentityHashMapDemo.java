package Advance.CollectionsFramework.MapInterface;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

    public static void main(String[] args) {
        IdentityHashMap<Integer,Integer> newmap = new IdentityHashMap<>();

        newmap.put(1, 1);
        newmap.put(2, 2);
        newmap.put(3, 3);

        System.out.println("Map elements: " + newmap);
    }
}
