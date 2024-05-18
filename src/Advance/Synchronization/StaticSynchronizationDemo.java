package Advance.Synchronization;

class Bank extends Thread {
    static int bal = 5000;
    static int withdraw;

    Bank(int withdraw) {
        Bank.withdraw = withdraw;
    }

    @Override
    public void run() {
        withdraw();
    }

    public static synchronized void withdraw() {
        String name = Thread.currentThread().getName();
        if (withdraw <= bal) {
            System.out.println(name + " Withdraw Money");
            bal -= withdraw;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class StaticSynchronizationDemo {
    public static void main(String[] args) {
        Bank bank = new Bank(5000);

        Thread t1 = new Thread(bank);
        Thread t2 = new Thread(bank);

        t1.setName("Vivek");
        t2.setName("Dhruv");


        Bank bank2 = new Bank(5000);

        Thread t3 = new Thread(bank2);
        Thread t4 = new Thread(bank2);

        t3.setName("Jay");
        t4.setName("Harsh");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
