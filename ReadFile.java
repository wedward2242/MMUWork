import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.util.Scanner;
class ReadFile 
{
public static void readfile()
{
    try 
    {
      String filetoread = "Your Story.txt";
      File myObj = new File(filetoread);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
        System.out.println("And so the start of the story begins here, updates can be made at any time:)");
      }
      myReader.close();
    }
     catch (FileNotFoundException e) 
     {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
