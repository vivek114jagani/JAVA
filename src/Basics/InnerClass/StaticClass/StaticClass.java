package InnerClass.StaticClass;

/**
 * 1) Static Class Kya Hai?
 * -> Ek static class ek aisa class hota hai jo keval static members, jaise static fields aur static methods, ko contain karta hai.
 * -> Static class ka ek mukhya uddeshya hota hai ki uske members ko direct access kar sakein, bina class ke instance banaye.
 * =========================================================================================================================================
 * 2) Static Class Ka Upyog:
 * -> Static class ka upyog un situations mein kiya jata hai jab aapko ek class ki functionality ko encapsulate karna hai aur usko dusri classes mein reuse karna hai, bina class ke instance banaye.
 * -> Static class ka upyog karte samay, aap class ke object ko create kiye bina uske members ko access kar sakte hain.
 * */
class MathUtils {
    // Private constructor to prevent instantiation
    private MathUtils() { }

    // Static method to calculate square
    public static int square(int num) {
        return num * num;
    }

    // Static class for advanced mathematical operations
    public static class AdvancedMath {
        // Static method to calculate factorial
        public static int factorial(int num) {
            if (num == 0)
                return 1;
            else
                return num * factorial(num - 1);
        }
    }
}

public class StaticClass {
    public static void main(String[] args) {
        int num = 5;

        // Calling static method from MathUtils class
        int squareResult = MathUtils.square(num);
        System.out.println("Square of " + num + " is: " + squareResult);

        // Calling static method from AdvancedMath static class
        int factorialResult = MathUtils.AdvancedMath.factorial(num);
        System.out.println("Factorial of " + num + " is: " + factorialResult);
    }
}
