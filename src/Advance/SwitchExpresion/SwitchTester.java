package Advance.SwitchExpresion;

public class SwitchTester {
    public static void main(String[] args) {
        System.out.println("print oldStyle():- ");
        System.out.println(oldStyle("Wednesday"));
        System.out.println(oldStyle("Sunday"));
        System.out.println(oldStyle(""));

        System.out.println("print newStyle():- ");
        System.out.println(newStyle("Wednesday"));
        System.out.println(newStyle("Sunday"));
        System.out.println(newStyle(""));
    }


    // OLD method to use SWITCH CASE.
    public static String oldStyle(String day) {
        String result = null;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                result = "WeekDay";
                break;
            case "Saturday":
            case "Sunday":
                result = "Weekend";
                break;
            default:
                result = "Invalid day.";
                break;
        }
        return result;
    }

    // NEW method to use SWITCH CASE.
    public  static String newStyle(String day) {
        return switch (day) {
            case "Monday", "Tuesday", "Wednesday","Thursday", "Friday" -> "WeekDay";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Invalid day.";
        };
    }
}
