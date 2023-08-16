package JAVABEAN;

public class MainProgram {
    public static void main(String[] args) {
        EmployeeBean employeeBean = new EmployeeBean();

        
        String email = "sgmpdl@gmail.com";
        employeeBean.setEmail(email);

        // Fetch and display employee information using getProperty
        String employeeInfo = employeeBean.getEmployeeInformation();
        System.out.println("Employee Information: " + employeeInfo);
    }
}

