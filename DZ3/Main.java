import calculate.Calculate;
import employee.Employee;
import static calculate.Calculate.calculateAverageSalary;
import static calculate.Calculate.calculateAverageAge;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("John Doe", "Manager", "1234567890", 5000, 35);
        employees[1] = new Employee("Jane Smith", "Developer", "9876543210", 6000, 42);
        employees[2] = new Employee("Mike Johnson", "Salesperson", "4567890123", 4000, 50);
        employees[3] = new Employee("Emily Brown", "HR Manager", "7890123456", 5500, 48);
        employees[4] = new Employee("David Wilson", "Accountant", "2345678901", 4500, 55);

        System.out.println("Information about employees:");
        for (Employee employee : employees) {
            System.out.println(employee.getFormattedInfo());
        }

        Calculate.increaseSalaryForEmployeesAboveAge(employees, 45, 5000);

        System.out.println("\nAfter salary increase:");
        for (Employee employee : employees) {
            System.out.println(employee.getFormattedInfo());
        }

        System.out.println("\nAverage age of employees: " + calculateAverageAge(employees));
        System.out.println("Average salary of employees: " + calculateAverageSalary(employees));
    }
}
