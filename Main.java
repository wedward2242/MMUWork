import java.lang.Math; // Adds in Math Libary
import java.util.Scanner; // Adds in Scanner Libary/Function

//Week One and Two - Add in Measurements of Age, Height and BMI. - BMI Index for User
public class Main // Creates a class that is public - a template for a new object
{
    protected double Height; // Variables/Attributes
    protected double Weight;
    protected double userBMI;
    Scanner scanner = new Scanner(System.in); // Takes the Input of the User via Scanner

    public Main() // Constructor method
    {
        
        System.out.println("Enter Height in M: "); // Asks for User Height 
        Height = DoubleCheck.getValidDoubleInput(scanner); // Stores Response in Height Variable - This is Repeated for Weight.
        System.out.println("Enter Weight in kg: ");
        Weight = DoubleCheck.getValidDoubleInput(scanner);
        userBMI = Weight/(Math.pow(Height, 2.0)); // BMI is Calculated and Stored
        
    }

    public double getHeight()
    {
        return Height;
    }

    public void setHeight(double Height)
    {
        if (Height>0)
        {
        this.Height = Height;
        }
        else
        {
            System.out.println("Invalid height. Please enter a positive value.");
        }
    }

    public double getWeight()
    {
        return Weight;
    }

    public void setWeight(double Weight)
    {
        if (Weight>0)
        {
        this.Weight = Weight;
        }
        else
        {
            System.out.println("Invalid height. Please enter a positive value.");
        }
    }

    public double getuserBMI()
    {
        return userBMI;
    }

    public static void main() // Starts the Main Method to be Ran/Debugged
    {
        // int Pointypoints = 0;
        Scanner scanner = new Scanner(System.in); // Takes the Input of the User via Scanner
        Main user1 = new Main(); // Creates a New Instance of the User Using Main Class - Runs Constructor Method
        System.out.println("Your BMI is: " + user1.getuserBMI()); // Outputs BMI, Height, and Weight on Seperate Lines
        System.out.println("Your Height is: " + user1.getHeight());
        System.out.println("Your Weight is: " + user1.getWeight());
        System.out.println("This will be the start of your training to becoming a self-proclaimed hero!");
        ChallengeValidator validator = new ChallengeValidator();
        
        System.out.println("There will now be three different training stages, which one would you like to start on? - choose 1 - for the mass building, choose 2 - for the exercise, choose 3 - for the brain challenge");
        int challenge = validator.getValidChallenge(scanner);
    

       switch(challenge) // Switch Case Using the Result of the Scanner as a Condition
       {
        case 1: Challenge1.MassBuilder(); // The Case that Runs if Input is '1' - Method 'MassBuilder' for 'Challenge1' Class is Ran.
        //System.out.println("You have Points");
        break;
        case 2: Challenge2.StaminaTraining(); // The Case that Runs if Input is '2' - Method 'StaminaTraining' for 'Challenge2' Class is Ran.
        //System.out.println("You have Points");
        break;
        case 3: Challenge3.BrainTraining(); // The Case that Runs if Input is '3' - Method 'BrainTraining' for 'Challenge3' Class is Ran.
        //System.out.println("You have Points");
        break;
       }

       

        scanner.close();
    }
}