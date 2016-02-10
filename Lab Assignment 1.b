import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 * Lab Assignment 1b This program simulates the game of craps
 *
 * @author Joshua Rodstein 1.21.16
 */
public class LabAssignment1b {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##0.##");
        Scanner scan = new Scanner(System.in);
        int rollSum, games, win = 0;
        double perc = 0;
        boolean results;

        System.out.print("Enter the number of games you would like to play: ");
        games = scan.nextInt();
        // for loop contained by # of games entered. 
        for (int i = 0; i < games; i++) {
            // rollDice rolls twice and returns sum
            rollSum = rollDice();
            // pass rollDice to determineOutcome, which returns true for a win, and false for a loss
            results = determineOutcome(rollSum);
            if (results == true) {
                // increments win by 1 if the outcome is a win
                win++;
            }
            // calculates win percentage
            perc = (double) win / games * 100;
        }

        System.out.println("You won " + win + " games. Your winning percentage "
                + "is " + df.format(perc) + "%");

        System.exit(0);
    }

    public static int rollDice() {
        Random rollGen = new Random();
        int roll, sum = 0;

        System.out.print("You rolled ");
        // for loop rolls twice and sums the rolls
        for (int i = 0; i < 2; i++) {
            roll = rollGen.nextInt(6) + 1;
            sum += roll;
            System.out.print(roll);
            if (i == 0) {
                System.out.print(" + ");
            } else {
                System.out.println(" = " + sum);
            }
        }

        return sum;
    }

    public static boolean determineOutcome(int dice) {
        boolean win = false, repeat = false;
        int rollSum = dice, rollCount = 0, point = 0;

        do {
            
            if (rollCount == 0) {
                if (rollSum == 2 || rollSum == 3 || rollSum == 12) {
                    System.out.println("You lose");
                    win = false;
                } else if (rollSum == 7 || rollSum == 11) {
                    System.out.println("You win");
                    win = true;
                } else {
                    System.out.println("The point is " + rollSum);
                    point = rollSum;
                    repeat = true;
                    // increment rollCount by 1 to enter into 2nd half of if/else on next pass
                    rollCount++;
                }
            } else {
                // re roll once point is set and 2nd half of if/else initiated
                rollSum = rollDice();
                if (rollSum == point) {
                    System.out.println("You win");
                    win = true;
                    // boolean value set to false to exit loop
                    repeat = false;
                } else if (rollSum == 7) {
                    System.out.println("You lose");
                    win = false;
                    // boolean value set to false to exit loop
                    repeat = false;
                }
            }
        } while (repeat == true);
        
        //return outcome to record in main method
        return win;
    }

}
