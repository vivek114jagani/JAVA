import java.util.Scanner;

// enter the two values and find the largest values
public class demo3 {
    public static void main(String[] args) {
        Scanner here=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a= here.nextInt();
        System.out.println("enter the value of b ");
        int b= here.nextInt();
        if (a>b){
            System.out.println("a is large");
        } else if (a<b) {
            System.out.println("b is large");

        }
    }
}
