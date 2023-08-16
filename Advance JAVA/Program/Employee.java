// Model: Employee class
class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// View: EmployeeView class
class EmployeeView {
    public void displayEmployeeDetails(String name, int age) {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Controller: EmployeeController class
class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public void setEmployeeAge(int age) {
        model.setAge(age);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public int getEmployeeAge() {
        return model.getAge();
    }

    public void updateView() {
        view.displayEmployeeDetails(model.getName(), model.getAge());
    }
}
