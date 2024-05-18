package Advance.DefaultMethod;

interface Bike {
    default void print() {
        System.out.println("I am bike");
    }
}

interface Car {
    default void print() {
        System.out.println("I am car");
    }
}

class Shop implements Bike, Car {
    public void print() {
        System.out.println("I am car shop bike");
        Car.super.print();
    }
}

public class DefaultMethodInheritance {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.print();
    }
}
