package ex_06_Ternary_Operator;

import java.util.Scanner;

public class Scanner_Task_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //enter name
        System.out.println("Enter the name");
        String name = scanner.nextLine();

        //enter age
        System.out.println("Enter the age");
        int age = scanner.nextInt();

        //enter salary
        System.out.println("Enter the salary");
        double salary = scanner.nextDouble();

        System.out.println("The user information is");
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

        scanner.close();

    }
}
