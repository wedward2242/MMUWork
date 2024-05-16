import java.util.Scanner;

class InvalidChoiceException extends Exception
{
    public InvalidChoiceException(String errorMessage)
    {
        super(errorMessage);
    }
}


class InputValidator {
    static int validateUserChoice(Scanner scanner) {
        while (true) {
            try {
                int input = scanner.nextInt();
                if (input == 1 || input == 2) {
                    return input;
                } else {
                    throw new InvalidChoiceException("Invalid input. Please enter 1 or 2.");
                   //System.out.println("Invalid input. Please enter 1 or 2.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume invalid input
            }catch (InvalidChoiceException e)
            {
                System.out.println(e.getMessage()); // Display custom error message
            }
        }
    }
}



class ChallengeValidator
{
  public int getValidChallenge(Scanner scanner)
  {
      int challenge;
      do
      {
          System.out.print("Enter your choice: ");
          while (!scanner.hasNextInt()) {
              System.out.println("Invalid input! Please enter an integer.");
              scanner.next(); // Consume the non-integer token
          }
          challenge = scanner.nextInt();
      } while (challenge < 1 || challenge > 3);

      return challenge;
  }
}

class DoubleCheck
{
    static double getValidDoubleInput(Scanner scanner)
    {
        while(true)
        {
            try
            {
                String input = scanner.next();
                double value = Double.parseDouble(input);
                if (value>0)
                {
                    return value;
                }
                else
                {
                    throw new InvalidChoiceException("Invalid input, make sure it is a double.");
                   //System.out.println("Invalid make sure you are entering a double");
                }
            }   catch(NumberFormatException e)
                {
                    System.out.println("Invalid, enter a positive numerical value");
                }catch (InvalidChoiceException e) {
                    System.out.println(e.getMessage()); // Display custom error message
                }
        }

    }
}

class IntegerCheck
{
    static int getValidIntegerInput(Scanner scanner)
    {
        while(true)
        {
            try
            {
                String input = scanner.next();
                int value = Integer.parseInt(input);
                if (value>0)
                {
                    return value;
                }
                else
                {
                    throw new InvalidChoiceException("Invalid input, make sure it is a integer.");
                    //System.out.println("Invalid make sure you are entering a integer");
                }
            }   catch(NumberFormatException e)
            {
                System.out.println("Invalid, enter a positive numerical value");
            }catch (InvalidChoiceException e) {
                System.out.println(e.getMessage()); // Display custom error message
            }
        }

    }
}

