package com.company;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    /**
     * Constructor for employee
     * @param name
     * @param salary
     * @param workHours
     * @param hireYear
     */
    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    /**
     *
     * @param salary
     * @return
     */
    public double tax(double salary) {
        if (salary < 1000) {
            return 0;
        } else {
            return (this.salary * 3) / 100;
        }
    }

    public double bonus(double workHours) {
        if (workHours > 10) {
            return workHours * 30;
        } else
            return 0;
    }

    /**
     *
     * @param salary
     * @param hireYear
     * @return
     */
    public double raiseSalary(double salary, int hireYear) {
        if (hireYear > 2011) {
            return (salary * 5) / 100;
        } else if (hireYear > 2001 && hireYear < 2011) {
            return (salary * 10) / 100;
        } else {
            return (salary * 15) / 100;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }

    public String showInfo(Employee employee){
        return  "Tax is : "
                + employee.tax(employee.salary) + " bonus is : "
                + employee.bonus(employee.workHours) + " raise of salary is : "
                + employee.raiseSalary(employee.salary, employee.hireYear) + " new salary with tax and bonus is : "
                + ((employee.salary - employee.tax(employee.salary)) + employee.bonus(employee.workHours)) +
                " total salary value is : "
                + ((employee.salary - employee.tax(employee.salary)) + employee.bonus(employee.workHours)
                + employee.raiseSalary(employee.salary, employee.hireYear));

    }
}
