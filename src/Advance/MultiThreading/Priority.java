package Advance.MultiThreading;

class PriorityThread extends Thread {
    PriorityThread () {
    }

    @Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName() + ", Thread Priority: " + Thread.currentThread().getPriority());
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", " + i);
        }

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void start() {
        super.start();
    }
}

public class Priority {
    public static void main(String[] args) {
        PriorityThread thread1 = new PriorityThread();
        PriorityThread thread2 = new PriorityThread();
        PriorityThread thread3 = new PriorityThread();

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
