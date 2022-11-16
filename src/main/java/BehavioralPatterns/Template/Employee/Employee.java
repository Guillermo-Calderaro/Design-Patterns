package BehavioralPatterns.Template.Employee;

import java.time.LocalDate;

public abstract class Employee {
    protected LocalDate ingressDate;

    public Employee(LocalDate ingressDate){
        this.ingressDate = ingressDate;
    }
    public double obtainSalary(){
        return this.obtainBasicSalary()
                + this.obtainSeniorityPlus()
                + this.obtainBonus();
    }

    protected abstract double obtainBasicSalary();
    protected abstract  double obtainSeniorityPlus();



    protected abstract double obtainBonus();

    protected int calculateSeniority() {
        return LocalDate.now().getYear() - ingressDate.getYear();
    }

}
