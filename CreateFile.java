import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class CreateFile 
{

  public static void createfile(String filename)
   {
    try(Scanner scanner = new Scanner(System.in))
    {
      File myStory = new File(filename);
      
      if (myStory.createNewFile()) 
      {
        System.out.println("File created: " + filename);
      }
       else
      {
        System.out.println("File already exists.");

      }
      
    }
     catch (IOException e)
      {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }
}
