package Advance.SerializingAndDeserializing;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee();
        employee.name = "Vivek J";
        employee.address = "Phokka Kuan, Ambehta Peer";
        employee.SSN = 11122333;
        employee.number = 101;

        try {
            FileOutputStream fos = new FileOutputStream("E://IDE project//JAVA//src//Advance//SerializingAndDeserializing//employee.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(employee);
            oos.close();
            fos.close();

            System.out.println("Serialized data is saved in E:/IDE project/JAVA/src/Advance/SerializingAndDeserializing/employee.ser");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
