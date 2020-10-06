import java.util.Scanner;
public class convertToMeters{
  public static void main(String[] args) {
    //First, I initialize the scanner.
    Scanner input = new Scanner(System.in);
    //Next, I ask for the number of feet to be turned into meters.
    System.out.println("Please enter a number of feet: ");
    //After that, I initialize the two variables, feet and meters.
    double feet = input.nextDouble();
    double meters = feet * 0.305;
    //Lastly, I print out the results.
    System.out.print(feet);
    System.out.print(" feet is equal to ");
    System.out.print(meters);
    System.out.println(" meters.");
  }
}
