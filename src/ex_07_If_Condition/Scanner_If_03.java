package ex_07_If_Condition;

import java.util.Scanner;

public class Scanner_If_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println(age);

        if(age>18)
        {
            System.out.println("Allowed to vote");
        }
        else {
            System.out.println("Not allowed to vote");
        }
    }
}
