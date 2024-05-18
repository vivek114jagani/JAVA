import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        double dis;
        Scanner dc = new Scanner(System.in);
        System.out.println("enter x1 point");
        x1 = dc.nextInt();
        System.out.println("enter y1 point");
        y1 = dc.nextInt();
        System.out.println("enter x2 point");
        x2 = dc.nextInt();
        System.out.println("enter y2 point");
        y2 = dc.nextInt();

        dis = ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("distance between" + "(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")" + dis);
    }
}
