import java.util.Scanner;
public class NumbersRiddle {
    public static void main(String[] args)
    {
        // Declare the scanner 
        Scanner sc = new Scanner(System.in);

        // Ask the user what number they would like to input
        System.out.println("What number would you like to use?");

        // Declare the numbers and make the calculations 
        double startNumber = sc.nextDouble();
        double secondNumber = startNumber *2;
        double thirdNumber = secondNumber +6;
        double fourthNumber = thirdNumber /2;
        double finalNumber = fourthNumber - startNumber;

        if (startNumber % 1 == 0) // true: it's an integer, false: it's not an integer
        {
            System.out.println("Your number is: " + (int) Math.round(startNumber));
            System.out.println("That number doubled is: " + (int) Math.round(secondNumber));
            System.out.println("That number plus 6 is: " + (int) Math.round(thirdNumber));
            System.out.println("That number divided by 2 is: " + (int) Math.round(fourthNumber));
            System.out.println("That number subtracted by " + (int) Math.round(startNumber) + " is: " + (int) Math.round(finalNumber));
        }
        else
        {
            System.out.println("Your number is: " + startNumber);
            System.out.println("That number doubled is: " + secondNumber);
            System.out.println("That number plus 6 is: " + thirdNumber);
            System.out.println("That number divided by 2 is: " + fourthNumber);
            System.out.println("That number subtracted by " + startNumber + " is: " + finalNumber);
        }

        // Close the scanner
        sc.close();

        System.exit(0);
    }
}
