
import java.text.DecimalFormat;

/**
 * Lab 4 Salaried Employee Class
 * Extends Employee
 * @author joshua.rodstein
 * 3.13.16
 */

public class SalariedEmployee extends Employee {

    // field variable
    private double salary;

    public SalariedEmployee() {

        super(); // optional
        salary = 0.0;
    }

    public SalariedEmployee(String theName, Date theDate, int theDeptCode,
            double theSalary) {
        // calling superclass contructor "employee class constructor"
        super(theName, theDate, theDeptCode);
        if (theSalary >= 0) {
            salary = theSalary;
        } else {
            System.err.println("Fatal Error creating salaried employee.");
            System.exit(0);
        }
    }

    public SalariedEmployee(SalariedEmployee theOriginalObject) {
        super(theOriginalObject);
        this.salary = theOriginalObject.getSalary();
    }

    public double getSalary() {
        return salary;
    }

    public double getPay() {

        return salary / 12;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("##,##0.00");
        String s
                = super.toString() + "\n"
                + df.format(salary) + " per year";

        return s;
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            SalariedEmployee se = (SalariedEmployee) otherObject;
            return (super.equals(otherObject) && this.salary == se.salary);
        }

    }
}
