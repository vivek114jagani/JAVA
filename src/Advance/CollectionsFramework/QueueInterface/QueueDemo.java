package Advance.CollectionsFramework.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(6);
        q.add(1);
        q.add(8);
        q.add(4);
        q.add(7);

        System.out.println("The QUEUE is:- " + q);

        int num1 = q.remove();
        System.out.println("The element deleted from the head is:- " + num1);
        System.out.println("The QUEUE after deletion is:- " + q);

        int head = q.peek();
        System.out.println("The head of the QUEUE is:- " + head);

        int size = q.size();
        System.out.println("The size of the QUEUE is:- " + size);
    }
}
