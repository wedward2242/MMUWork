public class Run {
    public static void main(String[] args) // Starts the Main Method to be Ran/Debugged
    {
        Main.main(); //Calls and runs the main method
        System.out.println("Your story will no be stored in a file called - Your Story.txt");
        CreateFile.createfile("Your Story.txt");
        WriteToFile.writeToFile("Your Story.txt");
        story.main();
        System.out.println("Here is your story: ");
        ReadFile.readfile();
        System.out.println("You can now edit your story any way you would like :) by looking into the file destination of the code");
    }

}
