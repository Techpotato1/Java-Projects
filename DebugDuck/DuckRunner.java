/*  
 * Wyatt Cares
 * APCSA
 * A simple program that prints out the results of the specified string. 
*/
package DebugDuck;
import java.util.Scanner;
public class DuckRunner 
{
    // A class for clearing the screen 
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    public static void main(String[] args) 
    {
        clearScreen();
        // Declare a new scanner 
        Scanner sc = new Scanner(System.in);

        DebugDuck myDuck = new DebugDuck(21, "Ducky MC Duck Face", "Yellow", "Purple Mohawk");
        myDuck.speak(2);

        System.out.println("What would you like the duck to say?");
        String choice = sc.nextLine();
        // Make sure the answer is a valid answer and throw an exception if not. 
        try 
        {
            myDuck.speak(choice);
        } 
        catch (Exception e) 
        {
            System.out.println("Sorry, I couldn't understand that.");
            System.exit(0);
        }
        sc.close();
        System.exit(1);
    }
  
}
