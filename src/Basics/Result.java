package Basics;

import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        int marks;
        Scanner input = new Scanner(System.in);
        System.out.println("enter your mark:");
        marks = input.nextInt();
        if (marks > 33) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        if (marks >= 90) {
            System.out.println("A+");
        } else if (marks >= 80) {
            System.out.println("A");
        } else if (marks >= 70) {
            System.out.println("B+");
        } else if (marks >= 60) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("C+");
        } else if (marks >= 40) {
            System.out.println("c");
        } else if (marks > 33) {
            System.out.println("d");


        }
    }
}
