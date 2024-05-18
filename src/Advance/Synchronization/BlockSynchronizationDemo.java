package Advance.Synchronization;

class PrintCountDemo {
    public void printCount(){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}

class BlockThreadDemo extends Thread {
    Thread t;
    String threadName;
    final PrintCountDemo p;

    BlockThreadDemo(String name, PrintCountDemo p) {
        threadName = name;
        this.p = p;
    }

    @Override
    public void run() {
        synchronized (p) {
            p.printCount();
        }
        System.out.println(threadName + " Exit");
    }

    public void start() {
        System.out.println(threadName + " Start");
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class BlockSynchronizationDemo {
    public static void main(String[] args) {
        PrintCountDemo pd = new PrintCountDemo();

        BlockThreadDemo t1 = new BlockThreadDemo("Thread-1", pd);
        BlockThreadDemo t2 = new BlockThreadDemo("Thread-2", pd);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }

//        PrintCountDemo printCountDemo = new PrintCountDemo();
//        Thread t1 = new Thread(printCountDemo);
//        Thread t2 = new Thread(printCountDemo);
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            System.out.println("Interrupted");
//        }
    }
}



// 2) Multithreading Example with Synchronization at Method level.
//
//class PrintCountDemo extends Thread {
//    public void printCount() {
//        try {
//            for (int i = 5; i > 0; i--) {
//                Thread.sleep(50);
//                System.out.println(i);
//            }
//        } catch (InterruptedException e) {
//            System.out.println(Thread.currentThread().getName() + " Interrupted.");
//        }
//    }
//
//    public synchronized void run() {
//        printCount();
//        System.out.println(Thread.currentThread().getName() + " Exiting.");
//    }
//}
