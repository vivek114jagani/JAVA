package Advance.Synchronization;

public class InterruptingThreadDemo {
    public static void main(String[] args) {
        System.out.println("Thread main started.");
        final Task task = new Task();
        final Thread thread = new Thread(task);
        thread.start();
        thread.interrupt();
        System.out.println("Thread main finished.");
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("[" + Thread.currentThread().getName() + "] Message " + i);

//            if (Thread.interrupted()) {
//                System.out.println("This Thread was interrupted by someone calling this Thread.interrupted()");
//                System.out.println("Calling task running in thread " + Thread.currentThread().getName());
//                System.out.println("After Thread.interrupted() call, JVM reset the interrupted value to: " + Thread.interrupted());
//            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("This thread was interrupted by someone calling this Thread.interrupt()");
            }
        }
    }
}
