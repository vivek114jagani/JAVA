package Advance.CollectionsFramework.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<Integer> objDeque = new ArrayDeque<>();

        objDeque.addFirst(15);
        objDeque.add(10);
        objDeque.add(18);
        objDeque.add(55);
        objDeque.addLast(28);

        int ele1 = objDeque.removeFirst();
        int ele2 = objDeque.removeLast();

        System.out.println("First removed element is:- " + ele1);
        System.out.println("Last removed element is:- " + ele2);

        System.out.println(objDeque);
    }
}
