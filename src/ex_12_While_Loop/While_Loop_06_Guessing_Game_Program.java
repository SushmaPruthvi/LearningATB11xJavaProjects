package ex_12_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class While_Loop_06_Guessing_Game_Program {
    public static void main(String[] args) {
// guess the number between 1 to 100

        Random random = new Random();
        int numbertoguess = random.nextInt(100)+1; // here +1 is adding because to include the 100 number as well

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");


        int guess;
        int attempts = 0;

        while(true)
        {
            guess = scanner.nextInt();
            attempts++;

            if(guess < numbertoguess)
            {
                System.out.println("Too low, try again");
            } else if (guess > numbertoguess)
            {
                System.out.println("Too high, try again");
            }
            else
            {
                System.out.println("Correct! You guessed it in \" + attempts + \" attempts");
                break;
            }
        }
    }
}