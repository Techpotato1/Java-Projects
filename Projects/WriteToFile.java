import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner; // Import the Scanner class 

public class WriteToFile {
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    try 
    {
      FileWriter myWriter = new FileWriter("testfile.txt");
      System.out.println("What would you like to write to the file ");
      String fileWriter = sc.nextLine();
      myWriter.write(fileWriter);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
      sc.close();
      System.exit(1);
    } 
    catch (IOException e) 
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
      System.exit(0);
    }
  }
}