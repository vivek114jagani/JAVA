package Advance;

import java.util.Random;

class A implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(3000);

                int random = new Random().nextInt(50);

                System.out.println(random);

                B b = new B(random);
                C c = new C(random);

                Thread t2 = new Thread(b);
                t2.setPriority(5);
                t2.start();

                Thread t3 = new Thread(c);
                t3.setPriority(1);
                t3.start();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class B implements Runnable {

    int num;

    B (int num) {
        this.num = num;
    }

    @Override
    public void run() {
        int sq = num * num;
        System.out.println("Square of " + num + " = " + sq);
    }
}

class C implements Runnable {

    int num;

    C (int num) {
        this.num = num;
    }
    @Override
    public void run() {
        int cube = num * num * num;
        System.out.println("Cube of " + num + " = " + cube);
    }
}

public class Task1 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new A());
        t1.setPriority(10);
        t1.start();
    }
}
