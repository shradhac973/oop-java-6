package lab_sheet_6.Q04;

class Employee {
    private double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    void work() {
        System.out.println("Employee is working.");
    }

    double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    HRManager(double salary) {
        super(salary);
    }

    @Override
    void work() {
        System.out.println("HR Manager is managing human resources.");
    }

    void addEmployee(String employeeName) {
        System.out.println(employeeName + " was added to the team.");
    }
}

public class HRManagerMain {
    public static void main(String[] args) {
        HRManager manager = new HRManager(65000.0);
        manager.work();
        System.out.println("Salary: " + manager.getSalary());
        manager.addEmployee("Riya");
    }
}