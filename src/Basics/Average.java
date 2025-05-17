package Basics;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("purchase of amount");
        int purchase = sc.nextInt();
        int product = 0;
        if (purchase < 500) {
            product = purchase % 10;
        } else if (purchase <= 1000) {
            product = purchase % 15;
        } else if (purchase <= 2000) {
            product = purchase % 20;
        }
        System.out.println("your discount is " + product);
    }
}
