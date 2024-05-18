package Advance.Synchronization;

class PrintDemo {
    public void printCount() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Counter --- " + i);
            }
        } catch (Exception e) {
            System.out.println("Thread Interrupted.");
        }
    }
}

class ThreadDemo extends  Thread {
    private Thread t;
    private final String threadName;
    final PrintCountDemo PD;

    ThreadDemo(String name, PrintCountDemo pd) {
        threadName = name;
        PD = pd;
    }

    @Override
    public void run() {
        synchronized (PD) {
            PD.printCount();
        }
        System.out.println("Thread: " + threadName +" exiting.");
    }

    public void start () {
        System.out.println("Starting " + threadName);

        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class Demo {

    public static void main(String[] args) {
        PrintCountDemo PD = new PrintCountDemo();

        ThreadDemo T1 = new ThreadDemo("Thread - 1", PD);
        ThreadDemo T2 = new ThreadDemo("Thread - 2", PD);

        T1.start();
        T2.start();

        try {
            T1.join();
            T2.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
