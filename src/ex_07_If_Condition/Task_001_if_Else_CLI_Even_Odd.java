package ex_07_If_Condition;

public class Task_001_if_Else_CLI_Even_Odd {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        if(number%2==0)
        {
            System.out.println(number + " is a even number");
        }
        else
        {
            System.out.println(number + " is not a odd number");
        }
    }
}