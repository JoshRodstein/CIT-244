
import java.util.Random;


/**
 * Lab Assignment 3   duuuuude
 * @author joshua.rodstein
 * 2/6/15
 */
public class LabAssignment3 {
    
   
    public static void main(String[] args) {
        Random numGen = new Random();
        int num1 = numGen.nextInt(50) + 1, num2 = numGen.nextInt(50) + 1;
        int largerNum = Math.max(num1, num2);
    
        System.out.println("The numbers are " + num1 + " and " + num2 +
                           "\nThe larger number is " + largerNum );
        
        
        
    }
    
}

