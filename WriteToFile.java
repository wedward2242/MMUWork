import java.io.BufferedWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;
import java.util.Scanner;

class WriteToFile
{
    public static void writeToFile(String filename)
    {
            try (Scanner scanner = new Scanner(System.in);
                 FileWriter fileWriter = new FileWriter("Your Story.txt");
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
                {
                bufferedWriter.write(story.main());
                System.out.println("Successfully wrote to the file.");
                }
                catch (IOException e)
                {
                System.out.println("An error occurred.");
                e.printStackTrace();
                }
   }
}