package Enum;

public class EnumDemo {
    public static void main(String[] args) {
        System.out.println(Mobile.Motorola);

        Mobile mobile = Mobile.Samsung;

        if (mobile == Mobile.Samsung) {
            System.out.println("Matched");
        }

        switch (mobile) {
            case Samsung -> System.out.println("Samsung");
            case Nokia -> System.out.println("Nokia");
            case Motorola -> System.out.println("Motorola");
            case Vivo -> System.out.println("Vivo");
            case Oppo -> System.out.println("Oppo");
            case MI -> System.out.println("MI");
            case IPhone -> System.out.println("IPhone");
        }
    }
}

enum Mobile {
    Samsung,
    Nokia,
    Motorola,
    Vivo,
    Oppo,
    MI,
    IPhone
}
