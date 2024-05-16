import java.util.Scanner; // import the scanner
public class Challenge1 // the start of the class
{

    public static void MassBuilder() //The method that will run when called
    {
        Scanner scanner = new Scanner(System.in); //scanner to take in the user input
        
        int points = 0; // set the user points to 0

        System.out.println("Hello, welcome to the mass building challenge. For this you will need to select number to choose the exercise you will do to build mass.");
        System.out.println("Your first exercise will be bench press, you will do 65kg for 8 reps - Failure will result in a push up punishment - THIS IS A GAME OF LUCK - YOU WILL RANDOMLY BE GENERATED WHETHER YOU PASS OR FAIL.");
        System.out.println();

        int randomNumber = (int) (Math.random()*2) + 1; //allow for 1 or 2 to be randomly generated
        if (randomNumber == 1) // what happens if the random number is 1
        {
            for (int i = 1; i <= 6; i ++) // loop six times
            {
                System.out.println(i+"!"); //the rep they are on 
            }
            System.out.println("YOU CAN'T DO ANYMORE! FAIL");
            System.out.println("Do 10 push-ups"); // failure message
            for (int i = 1; i <= 10; i ++) // loops 10 times
            {
                System.out.println(i+"!");
               
            }
            points = points - 1; // removes a point from the user
        }
        else
        {
            for (int i = 1; i <= 8; i ++) // loops 8 times
            {
                System.out.println(i+"!");
                
            }
            System.out.println("PASS!"); // pass message
            points = points + 1; //adds a point to the user
        }

        System.out.println();
        System.out.println("The number was: "+randomNumber+", 1 is a fail, 2 is a pass");
        System.out.println("There will be a new point system - Those who reach 10 points will be promoted.");
        System.out.println("Per successful exercise you will gain a point - you will lose a point for every fail");
        System.out.println("You now currently have: "+ points + " point(s) - Let's keep going!");
        System.out.println();
        System.out.println("The next exercise will be bicep curls - You will curl 15kg for 8 reps");
        System.out.println("If you are to fail, there will be a push up punishment. - THIS IS A GAME OF LUCK - YOU WILL RANDOMLY BE GENERATED WHETHER YOU PASS OR FAIL.");
        System.out.println();

        int randomNumber2 = (int) (Math.random()*2) + 1;
        if (randomNumber2 == 1)
        {
            for (int i = 1; i <= 6; i ++)
            {
                System.out.println(i+"!");
                
            }
            System.out.println("YOU CAN'T DO ANYMORE! FAIL");
            System.out.println("Do 10 push-ups");
            for (int i = 1; i <= 10; i ++)
            {
                System.out.println(i+"!");
                            
            }
            points = points - 1;
        }
        else
        {
            for (int i = 1; i <= 8; i ++)
            {
                System.out.println(i+"!");
             
            }
            System.out.println("PASS!");
            points = points + 1;
        }

        System.out.println();
        System.out.println("The number was: "+randomNumber2+", 1 is a fail, 2 is a pass");
        System.out.println("You now have " +points+ " point(s).");
        System.out.println("Let's keep going, soon you'll be able to do a lot more much easier!");
        System.out.println();
        System.out.println("The next exercise will be deadlift - You will deadlift 150kg for 8 reps");
        System.out.println("If you are to fail, there will be a pull up punishment. - THIS IS A GAME OF LUCK - YOU WILL RANDOMLY BE GENERATED WHETHER YOU PASS OR FAIL. - This time, you choose the nuumber that you think the randomly generated number would be. If you are right you pass.");
        System.out.println();
        

        int randomNumber3 = (int) (Math.random()*2) + 1;
        System.out.println("Enter a number, 1 or 2: "); // asks for the user to input 1 or 2

        int userchoice = InputValidator.validateUserChoice(scanner); // scanner to take in the next input from the user - Calls the validation method, shows testing
        if (randomNumber3 != userchoice) // if the user doesnt input the same value his happens
        {
            for (int i = 1; i <= 6; i ++)
            {
                System.out.println(i+"!");
                
            }
            System.out.println("YOU CAN'T DO ANYMORE! FAIL"); // failure message
            System.out.println("Do 10 push-ups");
            for (int i = 1; i <= 10; i ++)
            {
                System.out.println(i+"!");
           
            }
            points = points - 1; // remoes a point from the user
        }
        else // if they have the same value
        {
            for (int i = 1; i <= 8; i ++) 
            {
                System.out.println(i+"!");
             
            }
            System.out.println("PASS!"); // pass message
            points = points + 2; // add two points to the user
        }

        System.out.println();
        System.out.println("The number was: "+randomNumber3+", if you have the same number you have passed");
        System.out.println("This was worth additional points if you did manage to succeed. Howver, if you did not. You have only suffered a loss of one point.");
        System.out.println("You now have " +points+ " point(s).");
        System.out.println();
        System.out.println("Let's keep going, soon you'll be able to do a lot more, much easier!");
        System.out.println("There will soon be a chance to go from this to a new type of exercise");
        System.out.println();
        System.out.println("The next exercise will be squats. You will do 100kg squats for 8 reps");
        System.out.println("If you are to fail, there will be a pull up punishment. - THIS IS A GAME OF LUCK - YOU WILL RANDOMLY BE GENERATED WHETHER YOU PASS OR FAIL. - This time, you choose the number that you think the randomly generated number would be. If you are right you pass.");
        System.out.println("This is the last mass building exercie within this mass building challenge");
        System.out.println("Thank you for participating, you will surely continue to progress!");
        System.out.println();

        int randomNumber4 = (int) (Math.random()*2) + 1;
        System.out.println("Enter a number, 1 or 2: ");
        int userchoice2 = InputValidator.validateUserChoice(scanner);
        if (randomNumber4 != userchoice2)
        {
            for (int i = 1; i <= 6; i ++)
            {
                System.out.println(i+"!");
            }
            System.out.println("YOU CAN'T DO ANYMORE! FAIL");
            System.out.println("Do 10 push-ups");
            for (int i = 1; i <= 10; i ++)
            {
                System.out.println(i+"!");

            }
            points = points - 1;
        }
        else
        {
            for (int i = 1; i <= 8; i ++)
            {
                System.out.println(i+"!");

            }
            System.out.println("PASS!");
            points = points + 2;
        }
        //Pointypoints = Pointypoints + points;
        System.out.println();
        System.out.println("The number was: "+randomNumber4+", if you have the same numnber you have passed");
        System.out.println("This was worth additional points if you did manage to succeed. Howver, if you did not. You have only suffered a loss of one point.");
        System.out.println("You now have " +points+ " point(s) for this section.");
        System.out.println("Let's keep going, soon you'll be able to do a lot more, much easier!");
        System.out.println("You will now have a choice of going to the brain challenge or the stamina challenge.");
        System.out.println("Select 2 - For the stamina challenge, or Select 3 - For the brain challenge, You may also select 4 to exit and go to the next phase of the program. - Any other input will be invalidated");
        int challenge = scanner.nextInt(); // the user now can choose what they want to do next 
 
         if (challenge == 2) //if they choose 2
         {
             Challenge2.StaminaTraining(); //run the method
         }
         else if (challenge == 3) // if they choose 3
         {
             Challenge3.BrainTraining(); //run the method
         }
         else if (challenge == 4) //if they choose 4
         {
             System.out.println("You will now exit the games"); // exit message
             ImprovementsCheck.secondary(); // run the checking method
         }
         else
         {
             while (challenge != 2 && challenge != 3 && challenge != 4)
             {
             System.out.println("Invalid response - Enter a valid response"); // print that their is an invalid response - could make this a new method but wanted to show how While can be used to have the same logic as a testing method
             challenge = scanner.nextInt();
             }
         }
 
         scanner.close(); // close the scanner
        }
 }
