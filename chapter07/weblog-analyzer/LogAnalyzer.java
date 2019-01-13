import java.util.Arrays;
import java.util.Collections;
/**
 * Read web server data and analyse hourly access patterns.
 *
 * @author David J. Barnes and Michael Kölling.
 * @version    2016.02.29
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    private String[] people;
    private boolean[] vacant;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer(String logFileName)
    {
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader();


    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        int hour = 0;
        while(hour < hourCounts.length) {
            System.out.println(hour + ": " + hourCounts[hour]);
            hour++;
        }


        }

    public int numberOfAccesses()
    {
            int total = 0;
            for(int hour = 0; hour < hourCounts.length; hour++) {
            total = total + hourCounts[hour];
            }
            return total;
    }


    public int busiestHour()
    {
            int bussiest = 0;
            int busiestHour = 0;
            int index = 0;

            while(index < hourCounts.length - 1){
                if (bussiest < hourCounts[index]){
                    busiestHour = index;
                    bussiest = hourCounts[index];
                    index++;
                }
                else {
                    index++;
                }
            }
            return busiestHour;
    }

    public int quietestHour()
    {
            int quietest = 9999;
            int quietestHour = 0;
            int index = 0;

            while(index < hourCounts.length - 1){
                if (quietest > hourCounts[index]){
                    quietestHour = index;
                    quietest = hourCounts[index];
                    index++;
                }
                else {
                    index++;
                }
            }
            return quietestHour;
    }

    public int bussiestTwo()
    {
            int bussiest = 0; //de waarde waar mee vergeleken wordt (Drukste uur)
            int bussiestFirst = 0; //de waarde die je wilt weten (Eindwaarde)
            int index = 0; //de index wordt op nul gezet om zo door de array heen te kunnen gaan d.m.v een while-loop

            while(index < hourCounts.length - 1){ //de index moet kleiner zijn dan het laatste uur (0-23) //totdat index groter is voert hij de loop uit.
                if (bussiest < hourCounts[index] + hourCounts[index + 1]){ // wanneer bussiest kleiner is dan hourCounts +1 die de index van 'index' heeft aangenomen
                    bussiestFirst = index; // dan wordt bussiestFirst gelijkgesteld aan de index
                    bussiest = hourCounts[index] + hourCounts[index + 1]; //en dan wordt bussiest gelijkgesteld aan waar mee vergeleken werd
                    index++; //en dan wordt de index met 1 verhoogt en gaat alles weer opnieuw
                }
                else { // als bussiest groter is dan bovenstaand dan alleen index met 1 verhogen en opnieuw proberen
                    index++;
                }
            }
            return bussiestFirst; //waarde van bussiestFirst retourneren.


        }



    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
}
