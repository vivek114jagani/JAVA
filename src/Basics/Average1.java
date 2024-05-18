import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("account");
        int account = sc.nextInt();
        System.out.println("state");
        int state = sc.nextInt();
        System.out.println("maths");
        int maths = sc.nextInt();
        int total = account + state + maths;
        //float percentage = (total / 300) * 100;

        System.out.println(total);
    }
}
