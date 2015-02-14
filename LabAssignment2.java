
/**
* This program calculates the area and perimeter of a rectangle
* @author joshua.rodstein
* 1.29.15
*/
public class LabAssignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double length = 2.0;
        double width = 4.0;
        
        double answer = length * 2 + width * 2;
        System.out.println("The perimeter of a rectangle with a width of " + width +   
                " and a length of " + length + " is " + answer);
        answer = length * width;
        System.out.println("The area of a rectangle with a width of " + width + 
                " and a length of " + length + " is " + answer);
        
        
        
        //double perimeter = length * 2 + width * 2;
        //double area = length * width;
        
       
     
    }
    
}
