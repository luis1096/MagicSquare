/**
 * tester class that prints the array of the MagicSquare class 
 */

import java.util.Scanner;
/**
 * @version 2/18/2019
 * @author Luis Oliveros[6131616]
 */
public class Tester 
{
    public static void main(String []args)
    {
      
       Scanner in = new Scanner(System.in); //scanner for user input
       boolean answer = true; //when false loop terminates and program ends
     
       while(answer == true)
       {
           System.out.println("\nSelect the size of your magic square");
           int n = in.nextInt();
           while( n % 2 == 0) //check is user selected an odd number
           {
               System.out.println("Please enter an odd number");
               n = in.nextInt();
           }
           
           //instance of the MagicSaure object created that takes n the users 
           // choice as the size param.
           MagicSquare test = new MagicSquare(n);
          
           //check if the rows,columns and diagonals are equals
           if(test.isMagic() == true) 
           {
               System.out.println(test.toString());
               System.out.println("\nThe square is magic very cool good job");
               System.out.println("\nOkay we are all done here want to try again? type (yes) otherwise type any key to quit\n");
               String choice = in.next();
               if(choice.equalsIgnoreCase("yes")) //loop continues try again
               {
                   answer = true;
               }
               else //loop ends programs stops
               {
                   answer = false;
               }        
           }
           else //not a magic square
           {
               System.out.println("\nHey something went wrong the square isnt magic");
               System.out.println("\nOkay we are all done here want to try again? type (yes) otherwise type any key to quit\n");
               String choice = in.next();
               if(choice.equalsIgnoreCase("yes")) //program continues
               {
                   answer = true;
               }
               else //program ends
               {
                   answer = false;
               }
           }
      }
      System.out.println("\nAwesome thanks for playing");
    }
}
     
    
 
    
    


