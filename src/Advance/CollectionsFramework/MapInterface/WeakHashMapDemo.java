package Advance.CollectionsFramework.MapInterface;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) {
        WeakHashMap<Integer, String> newmap = new WeakHashMap<>();

        newmap.put(1, "Vivek");
        newmap.put(2, "Jay");
        newmap.put(3, "Tejas");

        System.out.println("Map elements: " + newmap);
    }
}
