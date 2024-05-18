package Advance.MultiThreading;

class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    ThreadDemo(String name) {
        threadName = name;

        System.out.println("Thread: " + threadName + ", " + "State: NEW");
    }

    public void  run() {
        System.out.println("Thread: " + threadName + ", " + "State: RUNNING");
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
        }

        System.out.println("Thread: " + threadName + ", " + "State: DEAD");
    }

    public void start(){
        System.out.println("Thread: " + threadName + ", " + "State: START");

        if (t == null) {
            t= new Thread(this, threadName);
            t.start();
        }
    }
}

public class LifeCycle {
    public static void main(String[] args) {
        ThreadDemo thread1 = new ThreadDemo("Thread-1");
        ThreadDemo thread2 = new ThreadDemo("Thread-2");

        thread1.start();
        thread2.start();
    }
}
