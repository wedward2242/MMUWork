public class CharacterDetails extends ImprovementsCheck
{
    protected String HairColour;
    protected String EyeColour;
    protected String Sport;
    protected String Name;

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
    
    public CharacterDetails() // Constructor method
    {
        System.out.println("Enter hair colour: ");
        HairColour = scanner.next();
        System.out.println("Enter eye colour: ");
        EyeColour = scanner.next();
        System.out.println("Enter sport: ");
        Sport = scanner.next();
        System.out.println("Enter name: ");
        Name = scanner.next();
        scanner.close();
    }
    public static void main() // Starts the Main Method to be Ran/Debugged
    {
        //Scanner scanner = new Scanner(System.in); // Takes the Input of the User via Scanner
        CharacterDetails avatar = new CharacterDetails(); // Creates a New Instance of the User Using Main Class - Runs Constructor Method
        System.out.println("Your BMI is: " +avatar.getuserBMI()); // Outputs BMI, Height, and Weight on Seperate Lines
        System.out.println("Your Height is: " + avatar.getHeight());
        System.out.println("Your Weight is: " + avatar.getWeight());
        System.out.println("Your Hair is: " + avatar.HairColour);
        System.out.println("Your Eyes are: " + avatar.EyeColour);
        System.out.println("Your Fav Sport is: " + avatar.Sport);
        System.out.println("Your Name is: " + avatar.Name);
        System.out.println("Well done, the progress you have made has progressed you to being a superhero!");
        System.out.println("And as time goes on, and the story unfolds, you go on to save the city");
        
        
    }
}
