package Advance.CollectionsFramework.QueueInterface;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList <Integer> linkedList = new LinkedList<>();

        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(15);
        linkedList.add(22);
        linkedList.add(11);

        for (Integer number : linkedList) {
            System.out.println("Number = " + number);
        }
    }
}
