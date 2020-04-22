import java.util.Map;
import java.util.HashMap; 
import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
     //Declare object
    Scanner in = new Scanner(System.in);
    Map<Integer, Integer> integerCounterList = new HashMap<>(); //For storing integer and frequency respectively

    //Get input
    System.out.print("Please input the number of integers that you will be entering: ");
    int num = in.nextInt();

    //Loop num to get the set of integers
    for(int i = 0; i < num; i++) 
    {
      System.out.print("Please input the " + (i+1) + "/" + num + " integer of integers that you will be entering: ");
      int integerInput = in.nextInt();

      if (integerCounterList.containsKey(integerInput)) //If integerInput already in the counter list
      {
        //Replace value of existing key with +1
        integerCounterList.replace(integerInput,integerCounterList.get(integerInput) + 1);
      }
      else {
        //Insert key-value pair into the hashmap
        integerCounterList.put(integerInput,1);
      }
    }
    in.close(); //No further input required, close scanner to limit resource leak

    Map.Entry<Integer, Integer> highestModeEntry = null; //Need a null value for to insert the first entry
    for(Map.Entry<Integer, Integer> current : integerCounterList.entrySet()) //.entrySet returns all entries.
    {
      if (highestModeEntry == null || (current.getValue() > highestModeEntry.getValue()) )  //Null check or if current entry has a higher frequency.
      {
        highestModeEntry = current; //replace highestMode
      }
      //else do no changes
    }
    
    System.out.println("Highest Mode Integer: " + highestModeEntry.getKey());
    
  }
}
