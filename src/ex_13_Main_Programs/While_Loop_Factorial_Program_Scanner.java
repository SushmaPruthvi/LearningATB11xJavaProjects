package ex_13_Main_Programs;

import java.util.Scanner;

public class While_Loop_Factorial_Program_Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();

        int factorial = 1;
        int i =1; // initialization wil be done first in while loop

        if(number<=0)
        {
            System.out.println(factorial);
        }
        else
        {
          while(i<=number)
          {
              factorial = factorial * i;

              i++;
          }
        }
        System.out.println("Factorial of " + number + " is " + factorial );
    }
}
