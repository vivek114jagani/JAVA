import java.util.Scanner;

// enter the values in rupees and output in dollar
public class demo4 {
    public static void main(String[] args) {
        Scanner currency = new Scanner(System.in);
        System.out.println("enter the rupees");
        float rupees = currency.nextInt();
        float dollars = rupees / 82;
        System.out.println("dollars =" + dollars);
    }
}