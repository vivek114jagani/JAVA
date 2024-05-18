package OOP.Class_Object.Student;

public class ConstructorDemo {
    public static void main(String[] args) {
        Student jaimin = new Student("jaimin@tatvam.dev", "Jaimin Kathiriya");
        Student meetBhai = new Student("meet@tatvam.dev", "Meet Viradiya");

        System.out.println(jaimin.getName());

        System.out.println(jaimin.getEmail());

        System.out.println(jaimin.setEmail("jaimin.kathiriya@tatvam.dev"));
        System.out.println(jaimin.getEmail());

        System.out.println("------------------------");
        System.out.println(meetBhai.getName());
        System.out.println(meetBhai.getEmail());
    }


}
