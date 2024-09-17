package assignment5_sandeep_sir;

class Employee{
    private static int noEmployee = 0;
    private static double totalSalary = 0.0;

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        noEmployee++;
        totalSalary += salary;
    }

    public void updateSalary(double newSalary) {
    	totalSalary = totalSalary - this.salary + newSalary;
        this.salary = newSalary;
    }

    public static int getTotalEmployees() {
        return noEmployee;
    }

    public static void applyRaise(double percentage) {
        double raiseFactor = 1 + (percentage / 100);
    }

    public static double calculateTotalSalaryExpense() {
        return totalSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}


public class EmployeeData {
	public static void main(String[] args) {
		Employee emp1 = new Employee(11, "Bhavesh Gondane", 100000);
        Employee emp2 = new Employee(22, "Vivek Ghawate", 80000);

        System.out.println("Total Employees: " + Employee.getTotalEmployees());
        System.out.println("Total Salary Expense: " + Employee.calculateTotalSalaryExpense());

        emp1.updateSalary(90000);
        System.out.println("Updated Employee Details:");
        System.out.println(emp1);
        System.out.println(emp2);

        System.out.println("Applying 10% raise to all employees");
        Employee.applyRaise(10);

        System.out.println("Total Salary Expense after raise: " + Employee.calculateTotalSalaryExpense());

        System.out.println("Employee Details:");
        System.out.println(emp1);
        System.out.println(emp2);
	}
}
