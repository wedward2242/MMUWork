import java.util.ArrayList;
import java.util.Scanner;
public class Challenge3
{

    public static void BrainTraining()
    {

       Scanner scanner = new Scanner(System.in);
       int points3 = 0;
       System.out.println("Hello, welcome to the brain training challenge - I VOW TO MAKE YOU AS SMART AS EINSTEIN");

       System.out.println("First we must get your BMI - I want to see how much progress you have made since the start of the programme.");

        System.out.println("For your first test, you will add 7 numbers to an array - The numbers in this array will not change and will be used throught the whole of the brain testing games");
        System.out.println();

        double [] userArray = new double [7];

        System.out.println("Enter a number: ");
        double userNumber1 = DoubleCheck.getValidDoubleInput(scanner);
        System.out.println("Enter a number: ");
        double userNumber2 = DoubleCheck.getValidDoubleInput(scanner);
        System.out.println("Enter a number: ");
        double userNumber3 = DoubleCheck.getValidDoubleInput(scanner);
        System.out.println("Enter a number: ");
        double userNumber4 = DoubleCheck.getValidDoubleInput(scanner);
        System.out.println("Enter a number: ");
        double userNumber5 = DoubleCheck.getValidDoubleInput(scanner);
        System.out.println("Enter a number: ");
        double userNumber6 = DoubleCheck.getValidDoubleInput(scanner);
        System.out.println("Enter a number: ");
        double userNumber7 = DoubleCheck.getValidDoubleInput(scanner);
    
        userArray[0] = userNumber1;
        userArray[1] = userNumber2;
        userArray[2] = userNumber3;
        userArray[3] = userNumber4;
        userArray[4] = userNumber5;
        userArray[5] = userNumber6;
        userArray[6] = userNumber7;
        
        System.out.println("Well done, that is the first stage of exercise one completed");
        System.out.println();

        System.out.println("You will now need to find the sum of all of these numbers together - No calculator is permitted. If you get this wrong you will lose a point.");

        double sum = 0;
        
        System.out.println("Enter the sum of these number: ");
        double Answer1 = scanner.nextDouble();

        for(int i = 0; i<userArray.length; i++)
        {
            sum = sum + userArray[i];
            System.out.println(sum);
        }
        
        if(Answer1 == sum)
        {
            System.out.println("Well done, you have got the answer correct. Have a point");
            points3 = points3 + 1;
        }
        else
        {
            System.out.println("You have gotten the answer incorrect, you have lost a point");
            points3 = points3 - 1;
        }

        System.out.println();
        System.out.println("We will now be doing an English based test.");
        System.out.println("You will enter a words and a sentence will be collated. You will then be asked a question about the words you have entered into this array based on your input - if you are right you get 2 points if not you lose a point.");
        System.out.println();
        
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("Enter a word/character: ");
        String word1 = scanner.next();
        words.add(word1);
        System.out.println("Enter a word/character: ");
        String word2 = scanner.next();
        words.add(word2);
        System.out.println("Enter a word/character: ");
        String word3 = scanner.next();
        words.add(word3);
        System.out.println("Enter a word/character: ");
        String word4 = scanner.next();
        words.add(word4);
        System.out.println("Enter a word/character: ");
        String word5 = scanner.next();
        words.add(word5);
        System.out.println("Enter a word/character: ");
        String word6 = scanner.next();
        words.add(word6);
        System.out.println("Enter a word/character: ");
        String word7 = scanner.next();
        words.add(word7);

        int randomNumber = (int) (Math.random()*6);
        String answer = words.get(randomNumber);
        System.out.println("Enter the word/haracter from the array that you think it is?");
        String UserAnswer = scanner.next();
        if(answer != UserAnswer)
        {
            System.out.println("You have gotten the answer incorrect, you have lost a point");
            points3 = points3 - 1;
        }
        else
        {
            System.out.println("Well done, you have got the answer correct. Have a point");
            points3 = points3 + 1;  
        }

        

        
        
        System.out.println("The word was: "+answer);
        System.out.println("You have: "+points3+ " points.");
        
        System.out.println("You will now have a choice of going to the stamina challenge or the mass building challenge.");
        System.out.println("Select 1 - For the stamina challenge, or Select 2 - For the brain challenge, You may also select 4 to exit and go to the next phase of the program. - Any other input will be invalidated");
        int challenge = scanner.nextInt(); // the user now can choose what they want to do next 

        if (challenge == 1) //if they choose 2
        {
            Challenge1.MassBuilder(); //run the method
        }
        else if (challenge == 2) // if they choose 3
        {
            Challenge2.StaminaTraining(); //run the method
        }
        else if (challenge == 4) //if they choose 4
        {
            System.out.println("You will now exit the games"); // exit message
            ImprovementsCheck.secondary(); // run the checking method
        }
        else
        {
            while (challenge != 1 && challenge != 2 && challenge != 4)
            {
            System.out.println("Invalid response - Enter a valid response"); // print that their is an invalid response - could make this a new method but wanted to show how While can be used to have the same logic as a testing method
            challenge = scanner.nextInt();
            }
        }

        scanner.close(); // close the scanner
       }
}
