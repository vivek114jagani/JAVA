package Basics.OOP.Class_Object.Employee;
import java.util.Scanner;

public class EmployeeData {
    public static void main(String[] args) {

        String emp_nm, emp_address;
        long emp_mo_no;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Employee Details :- ");
        System.out.println("==================================================");
        System.out.print("Enter Employee Name : - ");
        emp_nm = input.nextLine();
        System.out.print("Enter Employee Address : - ");
        emp_address = input.nextLine();
        System.out.print("Enter Employee Mobile No : - ");
        emp_mo_no = Long.parseLong(input.nextLine());

        OOP.Class_Object.Employee.EmployeeInformation empInfo = new OOP.Class_Object.Employee.EmployeeInformation(emp_nm,emp_address, emp_mo_no);

        System.out.println("\nyou can update your details? If yes to press (y) and no to press (n) (y / n) :- ");
        String updated = input.nextLine();
        if (updated.equals("y")) {

            int choice;
            do {
                System.out.println("\n--------------------------------------------");
                System.out.println("1.name\n2.address\n3.mobile no\n4.Exit");
                System.out.println("--------------------------------------------");
                System.out.println("Enter any one choice :- ");
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Enter Employee Name :- ");
                        emp_nm = input.nextLine();
                        System.out.println(empInfo.setEmployee_name(emp_nm));
                        break;
                    case 2:
                        System.out.print("Enter Employee Address : - ");
                        emp_address = input.nextLine();
                        System.out.println(empInfo.setEmployee_address(emp_address));
                        break;
                    case 3:
                        System.out.print("Enter Employee Mobile No : - ");
                        emp_mo_no = Long.parseLong(input.nextLine());
                        System.out.println(empInfo.setEmployee_mobile_no(emp_mo_no));
                        break;
                    case 4:
                        System.out.println("Exit............");
                        break;
                    default:
                        System.out.println("Enter Right choice !!!!");
                        break;
                }
            } while (choice != 4);
        }
        System.out.println("\n\nDisplay Employee data");
        System.out.println("******************************************");
        System.out.println("NAME : - " + empInfo.getEmployee_name());
        System.out.println("ADDRESS : - " + empInfo.getEmployee_address());
        System.out.println("MOBILE NO : - " + empInfo.getEmployee_mobile_no());
    }
}
