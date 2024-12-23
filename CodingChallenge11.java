package a;
import java.util.Scanner;
public class CodingChallenge11
{
  public static void main(String[] args) {

    int Number = (int) (Math.random() * 101);

    Scanner scanner = new Scanner(System.in);
    
    int guess = -1;
    int attempts = 0;

    System.out.println("Guess number between 1-100 that i chose");
    System.out.println("Every time you got wrong, you will have" + " 1 point deducted from 100");

    while (guess != Number) 
    {
        System.out.print("Enter: ");
        guess = scanner.nextInt(); 

        if (guess < 0 || guess > 100) 
        {
            System.out.println("Your guess is wrong"
                    + " Please guess between 0 and 100");
        } 
        else 
        {
            attempts++;

            if (guess < Number) 
            {
                System.out.println("  Too low ");
            } 
            else if (guess > Number) 
            {
                System.out.println(" Too high ");
            } 
            else 
            {
                System.out.println("Good job " + Number + " !");
                System.out.println("You took " + attempts + " attempts");
                int score = 100 - attempts;
                System.out.println("final score is: " + score);
            }
        }
    }
}
}
