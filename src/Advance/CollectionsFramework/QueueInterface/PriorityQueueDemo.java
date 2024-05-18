package Advance.CollectionsFramework.QueueInterface;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(5);

        queue.add(20);
        queue.add(30);
        queue.add(20);
        queue.add(30);
        queue.add(15);
        queue.add(22);
        queue.add(11);

        for (Integer number : queue) {
            System.out.println("Number = " + number);
        }
    }
}
