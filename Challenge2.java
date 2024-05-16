import java.util.InputMismatchException;
import java.util.Scanner; // import the scanner
public class Challenge2 // the start of the class
{
    
    public static void StaminaTraining() //the start of the method
    {
        Scanner scanner = new Scanner(System.in); //scanner added in to take the user input 
        int points2 = 0; //setting the points method
 
        System.out.println("Hello, welcome to the exercise challenge. For this you will need to select number to choose the exercise you will do to improve overall fitness.");
        System.out.println("For your first exercise, you will choose a length to jog that you believe you will be able to do - THERE WILL BE PRECAUTION IN PLACE TO MKAE SURE YOU DO NOT PICK A LENGTH YOU CANNOT DO OR THAT IS TOO EASY!");
        System.out.println();
 
        int userJog = 0; // add in a variable for the length the user will jog
        while (true) {
            try {
                System.out.print("Enter the length you will jog (It will be measured in meters and must be over 1500): ");
                userJog = IntegerCheck.getValidIntegerInput(scanner);;
                if (userJog < 1500) {
                    System.out.println("Length must be greater than or equal to 1500. Please try again.");
                } else {
                    break; // Valid input, exit loop
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer value.");
                scanner.nextLine(); // Clear the input buffer
            }
        }
 
        System.out.println();
        System.out.println("now that you have selected to jog " + userJog + " metres, you will be given a randomly genetrated chance of pass and fail.");
        System.out.println("If you fail, you will do burpees!");
 
         int randomChance = (int) (Math.random()*2) + 1;
         if (randomChance == 1)
         {
             for (int i = 1; i <= 6; i ++)
             {
                 System.out.println("Almost There!");
 
             }
             System.out.println("YOU CAN'T DO ANYMORE! FAIL");
             System.out.println("Do 10 burpees");
             for (int i = 1; i <= 10; i ++)
             {
                 System.out.println(i+"!");
 
             }
             points2 = points2 - 1;
         }
         else
         {
             for (int i = 1; i <= 8; i ++)
             {
                 System.out.println("Almost There!");
  
             }
             System.out.println("PASS!");
             points2 = points2 + 1;
         }
 
         System.out.println();
         System.out.println("The number was: "+randomChance+", 1 is a fail, 2 is a pass");
         System.out.println("There will be a new point system - Those who reach 10 points will be promoted.");
         System.out.println("Per successful exercise you will gain a point - you will lose a point for every fail");
         System.out.println("You now currently have: "+ points2 + " point(s) - Let's keep going!");
         System.out.println();
         System.out.println("The next exercise will be stair runs - You will up and down stairs of your own specified height for 8 reps");
         System.out.println("If you are to fail, there will be a burpees punishment. - THIS IS A GAME OF LUCK - YOU WILL RANDOMLY BE GENERATED WHETHER YOU PASS OR FAIL.");
         System.out.println("Enter the steps you will do (It will be measured in stars '*' ): ");
         int userStairs = IntegerCheck.getValidIntegerInput(scanner);
         
         for(int i = 1; i <= userStairs; i++)
         {
             for(int j = 1; j <= i; j++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }
         System.out.println();
         System.out.println("The stairs have been created, Can you succeed?");
         System.out.println("This time you will have the chance to guess whether you pass or fail. Enter either 1 or 2");
         System.out.println();
 
         int randomChance2 = (int) (Math.random()*2) + 1;
         System.out.println("Enter a number, 1 or 2: ");
         int userAnswer = InputValidator.validateUserChoice(scanner);
         if (randomChance2 != userAnswer)
         {
             for (int i = 1; i <= 6; i ++)
             {
                 System.out.println(i+"!");
 
             }
             System.out.println("YOU CAN'T DO ANYMORE! FAIL");
             System.out.println("Do 10 burpees");
             for (int i = 1; i <= 10; i ++)
             {
                 System.out.println(i+"!");
 
             }
             points2 = points2 - 1;
         }
         else
         {
             for (int i = 1; i <= 8; i ++)
             {
                 System.out.println(i+"!");
 
             }
             System.out.println("PASS!");
             points2 = points2 + 2;
         }
 
         System.out.println();
         System.out.println("The number was: "+randomChance2+", if you have the same number you have passed");
         System.out.println("This was worth additional points if you did manage to succeed. Howver, if you did not. You have only suffered a loss of one point.");
         System.out.println("You now have " +points2+ " point(s).");
         System.out.println();
         System.out.println("Let's keep going, soon you'll be able to do a lot more, much easier!");
         System.out.println();
 
         System.out.println("The next exercise will be skips - You will do a randomly generated amount of skips");
         System.out.println("If you are to fail, there will be a burpees punishment. - THIS IS A GAME OF LUCK - YOU WILL RANDOMLY BE GENERATED WHETHER YOU PASS OR FAIL.");
         System.out.println();
 
         int randomChance3 = (int) (Math.random()*50) + 15;
         System.out.println("You will do "+randomChance3+ " skips");
 
         int randomPass = (int) (Math.random()*2) + 1;
         if (randomPass != 2)
         {
             for (int i = 1; i <= 15; i ++)
             {
                 System.out.println(i+"!");
     
             }
             System.out.println("YOU CAN'T DO ANYMORE! FAIL");
             System.out.println();
             System.out.println("Do 10 burpees");
             for (int i = 1; i <= 10; i ++)
             {
                 System.out.println(i+"!");
            
             }
             points2 = points2 - 1;
         }
         else
         {
             for (int i = 1; i <= randomChance3; i ++)
             {
                 System.out.println(i+"!");
           
             }
             System.out.println("PASS!");
             points2 = points2 + 2;
         }
 
         System.out.println();
         System.out.println("The number was: "+randomPass+", 1 is a fail, 2 is a pass");
         System.out.println("You now have " +points2+ " point(s).");
         System.out.println();
         System.out.println("Let's keep going, soon you'll be able to do a lot more, much easier!");
         System.out.println();
 
         System.out.println("The next exercise will be the bleep test - You will do as many as you can - we will see how much fitness you truly have");
         System.out.println("If you are to fail - based on your guess, there will be a burpees punishment. - THIS IS A GAME OF LUCK.");
         System.out.println();
 
         int ThePassMark = (int) (Math.random()*25) + 5;
         System.out.println("Enter a number: This is how many you will do");
         int userBleeps = IntegerCheck.getValidIntegerInput(scanner);
         if (userBleeps < ThePassMark)
         {
             for (int i = 1; i <= userBleeps; i ++)
             {
                 System.out.println(i+"!");
 
             }
             System.out.println("You have run out of stamina. YOU HAVE FAILED!");
             System.out.println("Do 10 burpees");
             for (int i = 1; i <= 10; i ++)
             {
                 System.out.println(i+"!");
          
             }
             points2 = points2 - 1;
         }
         else
         {
             for (int i = 1; i <= userBleeps; i ++)
             {
                 System.out.println(i+"!");
           
             }
             System.out.println("PASS!");
             points2 = points2 + 2;
         }
       //  Pointypoints = Pointypoints + points2;
         System.out.println("The pass mark was: "+ThePassMark+", if you have the same number you have passed");
         System.out.println("This was worth additional points if you did manage to succeed. Howver, if you did not. You have only suffered a loss of one point.");
         System.out.println("You now have " +points2+ " point(s) for this section.");
         System.out.println();
         System.out.println("Let's keep going, soon you'll be able to do a lot more, much easier!");
         System.out.println();
         System.out.println("You now have " + points2 + " points");
         System.out.println("You will now have a choice of going to the brain challenge or the mass building challenge.");
         System.out.println("Select 1 - For the mass builder challenge, or Select 3 - For the brain challenge, You may also select 4 to exit and go to the next phase of the program. - Any other input will be invalidated");
         int challenge = scanner.nextInt(); // the user now can choose what they want to do next 
 
         if (challenge == 1) //if they choose 2
         {
             Challenge1.MassBuilder(); //run the method
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
             while (challenge != 1 && challenge != 3 && challenge != 4)
             {
             System.out.println("Invalid response - Enter a valid response"); // print that their is an invalid response - could make this a new method but wanted to show how While can be used to have the same logic as a testing method
             challenge = scanner.nextInt();
             }
         }
 
         scanner.close(); // close the scanner
        }
 }
