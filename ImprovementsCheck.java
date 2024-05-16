import java.util.Scanner;
public class ImprovementsCheck extends Main
{
   
    public static void secondary()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("We will now be checking to see if you are within a Healthy range before moving up to the next level! Enter Your Previous Measurements and then Your New Measurements \n");
        
        
        
        ImprovementsCheck growthcheck = new ImprovementsCheck();
        System.out.println("Your BMI is: " + growthcheck.getuserBMI()); // Outputs BMI, Height, and Weight on Seperate Lines
        System.out.println("Your Height is: " +  growthcheck.getHeight());
        System.out.println("Your Weight is: " + growthcheck.getWeight());
 
        if (growthcheck.userBMI >= 18.5 && growthcheck.userBMI <= 24.9)
         {
             System.out.println("You have made significant growth and will progress to the next level"); 
             CharacterDetails.main();
             scanner.close();
   
         }
         else
         {
             System.out.println("You have made insignificant growth, go back and do more!");
             System.out.println("What challenge will you start on?");
             ChallengeValidator validator = new ChallengeValidator();
        
        System.out.println("There will now be three different challenges, which one would you like to start on? - choose 1 - for the mass building, choose 2 - for the exercise, choose 3 - for the brain challenge");
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
}