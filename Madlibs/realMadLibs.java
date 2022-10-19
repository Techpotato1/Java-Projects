package Madlibs;
import java.util.Scanner;

public class realMadLibs 
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a noun");
        String noun = sc.nextLine();

        System.out.println("Please enter a plural noun");
        String pluralNoun = sc.nextLine();

        System.out.println("Please enter a number");
        int number = sc.nextInt();

        System.out.println("I went to the animal " + noun + ", the " + pluralNoun + " and the " + number + " beasts were there.");
        
        sc.close();
    }
}
