package lab_sheet_6.Q10;

abstract class Employee {
    protected String name;
    protected double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    private double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Manager: " + name + ", total salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    private int overtimeHours;
    private double hourlyRate;

    Programmer(String name, double baseSalary, int overtimeHours, double hourlyRate) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return baseSalary + overtimeHours * hourlyRate;
    }

    @Override
    void displayInfo() {
        System.out.println("Programmer: " + name + ", total salary: " + calculateSalary());
    }
}

public class EmployeeSalaryMain {
    public static void main(String[] args) {
        Employee manager = new Manager("Priya", 70000.0, 10000.0);
        Employee programmer = new Programmer("Dev", 60000.0, 10, 500.0);
        manager.displayInfo();
        programmer.displayInfo();
    }
}