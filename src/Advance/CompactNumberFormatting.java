package Advance;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatting {
    public static void main(String[] args) {
        // Create the formatter instance for Long format
        NumberFormat formatter = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);

        System.out.println("Long Formats");
        // get the formatted strings
        System.out.println(formatter.format(1000));
        System.out.println(formatter.format(1000 * 1000));
        System.out.println(formatter.format(1000 * 1000 * 1000));

        // Create the formatter instance for Short format
        formatter = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);

        // get the formatted strings
        System.out.println("Short Formats");
        System.out.println(formatter.format(1000));
        System.out.println(formatter.format(1000 * 1000));
        System.out.println(formatter.format(1000 * 1000 * 1000));

        System.out.println("Without using Fraction");
        // get the formatted strings
        System.out.println(formatter.format(10012));
        System.out.println(formatter.format(10000012));

        // set the minimum 2 fraction digits to display
        formatter.setMinimumFractionDigits(2);
        System.out.println("Using Fraction");
        // get the formatted strings
        System.out.println(formatter.format(10012));
        System.out.println(formatter.format(10000012));
    }
}
