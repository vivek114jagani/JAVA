package Basics.Recursion;

// Calculating Sum of Fibonacci Series Using Recursion.

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("Fibonacci: " + fibonacci.fibonachi(5));
    }

    public int fibonachi(int n) {
        return n <= 1 ? n : fibonachi(n - 1) + fibonachi(n - 2);
    }
}
