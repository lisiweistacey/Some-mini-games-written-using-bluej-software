/**
 * This class will implement regular digital output.
 * Print all possible times when all the three numbers are the same.
 * Print all cases from the time entered between the previous hour and the next hour.
 * 
 * @author Siwei Li
 * @version March 13, 2022
 */
public class ModuloOperator
{
    /**
     * This is a constructor with two integer arguments.
     * It implements numeral arithmetic and printing.
     */
    public ModuloOperator(int dividend, int length)
    {
        // Define a local variable called base
        int base = 10;
        // Define a local variable called divisor
        int divisor = 0;
        // Define a local variable called result
        int result = 0;
        while(length!= 0)
        {
            // The Math.pow() function returns the exponential power of cardinality to divsor
            divisor = (int)Math.pow(base,length);
            // Dividend assigns the remainder of the divisor to the result of the result 
            result = dividend % divisor;
            // The value of length minus one
            length = length - 1;
            // Print out the results
            System.out.println(result);
        }
    }
}

