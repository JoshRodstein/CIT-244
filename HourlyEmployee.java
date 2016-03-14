import java.text.*;

/**
 * Lab 4 Hourly Employee Class
 * Extends Employee
 * @author joshua.rodstein
 * 3.13.16
 */

public class HourlyEmployee extends Employee {

    private double wageRate, hours;

    public HourlyEmployee() {

    }

    public HourlyEmployee(String theName, Date theDate, int theDepartmentCode,
            double theWageRate, double theHours) {
        super(theName, theDate, theDepartmentCode);
        if (theWageRate >= 0 && theHours >= 0) {
            wageRate = theWageRate;
            hours = theHours;
        } else {
            System.err.println("Fatal Error creating hourly employee.");
            System.exit(0);
        }
    }

    public HourlyEmployee(HourlyEmployee originalObject) {
        super(originalObject);
        this.wageRate = originalObject.getRate();
        this.hours = originalObject.getHours();
    }

    public double getRate() {
        return wageRate;
    }

    public double getHours() {
        return hours;
    }

    public double getPay() {
        return wageRate * hours;
    }

    public void setHours(double hoursWorked) {
        hours = hoursWorked;
    }

    public void setRate(double newWageRate) {
        wageRate = newWageRate;
    }

    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String s = 
                super.toString() + "\n" +
                nf.format(getRate()) + " per hour for " + df.format(getHours())
                + " hours";
        
        return s;
    }

    public boolean equals(Object otherObject) {
         if (otherObject == null) {
            return false;
        } else if (this.getClass() != otherObject.getClass()) {
            return false;
        } else {
            HourlyEmployee he = (HourlyEmployee) otherObject;
            return (super.equals(otherObject) && this.wageRate == he.wageRate);
        }

       
    }
}
