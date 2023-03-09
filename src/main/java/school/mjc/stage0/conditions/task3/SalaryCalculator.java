package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
                if (salary <= 10000 && salary >= 0) {
            double q = salary * 0.15;
            System.out.println(salary - q);
        } else if (10000 < salary && salary <= 20000) {
            double q = salary * 0.18;
            System.out.println(salary - q);
        } else if (salary > 20000) {
            double q = salary * 0.20;
            System.out.println(salary - q);
        } else if (salary < 0)
            System.out.println("wrong input!");
    }
}
