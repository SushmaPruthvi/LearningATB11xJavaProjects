package ex_07_If_Condition;
import java.util.Scanner;

public class Task_001_if_Else_Scanner_Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int number = scanner.nextInt();

         if(number%2==0)
         {
             System.out.println(number + " is the even number");
         }
         else
         {
             System.out.println(number + " is not a even number");
         }
    }
}
