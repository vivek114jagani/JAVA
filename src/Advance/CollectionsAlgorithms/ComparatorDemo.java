package Advance.CollectionsAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Dog implements Comparator<Dog>, Comparable<Dog> {
    private String name;
    private int age;

    Dog() {}

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Comparable<Dog>
    @Override
    public int compareTo(Dog d) {
        return (this.name).compareTo(d.name);
    }

    // Comparator<Dog>
    @Override
    public int compare(Dog d1, Dog d2) {
        return d1.age - d2.age;
    }

    @Override
    public String toString() {
        return this.name + "," + this.age;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Dog> list = new ArrayList<>();

        list.add(new Dog("Vivek", 105));
        list.add(new Dog("Jay", 102));
        list.add(new Dog("Dhruv", 205));
        list.add(new Dog("Harsh", 135));
        list.add(new Dog("Tejas", 101));

        Collections.sort(list); // Sorts the Array List.
        System.out.println("Sorted by name: ");
        // Printing the sorted lists of names.
        System.out.print(list);

        // Sorts the Array List using Comparator.
        Collections.sort(list, new Dog());
        System.out.println(" ");

        System.out.println("Sorted by age: ");
        // Printing the sorted lists of ages.
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted by name in revers order:");
        System.out.print(list);
    }
}
