package Advance;

interface Vehicle {

    default void print() {
        System.out.println("I am a vehicle!");
    }

    static void blowHorn() {
        System.out.println("Blowing horn!!!");
    }
}

interface FourWheeler {

    default void print() {
        System.out.println("I am a four wheeler!");
    }
}

class Car implements Vehicle, FourWheeler {

    public void print() {
        // call the Vehicle interface default print method
        Vehicle.super.print();
        FourWheeler.super.print();
        // call the Vehicle interface static blowHorn method
        Vehicle.blowHorn();
        System.out.println("I am a car!");
    }
}

public class StaticDefaultMethod {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.print();

        Vehicle.blowHorn();
    }
}
