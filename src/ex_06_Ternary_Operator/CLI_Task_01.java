package ex_06_Ternary_Operator;

import java.sql.SQLOutput;

public class CLI_Task_01 {
    public static void main(String[] args) {
        String Name = args[0];
        String Age = args[1];
        String Salary = args[2];
         int age = Integer.parseInt(Age);
         Double salary = Double.parseDouble(Salary);

        System.out.println(Name);
        System.out.println(age);
        System.out.println(salary);
    }
}