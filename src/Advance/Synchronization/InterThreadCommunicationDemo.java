package Advance.Synchronization;

class SumDemo extends Thread {
    int sum = 0;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 50; i++) {
                sum += i;
            }
            this.notify();
//            System.out.println(sum);
        }
    }
}

public class InterThreadCommunicationDemo {
    public static void main(String[] args) throws InterruptedException {
        SumDemo th = new SumDemo();
        th.start();

        synchronized (th) {
            th.wait();
            System.out.println("Sum is " + th.sum);
        }
    }
}
