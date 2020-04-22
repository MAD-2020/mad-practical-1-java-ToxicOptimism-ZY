import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
     /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
     //Declare Object
    Scanner in = new Scanner(System.in);

    //Get Input
    System.out.print("Please input the integer base of the right-angled triangle: ");
    int input = in.nextInt();
    in.close(); //Close scanner to limit resource leak

    for (int lines = 0; lines < input; lines++)  //loop to print lines
    {
      for (int asterick = 0; asterick < (input - lines) ; asterick++) //loop to print astericks, -lines for descending.
      {
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
}
