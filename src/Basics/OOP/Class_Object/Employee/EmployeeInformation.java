package OOP.Class_Object.Employee;

public class EmployeeInformation {
    private String employee_name;
    private String employee_address;
    private long employee_mobile_no;

    public EmployeeInformation(String employee_name, String employee_address, long employee_mobile_no) {
        this.employee_name = employee_name;
        this.employee_address = employee_address;

        if (isMobileNoValid(employee_mobile_no)) {
            this.employee_mobile_no = employee_mobile_no;
        } else {
            System.out.println("Invalid Mobile Number :- " + employee_mobile_no);
        }
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public String setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
        return "employee name added successfully";
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public String  setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
        return "employee address added successfully";
    }

    public long getEmployee_mobile_no() {
        return employee_mobile_no;
    }

    public int setEmployee_mobile_no(long employee_mobile_no) {
        if (isMobileNoValid(employee_mobile_no)) {
            this.employee_mobile_no = employee_mobile_no;
            return 1;
        } else {
            return 0;
        }
    }

    private boolean isMobileNoValid(long mobileNo){
        String mobileNoStr = String.valueOf(mobileNo);
        return mobileNoStr.length()==10;
    }
}
