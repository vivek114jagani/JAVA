package Maths;

public class MathDemo {

    public static void main(String[] args) {

        // get two double numbers
        double x = 60984.1;
        double y = -497.99;

        // get the natural logarithm for x
        System.out.println("Math.log(" + x + ")=" + Math.log(x));

        // get the natural logarithm for y
        System.out.println("Math.log(" + y + ")=" + Math.log(y));

        // get the max value
        System.out.println("Math.max(" + x + ", y" + ")=" + Math.max(x,y));

        // get the min value
        System.out.println("Math.min(" + x + ", y" + ")=" + Math.min(x,y));

    }
}
