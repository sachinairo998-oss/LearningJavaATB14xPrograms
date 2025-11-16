package Task.Nov16;

class Employees {
    private int id;
    private String name;
    private double salary;

    Employees(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
}

public class Lab221_Employee_Encapsulation {
    public static void main(String[] args) {
        Employees e = new Employees(1, "John Doe", 50000);

        System.out.println("Employee ID: " + e.getId() + " Employee Name: " + e.getName() +
                " Employee Salary: " + e.getSalary());

    }
}

