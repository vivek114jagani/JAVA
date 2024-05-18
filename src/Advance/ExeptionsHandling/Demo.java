package Advance.ExeptionsHandling;

public class Demo {
    public static void main(String[] args) {
        try {
            int[] a = new int[2];
            System.out.println(a[3]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception is :- " + e);
        }

        System.out.println("Out of yhe block.");
    }
}
