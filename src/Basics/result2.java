import java.util.Scanner;

public class result2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the marks of five subject");
        float sub_1 = input.nextFloat();
        float sub_2 = input.nextFloat();
        float sub_3 = input.nextFloat();
        float sub_4 = input.nextFloat();
        float sub_5 = input.nextFloat();

        float total;
        float percentage;

        total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
        percentage = ((total / 500) * 100);
        if (percentage > 33) {
            System.out.println("Pass");
        } else System.out.println("Fail");
        System.out.println("the total marks =" + total);
        System.out.println("percentage =" + percentage);


        if (percentage >= 90) {
            System.out.println("Grade = A+");
        } else if (percentage >= 80) {
            System.out.println("Grade = A");
        } else if (percentage >= 70) {
            System.out.println("Grade = B+");
        } else if (percentage >= 60) {
            System.out.println("Grade = B");
        } else if (percentage >= 50) {
            System.out.println("Grade = C+");
        } else if (percentage >= 40) {
            System.out.println("Grade = c");
        } else if (percentage > 33) {
            System.out.println(" Grade = D");
        }


    }
}
