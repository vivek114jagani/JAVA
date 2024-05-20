package Advance;

import java.util.List;

/**In {@code Java 14}, a new feature was introduced as helpful {@code NullPointerException}.
 * It was a preview feature then and later became the standard part of the JDK.
 * The motivation behind this enhancement was to enrich the NullPointerException with more details as a traditional
 * NullPointerException only gave details of filename, method, and the line number where a NullPointerException occurred.<hr>
 *
 * <h4>Traditional Null Pointer Exception in Java</h4>
 * <pre>{@code // Create an employee without department
 * Employee emp = new Employee(1,"Robert",null);
 *
 * // get the name of the dept
 * // as name is null, this code will throw a null pointer exception
 * String dept = emp.getDept().getName();}</pre>
 *
 * <h4>If this code snippet is used to run, this will produce similar result −</h4>
 * <pre>{@code Exception in thread "main" java.lang.NullPointerException
 * 	at Advance.NullPointerException.main(NullPointerException.java:36)}</pre>
 *
 * 	<h4>New Informative Null Pointer Exception in Java</h4><p>
 * 	During debugging, such a error message is not useful.
 * 	And with multiple nesting level, it becomes more difficult to check which field being null is causing the issue.
 * 	Java 14 catered to this need. It provided an option to return a more helpful message like below in such case:
 * 	<pre>{@code Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Advance.NullPointerException.Department.getName()" because the return value of "Advance.NullPointerException.Employee.getDept()" is null
 * 	at com.tutorialspoint.Tester.main(NullPointerException.java:36)}</pre>
 * */

public class NullPointerException {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Vivek", null);

        // get department name of null department will
        // throw a NullPointerException.
        String dept = emp.getDept().getName();
        System.out.println(dept);
    }
}

class Employee {
    int id;
    String name;
    Department dept;

    public Employee(int id, String name, Department dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }
}

class Department {
    int id;
    String name;
    List<Employee> employees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
