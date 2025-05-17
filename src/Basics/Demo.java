package Basics;

import java.util.Scanner;

// enter the number and find even and odd number
public class Demo {

    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter a number");
        int num=reader.nextInt();
        if (num%2==0)
            System.out.println("even number");
        else
            System.out.println("odd number ");
    }
}

