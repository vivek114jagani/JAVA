package Advance;

/**
 * In Java 14, an exciting feature record was introduced as a preview feature.<p>
 * The record feature helps in creating immutable data objects. In the Java 15 version, record types were enhanced further.
 * In Java 14 and 15, in order to use a record, a flag --enable-preview has to be passed.
 * From Java 16 onwards, this flag is not required as the record is a standard part of JDK.<hr>
 *
 * <h3>Purpose of a Java Record</h3><p>
 * The prime purpose of a record is to create a data object or a POJO which is used to carry data in application program flow.<p>
 * In a multi-tier program, Domain/Model objects store the data captured from the data source and then these model
 * objects are passed further to the application/UI layer to process the data and vice versa where UI/Application stores data in data objects and then pass these objects to Data layer to populate data sources.<p>
 * As these data objects contain a lot of fields, developers are required to write a lot of setter/getter methods, parameterized constructors, overridden equals methods, and hashcode methods. <p>
 * In such a scenario, the record comes to the rescue as it provides most of the boilerplate code and the developer can focus on required functionalities only.<hr>
 *
 * <h3>Features of Java Record</h3><p>
 * {@code 1) Record objects have an implicit constructor with all the parameters as field variables.}<p>
 * {@code 2) Record objects have implicit field-getter methods for each field variable.}<p>
 * {@code 3) Record objects have implicit field setter methods for each field variable.}<p>
 * {@code 4) Record objects have an implicit sensible implementation of hashCode(), equals(), and toString() methods.}<p>
 * {@code 5) With Java 15, native methods cannot be declared in records.}<p>
 * {@code 6) With Java 15, implicit fields of record are not final and modification using reflection will throw IllegalAccessException.}
 * */

public class RecordClass {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Vivek", "XII");
        Student student2 = new Student(2, "Dhruv", "XII");

        System.out.println(student1);
        System.out.println(student2);

        boolean result = student1.equals(student2);
        System.out.println(result);

        result = student1.equals(student1);
        System.out.println(result);

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}

record Student(int id, String name, String className) {}
