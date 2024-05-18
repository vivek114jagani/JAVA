package Enum.EnumConstructor;

enum WEEKDAY {

    // create values of enum
    MONDAY("Day 1"),
    TUESDAY("Day 2"),
    WEDNESDAY("Day 3"),
    THRUSDAY("Day 4"),
    FRIDAY("Day 5"),
    SATURDAY("Day 6"),
    SUNDAY("Day 7");

    private final String description;
    // private construtor to set default value
    private WEEKDAY(String description) {
        this.description = description;
    }
    // getter method to get the description
    public String getDescription () {
        return this.description;
    }
}
public class Tester {
    public static void main(String[] args) {
        System.out.println(WEEKDAY.MONDAY.getDescription());
        System.out.println(WEEKDAY.MONDAY);
    }
}