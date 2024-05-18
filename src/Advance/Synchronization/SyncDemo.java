package Advance.Synchronization;

class Msg {

    public void home() {
        System.out.println("This is Home");
    }

    public void show(String name) {
        synchronized (this) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Hello " + name);
            }
        }
    }

    public void school() {
        System.out.println("This is School");
    }
}

class OurThread extends Thread {
    Msg m;
    String name;

    OurThread(Msg m, String name) {
        this.m = m;
        this.name = name;
    }

    @Override
    public void run() {
        m.home();
        m.show(name);
        m.school();
    }
}

public class SyncDemo {
    public static void main(String[] args) {
        Msg m = new Msg();
        OurThread t1 = new OurThread(m, "vivek");
        OurThread t2 = new OurThread(m, "Jay");

        t1.start();
        t2.start();
    }
}
