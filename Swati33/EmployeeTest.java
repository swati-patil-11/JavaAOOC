class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.monthlySalary = 0.0; // Default salary
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        // Ensure the salary is non-negative
        this.monthlySalary = (monthlySalary > 0) ? monthlySalary : 0.0;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise(double percentage) {
        monthlySalary += monthlySalary * (percentage / 100);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.setFirstName("John");
        emp1.setLastName("Doe");
        emp1.setMonthlySalary(3000.00);

        emp2.setFirstName("Jane");
        emp2.setLastName("Smith");
        emp2.setMonthlySalary(4000.00);

        System.out.println("Initial Yearly Salaries:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ":" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ":" + emp2.getYearlySalary());

        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println("\nYearly Salaries after 10% raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() +":" +  emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ":" + emp2.getYearlySalary());
    }
}