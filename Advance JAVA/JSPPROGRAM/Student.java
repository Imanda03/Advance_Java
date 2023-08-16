package JSPPROGRAM;

public class Student {
    private String firstName;
    private String surname;
    private String usn;
    private String course;
    private int sem;
    private int age;
    private String address;

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsn() {
        return usn;
    }

    public String getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }

    public int getSem() {
        return sem;
    }

    public String getAddress() {
        return address;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setSurname(String newSurname) {
        this.surname = newSurname;
    }

    public void setUsn(String newUsn) {
        this.usn = newUsn;
    }

    public void setCourse(String newCourse) {
        this.course = newCourse;
    }

    public void setSem(int newSem) {
        this.sem = newSem;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }
}
