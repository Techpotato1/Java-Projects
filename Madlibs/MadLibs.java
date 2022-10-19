/*
 * Wyatt Cares
 * APCSA
 * 10/18/22
 * A simple Madlibs game that allows two players to replace a word in <> in a sentence 
 */
package Madlibs;

import java.util.Scanner;

public class MadLibs {
    // A simple method the clears the screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        // Create a new scanner
        Scanner sc = new Scanner(System.in);
        clearScreen();
        // Ask user1 to enter their story
        System.out.println("Player 1: Please input your story with keywords marked as <> or enter \"[template]\" to use a template:");
        String madLib = sc.nextLine();

        // Monke 
        if (madLib.contains("[template]")) {
            madLib = "The day I saw the Monkey King <verb> was one of the most interesting days of the year. After he did that, the king played chess on his brother's <noun> and then combed his <adjective> hair with a comb made out of old fish bones. Later that same day, I saw the Monkey King dance <adverb> in front of an audience of kangaroos and wombats";
        }

        if (madLib.contains("<") == false) {
            System.out.println("No valid input found!");
            System.exit(1);
        }
        // While there is still a < in the madLib loop until it is replaced
        while (madLib.contains("<")) {
            clearScreen();
            int x = madLib.indexOf("<");
            int y = madLib.indexOf(">");
            String value1 = madLib.substring(x + 1, y);
            // Ask user2 to enter their answer for the prompt
            System.out.println("Player 2: Please input a " + value1);
            Scanner ab = new Scanner(System.in);
            madLib = madLib.replace(madLib.substring(x, y + 1), ab.nextLine());
        }
        clearScreen();
        // Print the final sentence
        System.out.println("Final sentence: \n" + madLib);
        // Close the scanner
        sc.close();
        // Exit successfully if there are no errors
        System.exit(0);
    }
}
