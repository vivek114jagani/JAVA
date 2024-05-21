package Advance.SerializingAndDeserializing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

    public static void main(String[] args) throws IOException {
        Employee employee = null;

        try {
            FileInputStream fis = new FileInputStream("E://IDE project//JAVA//src//Advance//SerializingAndDeserializing//employee.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            employee = (Employee) ois.readObject();
            ois.close();
            fis.close();

        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Deserialization Employee...");
        System.out.println("Name: " + employee.name);
        System.out.println("Address: " + employee.address);
        System.out.println("SSN: " + employee.SSN);
        System.out.println("Number: " + employee.number);
    }
}
