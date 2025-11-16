package Task.Nov16;

class Employee {
    double calculateSalary() {
        return 0;
    }
}

class Manager extends Employee {
    double baseSalary;
    double bonus;

    Manager(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Developer extends Employee {
    double hourlyRate;
    int hours;

    Developer(double hourlyRate, int hours) {
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    double calculateSalary() {
        return hourlyRate * hours;
    }
}

public class Lab225_Employee_Hierarchy_with_Salary_Calculation {
    public static void main(String[] args) {
        Manager m = new Manager(60000, 10000);
        Developer d = new Developer(50, 160);

        System.out.println("Manager Salary: " + m.calculateSalary());
        System.out.println("Developer Salary: " + d.calculateSalary());
    }
    }

