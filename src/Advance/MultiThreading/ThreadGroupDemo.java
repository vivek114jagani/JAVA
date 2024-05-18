package Advance.MultiThreading;

public class ThreadGroupDemo implements Runnable{

    public static void main(String[] args) {
        ThreadGroupDemo tg = new ThreadGroupDemo();
        tg.fun();
    }

    public void fun () {
        try {

            // Create a Parent Thread Group.
            ThreadGroup pGroup = new ThreadGroup("Parent Thread Group");

            // Create a child Thread Group for parent Thread Group.
            ThreadGroup cGroup = new ThreadGroup("Child Thread Group");

            // Creat a Thread .
            Thread t1 = new Thread(pGroup, this);
            System.out.println("Starting: " + t1.getName() + "...");
            t1.start();

            // Creat another Thread .
            Thread t2 = new Thread(cGroup, this);
            System.out.println("Starting: " + t2.getName() + "...");
            t2.start();

            // Display the number of Active Thread.
            System.out.println("Active Threads in \"" + pGroup.getName() + "\" = " + pGroup.activeCount());

            // block until the other threads finish.
            t1.join();
            t2.join();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            i++;
        }
        System.out.println(Thread.currentThread().getName() + " finished executing.");
    }
}
