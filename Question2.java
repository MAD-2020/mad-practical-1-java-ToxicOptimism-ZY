import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    
    //Declare Object
    Scanner in = new Scanner(System.in); // For user input

    //Get Input
    System.out.print("Please input height: "); 
    double height = in.nextDouble();
    System.out.print("Please input weight: "); 
    double weight = in.nextDouble(); //in.nextLine() for string
    
    in.close(); //To close the data stream because of the resource leak warning in Repl.it

    //Calculation
    double bmi = weight/(height*height); //can also use math.pow

    //Display Output
    String roundedBmi = String.format("%.2f", bmi); //For rounding to 2 d.p for Display
    System.out.println("Bmi: " + roundedBmi + "\tHeight: " + height + "\tWeight: " + weight); 
  }
}
