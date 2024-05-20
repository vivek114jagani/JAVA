package Advance;

public class SealedClassDemo {
    public static void main(String[] args) {
        // create an instance of Manager
        Person manager = new CropManager("Robert", 23);

        // get the id.
        System.out.println("ID: " + getId(manager));
    }

    public static int getId(Person person) {
        // check if person is employee then return employee id
        if (person instanceof Employees) {
            return ((Employees) person).getEmployeeId();
        }
        // if person is manager then return manager id
        else if(person instanceof Manager) {
            return ((Manager) person).getManagerId();
        }
        return -1;
    }
}

// a sealed interface Person which is to be inherited by Employee
// and Manager interfaces
sealed interface Person permits Employees, Manager{
    String getName();
}

// Employee and Manager interfaces have to extend Person and can be sealed or non-sealed
non-sealed interface Employees extends Person {
    int getEmployeeId();
}

non-sealed interface Manager extends Person {
    int getManagerId();
}

class CropEmployee implements Employees {
    String name;
    int id;

    public CropEmployee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getEmployeeId() {
        return id;
    }
}

class CropManager implements Manager {
    String name;
    int id;

    public CropManager(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getManagerId() {
        return id;
    }
}
