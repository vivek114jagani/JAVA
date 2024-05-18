package Enum.EnumString;

enum WEEKDAY {
    // enum value constants
    MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY;

    // override the toString() method for custom description
    @Override
    public String toString() {
        return switch(this) {
            case MONDAY: yield "Day 1";
            case TUESDAY:yield "Day 2";
            case WEDNESDAY:yield "Day 3";
            case THRUSDAY:yield "Day 4";
            case FRIDAY:yield "Day 5";
            case SATURDAY:yield "DAY 6";
            case SUNDAY: yield "Day 7";
        };
    }
}
public class Tester {
    public static void main(String[] args) {
        // invoke toString() internally
        System.out.println(WEEKDAY.MONDAY);
        // invoke toString explicitly
        System.out.println(WEEKDAY.TUESDAY.toString());
        // invoke name() method to get the default name
        System.out.println(WEEKDAY.WEDNESDAY.name());
    }
}