package BehavioralPatterns.Template.Employee;

import java.time.LocalDate;

public class FinanceEmployee extends Employee {

    public FinanceEmployee(LocalDate ingressDate) {
        super(ingressDate);
    }

    @Override
    protected double obtainBasicSalary() {
        return 3000;
    }

    @Override
    protected double obtainSeniorityPlus() {
        return calculateSeniority() * 400;
    }

    @Override
    protected double obtainBonus() {
        return 500;
    }
}
