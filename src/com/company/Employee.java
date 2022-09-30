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
     * Calculates tax of emp. salary
     * if less than 1000 no tax, otherwise %3 of salary
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

    /**
     * Calculates bonus of emp. salary
     * if more than 40 hours 30 for each hour bonus otherwise no bonus
     * @param workHours
     * @return
     */
    public double bonus(double workHours) {
        if (workHours > 40) {
            return workHours * 30;
        } else
            return 0;
    }

    /**
     * Calculates raise salary amount of emp. salary
     * if less than 10 years experienced emp. 5% raise
     * or less than 20 years and more than 9 experineced emp. 10% raise
     * otherwise more than 19 years experienced emp. 15% raise
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

    /**
     * Views info of Employee
     * @return
     */
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }

    /**
     * Views details of salary for specific employee
     * @param employee
     * @return
     */
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
