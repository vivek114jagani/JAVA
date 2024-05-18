package Advance.CollectionsFramework.MapInterface;

import java.util.EnumMap;

public class EnumMapDemo {

    public enum NUMBERS{ONE, TWO, THREE, FOUR, FIVE}

    public static void main(String[] args) {

        EnumMap<NUMBERS, String> map = new EnumMap<>(NUMBERS.class);

        map.put(NUMBERS.ONE, "one");
        map.put(NUMBERS.TWO, "two");
        map.put(NUMBERS.THREE, "three");
        map.put(NUMBERS.FOUR, "four");
        map.put(NUMBERS.FIVE, "five");

        System.out.println(map);

        map.put(NUMBERS.THREE, "six");

        System.out.println(map);
    }
}
