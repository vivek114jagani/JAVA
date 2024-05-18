package Advance.CollectionsFramework.SetInterface;

import java.util.EnumSet;

public class EnumSetDemo {

    public enum NUMBERS {ONE, TOW, THREE, FOUR, FIVE}

    public static void main(String[] args) {
        EnumSet<NUMBERS> set = EnumSet.of(NUMBERS.ONE);

        System.out.println(set);
    }
}
