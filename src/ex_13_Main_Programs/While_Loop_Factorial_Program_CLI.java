package ex_13_Main_Programs;

public class While_Loop_Factorial_Program_CLI {

    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        int factorial = 1;
        int i=1;

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
