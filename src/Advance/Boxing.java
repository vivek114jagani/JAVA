package Advance;

public class Boxing {
    public static void main(String[] args) {
        int i = 100;
        Integer iobj = Integer.valueOf(i);
        // Auto Boxing.
        Integer iobj1 = i;
        System.out.println(i);
        System.out.println(iobj);
        System.out.println(iobj1 + "\n");

        Integer x = Integer.valueOf(200);
        int y = x.intValue();
        // UnBoxing.
        int z = x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
