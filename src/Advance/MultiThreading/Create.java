package Advance.MultiThreading;

class CreatThreadDemo implements Runnable {
    private String threadName;
    CreatThreadDemo( String name) {
        threadName = name;
        System.out.println("Thread: " + threadName + ", " + "State: New");
    }

    public void run() {
        System.out.println("Thread: " + threadName + ", " + "State: Running");
        for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
        }
        System.out.println("Thread: " + threadName + ", " + "State: Dead");
    }
}

public class Create {
    public static void main(String args[]) {
        CreatThreadDemo runnableDemo1 = new CreatThreadDemo( "Thread-1");
        CreatThreadDemo runnableDemo2 = new CreatThreadDemo( "Thread-2");

        Thread thread1 = new Thread(runnableDemo1);
        Thread thread2 = new Thread(runnableDemo2);

        thread1.start();
        thread2.start();
    }
}
