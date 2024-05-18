import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {

        Scanner pt = new Scanner(System.in);
        System.out.println("enter your bill unit =");
        int unit = pt.nextInt();
        int bill = 0;
        if (unit <= 100) {
            bill = unit * 10;
        } else if (unit <= 200) {
            bill = 100 * 10 + (unit - 100) * 20;
        } else if (unit <= 300) {
            bill = 100 * 10 + 100 * 20 + (unit - 200) * 30;

        } else if (unit <= 400) {
            bill = 100 * 10 + 100 * 20 + 100 * 30 + (unit - 300) * 40;
        }
        System.out.println("The electricity bill is  =" + bill);

    }
}
