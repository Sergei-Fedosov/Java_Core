package calculate;
import employee.Employee;

public class Calculate {

public static void increaseSalaryForEmployeesAboveAge(Employee[] employees, int ageThreshold, int salaryIncrease) {
        for (Employee employee : employees) {
        if (employee.getAge() > ageThreshold) {
        employee.increaseSalary(salaryIncrease);
        }
        }
        }

public static double calculateAverageAge(Employee[] employees) {
        int totalAge = 0;
        for (Employee employee : employees) {
        totalAge += employee.getAge();
        }
        return (double) totalAge / employees.length;
        }

public static double calculateAverageSalary(Employee[] employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
        totalSalary += employee.getSalary();
        }
        return (double) totalSalary / employees.length;
   }
}