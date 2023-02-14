/**
 * This class can print out all of the possible times the clock could display.
 * Print all possible times when all the three numbers are the same.
 * Print all cases from the time entered between the previous hour and the next hour.
 * 
 * @author Siwei Li
 * @version March 11, 2022
 */
public class DigiClock
{ 
    /**
     * This method prints all possible times when all the three numbers are the same 
     */
    public void printAllClockCombinations()
    {
        // Define three variables
        int hours, minutes, seconds;
        for(hours = 00; hours <= 23; hours++)
        {
            for(minutes = 00; minutes <= 59; minutes++)
            {
                for(seconds = 00; seconds <= 59; seconds++)
                {
                    if(hours == minutes && minutes == seconds)
                    {
                        // Print all the cases when the three numbers are the same
                        System.out.println(+ hours + ":" + minutes + ":" + seconds);
                    }
                }
            }
        }
    }
    /**
     * Prints all cases from the time entered between the previous hour and the next hour. 
     */
    public void printSomeClockCombinations(int hours, int minutes, int seconds)
    {
        // Replace the entered time with the corresponding number
        int number = hours * 3600 + minutes * 60 + seconds;
        // Representation of the previous hour
        int previousHour = (number - 3600) % 86400;
        // Representation of the next hour
        int nextHour = (number + 3600) % 86400;
        for(int i = previousHour; i <= nextHour; i = (i + 1) % 86400)
        {
            // Numbers are converted to time
            hours = i / 3600;
            minutes = (i - hours * 3600) / 60;
            seconds = i - hours * 3600 - minutes * 60;
            if(minutes % 2 == 1)// Judge if it is odd number
            {
                System.out.println(+ hours + ":" + minutes + ":" + seconds);
            }
            
        }
    }
}
