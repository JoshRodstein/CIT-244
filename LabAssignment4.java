import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Lab Assignment 4
 * @author joshua.rodstein
 * 2.12.15
 */
public class LabAssignment4 {

    
    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat("$#,###.00");
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter the purchase price of an item: --> ");
       double purchPrice = Double.parseDouble(scan.nextLine());
       System.out.print("Enter the salvage price of the item: --> ");
       double salvPrice = Double.parseDouble(scan.nextLine());
       System.out.print("Enter the number of years of service: --> ");
       int yearOfService = Integer.parseInt(scan.nextLine());
       double yearlyDep = (purchPrice - salvPrice) / yearOfService;
       
       
       System.out.println("For an item whose intitial purchase price was " + 
               df.format(purchPrice) + " and where\nat the end of " + yearOfService + 
               " years of service the salvage price will be " + df.format(salvPrice) + 
               ",\nthe yearly depreciation of the item will be " + df.format(yearlyDep) + 
               " per year.");
       
      
        
        
    }
    
}
