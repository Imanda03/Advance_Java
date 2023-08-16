
// Main class
public class MVCEmployeeExample {
    public static void main(String[] args) {
        // Create the Employee object
        Employee employee = new Employee("Noisy", 23);

        // Create the EmployeeView object
        EmployeeView employeeView = new EmployeeView();

        // Create the EmployeeController object
        EmployeeController employeeController = new EmployeeController(employee, employeeView);

        // Display the initial employee details
        employeeController.updateView();

        // Update the employee details
        employeeController.setEmployeeName("Niraj Karki");
        employeeController.setEmployeeAge(22);

        // Display the updated employee details
        employeeController.updateView();
    }
}