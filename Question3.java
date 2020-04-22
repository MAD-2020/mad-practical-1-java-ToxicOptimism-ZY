import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
    
    //Declare Object
    Scanner in = new Scanner(System.in);

    //Get Input
    System.out.print("Please input an integer: ");
    int number = in.nextInt();
    in.close(); //To close scanner to limit resource leak once all neccessary input has been obtained.

    //Calculation
    int numSqr = number * number;

    //Display Output
    System.out.println("The number squared is: " + numSqr);
  }
}
