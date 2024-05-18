package Advance.DefaultMethod;

/**
 * JAVA mein jab hum koi ek class me ek {@code Interface} class ko {@code implements} karate hein tab hame us interface class ki
 * sabhi methods ko main class mein call karavaana padhata hein.<p>
 *
 * JAVA mein is problem ko solve karane ke liye {@code default method} ka use kiya jata hein!
 * is method me hame kisibhi interface class ke method ke name ke aage <h4>{@code default}</h4> keyword lagana padata hein.<p>
 *
 * <h3>Here is the example of default method in Interface.</h3>
 * <pre>{@code
 * interface vehicle {
 *     default void print() {
 *         System.out.println("This is Default Method");
 *     }
 * }}</pre>
 *
 * <p>is keyword ki madad se hum us class ko apani marji se hi call kar sakate hein!*/

interface vehicle {
    default void print() {
        System.out.println("This is Default Method");
    }
}

public class DefaultMethod implements vehicle {
    public static void main(String[] args) {
        DefaultMethod defaultMethod = new DefaultMethod();

        defaultMethod.print();
    }
}
