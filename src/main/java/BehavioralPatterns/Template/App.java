package BehavioralPatterns.Template;

import BehavioralPatterns.Template.Employee.Employee;
import BehavioralPatterns.Template.Employee.FinanceEmployee;
import BehavioralPatterns.Template.Employee.SalesEmployee;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Employee employee = new FinanceEmployee(LocalDate.of(2020, 10, 10));

        Employee anotherEmployee = new SalesEmployee(LocalDate.of(2010, 1, 1));

        System.out.println(employee.obtainSalary());

        System.out.println(anotherEmployee.obtainSalary());

    }
}
