package InnerClass.AnonymousClass;
// Inner Anonymous Class Example.
class Car {
    public void engineType() {
        System.out.println("Turbo Engine");
    }
}
public class Tester {
    public static void main(String args[]) {
        Car c1 = new Car();
        c1.engineType();
        Car c2 = new Car() {
            @Override
            public void engineType() {
                System.out.println("V2 Engine");
            }
        };
        c2.engineType();
    }
}
