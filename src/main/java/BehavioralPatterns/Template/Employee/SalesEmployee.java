package BehavioralPatterns.Template.Employee;

import java.time.LocalDate;

public class SalesEmployee extends Employee {
    public SalesEmployee(LocalDate date) {
        super(date);
    }

    @Override
    protected double obtainBasicSalary() {
        return 2500;
    }

    @Override
    protected double obtainSeniorityPlus() {
        return calculateSeniority() * 500;
    }

    @Override
    protected double obtainBonus() {
        return 500;
    }
}
