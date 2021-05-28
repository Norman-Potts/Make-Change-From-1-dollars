/*
 * Created by Norman Potts
 * Date: JAN/29/2015
 * I, Norman L. Potts created this java script code. 
 */

 package MakeChangeFrom1dollars;
 import java.util.Scanner;


/**
 * @author Norman
 *    Purpose: 
 *     Create a program that will make change for 1 dollar. 
 *     Prompt the user to enter an amount between 1 and 100.
 *     Your program will calculate and display the remaining change as a number 
 *     of quarters, dimes, nickels, and pennies.
 * 
 * Input: 
 *       A keyboard input amount between 1 and 100.
 * Processing:
 *          GET amount. CALUCULATE change as a number of quarters, dimes, nickels, and pennies.
 *          DISPLAY results.
 * Output:
 *        display remaining change, as a number of quarters, dimes, nickels, and pennies.
 * 
 * 
 * Pseudocode
 *    DECLARE variables 
 *     GET input
 *      STORE input integer variable
 *          CONVERT integer in to double variable
 *      DETERMINE min number of quarters can fit in to value.
 *      DETERMINE min number of dimes can fit in to remaining value.
 *      DETERMINE min number of nickels can fit in to remaining value.
 *      DETERMINE min number of pennies can fit in to remaining value.
 *          CREATE out put message
 *          Display out put message 
 *        end.
 * 
 */
public class MakeChangeFrom1dollars
{
           
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );//scanner that finds input data.
        
        // Variables that maybe used.
        int cent;    int dime;    int nickel;    int penny;
        
        System.out.print("Enter a integer number of cents to make change. Less than 1 dollar: ");
        cent = input.nextInt();  // Convert inputfromscanner to variablecent.     
                  
        
        System.out.printf(" The number of quarters= %3d  ",  cent/25);  // Divids cent, in to turicate number.        
       
        
        dime=cent%25; // Transfer remainder of change that is not quarters to dime test.
        System.out.printf("\n The number of dimes = %3d  ", dime/10);// Divides dime in to turnicate number.
        
           
        nickel=dime%10;// Tansfer remainder of change that is not dime to nickel test.
        System.out.printf("\n The number of nickel = %3d  ",  nickel/5);
        
           
        penny=nickel%5;
        System.out.printf("\n The number of pennies = %3d  ", penny/1);
        
    }
}
