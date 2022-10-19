/*
 * Wyatt
 * APCSA
 * Get a file containing the specified state songs and print them
 */
import java.io.*;
public class GetStateSongs 
{
    String location = null;
    public GetStateSongs(String f) throws Exception 
    {
        String location = null;
        location = f;
        File file = new File(location);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
        br.close();
    }
}