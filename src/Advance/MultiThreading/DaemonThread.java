package Advance.MultiThreading;

/**
 * Characteristics of a Daemon Thread in Java :-
 * -----------------------------------------------------------------------------------------------------------------------------------
 * ->A Daemon thread is a low priority thread.
 *
 * ->A Daemon thread is a service provider thread and should not be used as user thread.
 *
 * ->JVM automatically closes the daemon thread(s) if no active thread is present and revives it if user threads are active again.
 *
 * ->A daemon thread cannot prevent JVM to exit if all user threads are done.
 * */

public class DaemonThread {
    public static void main(String[] args) {
        Thread demoTask = new Thread(new DemoTask());
        demoTask.setDaemon(true);
        demoTask.start();

        System.out.println("Main Thread Exiting....");
    }
}

class DemoTask implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Daemon Thread Running....");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
