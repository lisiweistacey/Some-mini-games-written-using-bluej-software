/**
 * Add definitions for fields and initialise them.
 * Determine whether the number entered is an integer or not, whether it is an even number.
 * 
 * @author Siwei Li
 * @version March 11, 2022
 */
public class NumberChecking
{
    // The number field of type double
    private double number;
    // The result field of type int 
    private int result;
    // The remainder field of type int 
    private int remainder ;
    /**
     * The constructor of the NumberChecking class that has one parameter of the double type.
     * Initialise fields.
     * If the number field holds a negative integer, compute its absolute value and assign it to the result field. 
     * If the number field holds a positive integer, compute the division of the number by two. 
     * Assign the remainder of this division to the remainder field. Assign the quotient of the division to the result field. 
     */
    public NumberChecking(double value)
    {
        // Initialise the number field with the constructor parameter
        number = value;
        // Initialise result with 0
        result = 0;
        // Initialise remainder with 0
        remainder = 0;
        if(number < 0 && number == (int)number) // The number field holds a negative integer
        {
            // Calculates its absolute value
            number = -number; 
            // Assign the value of number to the result field
            result = (int)number;
        }
        else if(number > 0 && number == (int)number) // The number field holds a positive integer
        {
            // Compute the division of the number by two and assign the remainder of this division to the remainder field
            remainder = (int)(number %= 2);
            // Assign the quotient of the division to the result field
            result  = (int)(number /= 2); 
        }
    }

    /**
     * This method can check if the value held by the number field has a decimal part or not.
     * It can also check if the value inside the number field is an even number.
     * Print judgment conclusions.
     */
    public void checkNumberType()
    {
        // checks if the value held by the number field has a decimal part or not
        if(number != (int)number)
        {
            // It has a decimal part, print "The number XY has a decimal part"
            System.out.println("The number XY has a decimal part");
        }
        else
        {
            // It does not have a decimal part, print "The number XY does nothave a decimal part"
            System.out.println("The number XY does not have a decimal part");
            // check if the value inside the number field is an even number.
            if((number %= 2) == 0)
            {
                // It is an even number , print "The number XY is an even number"
                System.out.println("The number XY is an even number");
            }
            else
            {
                // It is an odd number, print "The number XY is an odd number"
                System.out.println("The number XY is an odd number ");
            }
        }
    }
}
