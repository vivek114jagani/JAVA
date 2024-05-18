import java.util.Scanner;

public class ReversString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String :- ");
        String str = input.next();
        System.out.print("revers String :- " + reverse(str));

//        String str = "";
//
//        if (str == null) {
//            System.out.println("Null is not valid input");
//        } else {
//            StringBuilder out = new StringBuilder();
//
//            char[] chars = str.toCharArray();
//
//            for (int i = chars.length - 1; i >= 0 ; i--) {
//                out.append(chars[i]);
//            }
//
//            System.out.print("revers String :- " + out);
//        }
    }

    public static String reverse(String in){
        if (in.isEmpty()) {
            System.out.println("Null is not valid input");
        }

        StringBuilder out = new StringBuilder();

        char[] chars = in.toCharArray();

        for (int i = chars.length - 1; i >= 0 ; i--) {
            out.append(chars[i]);
        }

        return out.toString();
    }
}
