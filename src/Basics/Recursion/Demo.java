package Basics.Recursion;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        int result = demo.sum(5);
        System.out.println("Sum: " + result);
    }

    public int sum(int n) {
        System.out.println("Input: " + n);
        int result;
        if (n == 1) {
            result = 1;
            System.out.println("Base condition fulfilled.");
        } else {
            result = n + sum(n - 1);
        }
        System.out.println("Result: " + result);
        return result;
    }
}
