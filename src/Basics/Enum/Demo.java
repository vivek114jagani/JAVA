package Enum;

import java.util.Random;

enum Color {
    Red,
    Bule,
    Green
}

public class Demo {
    public static void main(String[] args) {
        Random random = new Random();

        int index = random.nextInt(Color.values().length);

        Color randomColor = Color.values()[index];

        System.out.println(randomColor);
    }
}
