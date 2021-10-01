package Training;

public class Employee {
    String firstName;
    String lastName;
    double monthlySalary;


    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) this.monthlySalary = monthlySalary;
    }
}

class EmployeeTest {

    public static void main(String[] args) {
        Employee e1 = new Employee("Creigh", "Battle", 5000);
        Employee e2 = new Employee("Quinton", "Battle", 7000);

        double e1Year = e1.getMonthlySalary() * 12;
        double e2Year = e2.getMonthlySalary() * 12;

        System.out.println(e1Year);
        System.out.println(e2Year);

        e1.setMonthlySalary(e1.getMonthlySalary() * 1.1);
        e2.setMonthlySalary(e2.getMonthlySalary() * 1.1);

        double e1YearRaise = e1.getMonthlySalary() * 12;
        double e2YearRaise = e2.getMonthlySalary() * 12;

        System.out.println(e1YearRaise);
        System.out.println(e2YearRaise);


    }




}


