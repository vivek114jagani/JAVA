package Basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long n, fact = 1;
        Scanner r = new Scanner(System.in);
        System.out.println("enter the number");
        n = r.nextInt();
        for (long i = 1; i <= n; i++) {

            fact = fact * i;
        }
        System.out.println("the factorial is :" + fact);
    }
}
