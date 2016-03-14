
/**
 * Lab 4 Employee Class
 * CIT-244
 * @Joshua.Rodstein
 * 3.13.16
 */

public class Employee {

    private String name;
    private Date HireDate;
    private int departmentCode;
    private static int numberOfEmployees;

    public Employee() {
        name = "No Name";
        HireDate = new Date(1, 1, 2000);
        departmentCode = 0000;
        numberOfEmployees++;
    }

    public Employee(String theName, Date theDate, int theDeptCode) {
        
        if (theName == null || theDate == null)
        {
            System.out.println("Fatal Error creating employee.");
        }
        name = theName;
        HireDate = new Date(theDate);
        departmentCode = theDeptCode;
        numberOfEmployees++;
    }

    public Employee(Employee originalObject) {
        name = originalObject.getName();
        HireDate = originalObject.getHireDate(); // Must return copy of class level non primitive variables
        departmentCode = originalObject.getDepartmentCode();
        numberOfEmployees++;
    }

    public String getName() {
        return name;
    }

    public Date getHireDate() {
        return new Date(HireDate); // return new/copy of Date object... to eliminate back door
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public static int getNumberOfHired() {
        return numberOfEmployees;
    }

    public void setName(String newName) {
        name = newName;

    }

    public void setHireDate(Date newDate) {
        HireDate = newDate;
    }

    public void setDepartmentCode(int newCode) {
        departmentCode = newCode;
    }

    public String toString() {
        String hDate
                = "Name: " + this.getName()
                + "\nHired Date: " + getHireDate()
                + "\nDepartment Code: " + this.getDepartmentCode();

        return hDate;
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (!(otherObject instanceof Employee)) {
            return false;
        } else {
            Employee otherEmployee = (Employee) otherObject;
            return (name.equals(otherEmployee.name)
                    && HireDate.equals(otherEmployee.HireDate)
                    && departmentCode == otherEmployee.departmentCode);
        }
    }

}


