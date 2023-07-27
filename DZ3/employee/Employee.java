package employee;

public class Employee {
    private String fullName;
    private String position;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void increaseSalary(int amount) {
        salary += amount;
    }

    public String getFormattedInfo() {
        return "Full Name: " + fullName +
                ", Position: " + position +
                ", Phone Number: " + phoneNumber +
                ", Salary: " + salary +
                ", Age: " + age;
    }
}