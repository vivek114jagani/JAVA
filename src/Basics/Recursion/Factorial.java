package Basics.Recursion;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Factorial of 5 is:- " + factorial.factorial(5));
    }

    public int factorial(int n) {
        return n == 1 ? 1 : n * factorial(n - 1 );
    }
}
