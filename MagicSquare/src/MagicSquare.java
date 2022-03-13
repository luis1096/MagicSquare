 /**Program that takes a value given by a user that must be an odd number and 
 * uses it to create a magic square in a specific algorithm made by 2-D array 
 * that has all elements of each row, column and diagonal equal to one another. 
 *
 */
/**
 * @author Luis Oliveros[6131616]
 * @version 2/18/2019
 */
public class MagicSquare 
{
    //empty 2-D Int array.
    private int board[][]; 
    
    /**Constructor that takes the value of n which will be the size of the rows
     * and columns of the 2-D array.
     * @param n the size of the arrays rows and columns.
     */
    public MagicSquare(int n)
    {
        //initializing 2-D int array with rows and columns the length of n.
        board =  new int[n][n];
        //call to method that populates the array.
        Fill(n);
    }
    
    /**Fills a 2-D array with numbers 1 to n^2 and arranges them so that all
     * rows, columns and diagonals when added and compared one to one they equal
     * the same number.
     * @param n the square matrix chosen by the user. 
     */  
    private void Fill(int n)
    {
        int preJ;
        int preI;
        int i = n - 1; //first initial value of row for 1 in the array
        int j = n / 2;//second initial of column value for 1 in the array
        
        
        //Storing each value from 1 to n^2 in correct array spot
        for (int m = 1; m <= Math.pow(n, 2); m++)  
        {
            board[i][j] = m; //position for 1 set.
            //row one to bottom column one to right.
            if(i + 1 == n)
            {
              preI = i;
              i = 0;
            }
            else
            {    
              preI = i;
              i++;
            } 
            if(j + 1 == n)
            {     
               preJ = j;
               j = 0;
            }
            else
            {
                preJ = j;
                j++;
            }
            if(board[i][j]== 0)
            {
                board[i][j] = m;
            }
            else
            {
                i = preI;
                j = preJ;
                board[i][j] = m;
                --i;
            }
//            if(j == n && i == n )
//            {
//                board[preI][preJ] = m;
//            }
        }
            
    }
    
    /**Method that prints the whole magic square for the values of the populated
     * 2-D array 
     * 
     * @return output which is the string storing the 2-D array printed in 
     * a square formed table.
     */
    public String toString()
    {
         String output = "";
            
        for (int i = 0; i < board.length ; i++) //loop through array for values
        {
            output += "\n";
            for (int j = 0; j <  board[0].length; j++) 
         {
        output += String.format("%5d", board[i][j]); //getting values one by one
         }
        }
        
        return output;
    }
    
    public boolean isMagic()
    {
        boolean magic = true;
        // calculate the sum of 
        // the first diagonal 
        int sum = 0; 
        for (int i = 0; i < board.length; i++) 
            
            sum = sum + board[i][i]; 
  
        // comare the sum of each row element to the diagonal sum
        for (int i = 0; i < board.length; i++) 
        {
            int rowSum = 0;
            
            for (int j = 0; j < board[0].length; j++) 
                
                rowSum += board[i][j]; 
  
            // check to see if every rows sum is 
            // equal to first diagonal sum 
            if (rowSum != sum)
                
                magic = false; 
               return magic;
        } 
  
        //finds the sum of colums that compares each to the first diagonal sum 
        for (int i = 0; i < board[0].length; i++)
        { 
            int colSum = 0; 
            
            for (int j = 0; j < board.length; j++) 
                
                colSum += board[j][i]; 
 
            // check if every column sum is 
            // equal to prime diagonal sum 
            if (sum != colSum)
                
                magic = false;
                return magic; 
        } 
       return magic;
    } 
    
}

  

    

