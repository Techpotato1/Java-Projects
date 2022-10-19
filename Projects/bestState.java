/*
 * Wyatt
 * APCSA
 * A simple program for arbitrarily deciding the best state
 */
import java.util.Random;
public class bestState 
{
    // A method for clearing the screen 
    public static void clearScreen() 
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void main(String[] args) throws Exception
    {  
        Random rand = new Random();
        clearScreen();

        System.out.println("Calculating best state");

        // Generate a random number
        int n = rand.nextInt(50);
        n += 1;

        // Provide the illusion of calculations
        for (int i = 0; i < 24; i++)
        {
            Thread.sleep(150);
            System.out.print(".");
        }
        
        // if the random number is greater than or equal to 35, california is the best state
        if (n >= 35)
        {
            System.out.println("\nCalifornia is best state!");
            System.out.println("Playing state song: ");
            Thread.sleep(1000);
            try
            {
                new GetStateSongs("C:\\Users\\65009549\\APCSA\\Projects\\stateSongs\\californiaSong.txt");
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            // if the random number is less than 15, florida is best state
            if (n < 15)
            {
                System.out.println("\nFlorida is best state!");
                System.out.println("Playing state song: ");
                Thread.sleep(1000);
                try
                {
                    new GetStateSongs("C:\\Users\\65009549\\APCSA\\Projects\\stateSongs\\floridaSong.txt");
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            else
            {
                // anything else and ohio is the best state
                System.out.println("\nOhio is best state!");
                System.out.println("Playing state song: ");
                Thread.sleep(1000);
                try
                {
                    new GetStateSongs("C:\\Users\\65009549\\APCSA\\Projects\\stateSongs\\ohioSong.txt");
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
        System.exit(1);
        //For debugging purposes
        //System.out.println(n);
    }
}
