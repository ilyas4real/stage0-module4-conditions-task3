package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double tax = 0;
        if (salary <= 10000) {
            tax = salary * 0.15;
        } else if (salary <= 20000) {
            tax = salary * 0.18;
        } else if (salary > 20000) {
            tax = salary * 0.20;
        } else {
            System.out.println("Wrong input!");
        }
        double salaryAfterTax = salary - tax;
        System.out.println("Salary after tax: " + salaryAfterTax);
    }
}
