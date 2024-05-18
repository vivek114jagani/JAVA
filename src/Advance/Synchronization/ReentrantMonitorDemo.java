package Advance.Synchronization;

import java.util.concurrent.locks.ReentrantLock;

class Thrd {
    // creating object of ReentrantLock class
    private static final ReentrantLock lockr = new  ReentrantLock();
    static void operation(int data) {
        // give access to lock
        boolean lockAcquired = lockr.tryLock();
        if (lockAcquired) {
            try {
                lockr.lock();
                // giving lock to thread
                for(int i = 1; i <= 4; i++) {
                    System.out.println(data++);
                }
                // checking lock count
                System.out.println("Count of Lock: " + lockr.getHoldCount());
            } finally {
                lockr.unlock();
                // unlocking the lock
            }
        } else {
            System.out.println("I am in else block");
        }
    }
}

class Thrd1 extends Thread {
    // thread number 1
    public void run() {
        Thrd.operation(1);
        // method calling
    }
}
class Thrd2 extends Thread {
    // thread number 2
    public void run() {
        Thrd.operation(5);
        // method calling
    }
}
class Thrd3 extends Thread {
    // thread number 3
    public void run() {
        Thrd.operation(10);
        // method calling
    }
}

public class ReentrantMonitorDemo {
    public static void main(String[] args) {
        // creating object for thread class
        Thrd1 oprt1 = new Thrd1();
        Thrd2 oprt2 = new Thrd2();
        Thrd3 oprt3 = new Thrd3();
        // Starting the thread operation
        oprt1.start();
        oprt2.start();
        oprt3.start();
    }
}
