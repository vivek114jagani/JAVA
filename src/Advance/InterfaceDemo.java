package Advance;

interface util {
    public int sum (int a, int b);

    public default int sub (int a, int b) {
        return a - b;
    }

    public default int operator (int a, int b) {
        return multi(a, b);
    }

    public static int multi (int a, int b) {
        return a * b;
    }
}

public class InterfaceDemo implements util {

    public static void main(String[] args) {

        InterfaceDemo interfaceDemo = new InterfaceDemo();

        System.out.println("Sum of a + b = " + interfaceDemo.sum(10, 5));

        System.out.println("Sub of a - b = " + interfaceDemo.sub(10, 5));

        System.out.println("Multi of a * b = " + interfaceDemo.operator(10, 5 ));
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}
