package OOP.Class_Object.Student;

public class Student {
    private String email;
    private String name;

    public Student(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        if (!(email.contains("@") && email.contains("."))) {
            return "email is not valid";
        }
        this.email = email;
        return "email added successfully";
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
