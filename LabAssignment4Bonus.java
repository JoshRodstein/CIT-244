import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 * Lab Assignment 4 Bonus Program
 * @author joshua.rodstein
 * 2.12.15
 */
public class LabAssignment4Bonus {

    
    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat("$#,###.00");
       
       
      
       double purchPrice = Double.parseDouble(JOptionPane.showInputDialog(null,
               "Enter the purchase price of an item: --> "));
       double salvPrice = Double.parseDouble(JOptionPane.showInputDialog(null,
               "Enter the salvage price of the item: --> "));
       int yearOfService = Integer.parseInt(JOptionPane.showInputDialog(null, 
               "Enter the number of years of service: --> "));
       double yearlyDep = (purchPrice - salvPrice) / yearOfService;
       
       
       JOptionPane.showMessageDialog(null, "For an item whose intitial purchase price was " + 
               df.format(purchPrice) + " and where\nat the end of " + yearOfService + 
               " years of service the salvage price will be " + df.format(salvPrice) + 
               ",\nthe yearly depreciation of the item will be " + df.format(yearlyDep) + 
               " per year.");
       
      
        
        
    }
    
}
