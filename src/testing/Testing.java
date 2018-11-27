/*
 * Kaia Mac
 * 
 * November 27th, 2018
 */

package testing;
import java.util.Scanner;
/**
 *
 * @author kamac8665
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner( System.in );
        
        String tempString;
        int value = 0;
        boolean valid = false;
        
        while (valid == false)
        {
            System.out.println("Enter an integer:");
            tempString = keyedInput.nextLine();
            System.out.println("");
            
            try
            {
                value = Integer.parseInt(tempString);
                valid = true;
            }
            
            catch (NumberFormatException e)
            {
                System.out.println("Sorry, that is not valid input.");
                System.out.println("");
            }    
        }
        
        System.out.println("Thank you!");
        System.out.println(value + " is a valid integer.");
        System.out.println("Let's continue with the rest of the program...");
        System.out.println("...");
        System.out.println("...");
    }
    
}
