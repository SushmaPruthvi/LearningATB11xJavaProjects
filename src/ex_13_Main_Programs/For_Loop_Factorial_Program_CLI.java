package ex_13_Main_Programs;

public class For_Loop_Factorial_Program_CLI {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        int factorial = 1;

        if(number<=0)
        {
            System.out.println(factorial);
        }
        else
        {
            for(int i=1;i<=number;i++)
            {
                factorial = factorial * i;
            }
        }
        System.out.println("Factorial of " + number + " is " + factorial );
    }
}
