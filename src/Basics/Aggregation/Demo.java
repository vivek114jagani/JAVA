package Aggregation;

class Address {
    String houseNO;
    String city;
    String country;

    public Address(String houseNO, String city, String country){
        this.houseNO = houseNO;
        this.city = city;
        this.country = country;
    }
}

class Employee {
    String name;
    Address address;

    public Employee(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public void displayDetails(){
        System.out.println(this.name + "\n" + address.houseNO + "\n" + address.city + "\n" + address.country);
    }
}


public class Demo {
    public static void main(String[] args) {
        Address a1 = new Address("HA9", "surat", "IN");
        Employee e1 = new Employee("peter", a1);
        e1.displayDetails();
    }
}
