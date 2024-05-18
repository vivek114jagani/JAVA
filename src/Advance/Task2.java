package Advance;

import java.io.File;
import java.io.IOException;
import java.util.Random;

class First implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(3000);

                int random = new Random().nextInt(50);

                System.out.println(random);

                String dirName = "E:/IDE project/JAVA/src/" + random;
                File file = new File(dirName);
                file.mkdir();

                Seconde seconde = new Seconde(random);
                Third third = new Third(random);

                Thread t2 = new Thread(seconde);
                t2.setPriority(5);
                t2.start();

                Thread t3 = new Thread(third);
                t3.setPriority(1);
                t3.start();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Seconde implements Runnable {

    int num;

    Seconde (int num) {
        this.num = num;
    }

    @Override
    public void run() {
        int sq = num * num;
        try {
            File file = new File("E://IDE project//JAVA//src//" + num + "//" + sq);

            if (file.createNewFile()) {
                System.out.println("Square of " + num + " = " + sq);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

class Third implements Runnable {

    int num;

    Third (int num) {
        this.num = num;
    }
    @Override
    public void run() {
        int cube = num * num * num;
        try {
            File file = new File("E://IDE project//JAVA//src//" + num + "//" + cube);

            if (file.createNewFile()) {
                System.out.println("Cube of " + num + " = " + cube);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new First());
        t1.setPriority(10);
        t1.start();
    }
}
