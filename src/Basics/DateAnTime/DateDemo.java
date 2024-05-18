package DateAnTime;

import java.time.Instant;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {

        // create a date of current time
        Date date = Date.from(Instant.now());

        // print the date instance
        System.out.println("Date: " + date.toString());
    }
}
