
import java.util.Scanner;

/**
 * Lab Assignment 4
 * CIT-244
 * @author joshua.rodstein
 * 3.13.16
 */

public class LabAssign4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EmployeeStack es = promptUser(scan);
        System.out.println(es);

    }

    private static EmployeeStack promptUser(Scanner scan) {
        EmployeeStack empList = new EmployeeStack();
        String input, input2, input3;
        Date inputDate;
        int inputCount = 0, month = 0, day = 0, year = 0, departCode;
        double inputVal, inputVal2;

        System.out.print("How many new employees to enter? --> ");
        inputCount = scan.nextInt();

        for (int i = 0; i < inputCount; i++) {
            switch (getInputChoice(scan)) {
                case 1:
                    Employee ee = createEmployee(scan);
                    empList.push(ee);
                    break;
                case 2:
                    HourlyEmployee he = createHourlyEmployee(scan);
                    empList.push(he);
                    break;
                case 3:
                    SalariedEmployee se = createSalariedEmployee(scan);
                    empList.push(se);
                    break;
                case 4:
                    inputCount = 0;
                    break;
                default:
                    inputCount = 0;
                    break;
            }

        }
        return empList;
    }

    private static int getInputChoice(Scanner scan) {
        int inputChoice = 0;
        do {
            System.out.print("Choose from the following menu:"
                    + "\n1 - Enter a base employee"
                    + "\n2 - Enter a hourly employee"
                    + "\n3 - Enter a salary employee"
                    + "\n4 - To quit entering employees"
                    + "\nEnter choice --> ");
            inputChoice = scan.nextInt();
        } while (inputChoice < 1 || inputChoice > 4);
        scan.nextLine();  //clear buffer
        return inputChoice;
    }

    private static Employee createEmployee(Scanner scan) {
        String input, input2, input3;
        Date inputDate;
        int month = 0, day = 0, year = 0, departCode;
        do {
            System.out.print("Enter your name --> ");
            input = scan.nextLine();
        } while (!input.matches("[a-zA-Z]+([ '-][a-zA-Z]+)*"));
        do {
            System.out.print(
                    "Enter hire date in the format MM DD YYYY with spacing --> ");
            input2 = scan.nextLine();
        } while (!input2.matches("[0-1][0-9][ ][0-3][0-9][ ][2][0]\\d{2}"));
        month = Integer.parseInt(input2.substring(0, 2));
        day = Integer.parseInt(input2.substring(3, 5));
        year = Integer.parseInt(input2.substring(6));
        inputDate = new Date(month, day, year);
        do {
            System.out.print(
                    "Enter the department code in the format #### --> ");
            input3 = scan.nextLine();
        } while (!input3.matches("[1-9]\\d{2}[0]"));
        departCode = Integer.parseInt(input3);
        return new Employee(input, inputDate, departCode);

    }

    private static HourlyEmployee createHourlyEmployee(Scanner scan) {
        String input, input2, input3;
        Date inputDate;
        int month = 0, day = 0, year = 0, departCode;
        double inputVal, inputVal2;
        do {
            System.out.print("Enter your name --> ");
            input = scan.nextLine();
        } while (!input.matches("[a-zA-Z]+([ '-][a-zA-Z]+)*"));
        do {
            System.out.print(
                    "Enter hire date in the format MM DD YYYY with spacing --> ");
            input2 = scan.nextLine();
        } while (!input2.matches("[0-1][0-9][ ][0-3][0-9][ ][2][0]\\d{2}"));
        month = Integer.parseInt(input2.substring(0, 2));
        day = Integer.parseInt(input2.substring(3, 5));
        year = Integer.parseInt(input2.substring(6));
        inputDate = new Date(month, day, year);
        do {
            System.out.print(
                    "Enter the department code in the format #### --> ");
            input3 = scan.nextLine();
        } while (!input3.matches("[1-9]\\d{2}[0]"));
        departCode = Integer.parseInt(input3);
        do {
            System.out.print("Enter the hourly rate in the format #.##"
                    + " with decimal point --> ");
            input3 = scan.nextLine();
        } while (!input3.matches("[0-9]+[.]\\d{2}"));
        inputVal = Double.parseDouble(input3);
        do {
            System.out.print(
                    "Enter the monthly hours worked in the format ##.## with"
                    + " decimal point --> ");
            input3 = scan.nextLine();
        } while (!input3.matches("[0-9]+[.]\\d{2}"));
        inputVal2 = Double.parseDouble(input3);
        return new HourlyEmployee(
                input, inputDate, departCode, inputVal, inputVal2);
    }

    private static SalariedEmployee createSalariedEmployee(Scanner scan) {
        String input, input2, input3;
        Date inputDate;
        int month = 0, day = 0, year, departCode;
        double inputVal;
        do {
            System.out.print("Enter your name --> ");
            input = scan.nextLine();
        } while (!input.matches("[a-zA-Z]+([ '-][a-zA-Z]+)*"));
        do {
            System.out.print(
                    "Enter hire date in the format MMM DD YYYY "
                    + "with spacing --> ");
            input2 = scan.nextLine();
        } while (!input2.matches("[0-1][0-9][ ][0-3][0-9][ ][2][0]\\d{2}"));
        month = Integer.parseInt(input2.substring(0, 2));
        day = Integer.parseInt(input2.substring(3, 5));
        year = Integer.parseInt(input2.substring(6));
        inputDate = new Date(month, day, year);
        do {
            System.out.print(
                    "Enter the department code in the format #### --> ");
            input3 = scan.nextLine();
        } while (!input3.matches("[1-9]\\d{2}[0]"));
        departCode = Integer.parseInt(input3);
        do {
            System.out.print(
                    "Enter the yearly salary #.## with decimal point --> ");
            input3 = scan.nextLine();
        } while (!input3.matches("[0-9]+[.]\\d{2}"));
        inputVal = Double.parseDouble(input3);

        return new SalariedEmployee(
                input, inputDate, departCode, inputVal);

    }

}
