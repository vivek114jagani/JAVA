package Advance.MultiThreading;

//class MyThread extends Thread {
//    @Override
//    public void run() {
//        System.out.println("Thread is Running");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            System.out.println("Thread Interrupted");
//        }
//        System.out.println("Thread is finished running");
//    }
//}

class MyThread extends  Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class JoiningThread {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        System.out.println("Main Thread is doing Something");
//
//        try {
//            myThread.join();
//        } catch (InterruptedException e) {
//            System.out.println("Main Thread Interrupted");
//        }
//
//        System.out.println("Main Thread Finished");

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t1.start();
        t3.start();
    }
}
