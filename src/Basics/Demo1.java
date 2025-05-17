package Basics;

import java.util.Scanner;

// enter the name and get greeting message with input values
public class Demo1 {
    public static void main(String[] args) {
        Scanner hm=new Scanner(System.in);
        System.out.println("enter the name");
        String name=hm.nextLine();
        System.out.println("hello "+name);
    }
}
