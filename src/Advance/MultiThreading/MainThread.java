package Advance.MultiThreading;

class MainThreadDemo extends Thread {
    MainThreadDemo () {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: NEW");
    }

    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Running");
        for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", " + i);
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Dead");
    }

    public void start () {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Start");
        super.start();
    }
}

public class MainThread {
    public static void main(String[] args) {
        MainThreadDemo thread1 = new MainThreadDemo();
        MainThreadDemo thread2 = new MainThreadDemo();
        thread1.start();
        thread2.start();
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Dead");
    }
}
