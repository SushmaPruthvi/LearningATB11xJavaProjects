package ex_07_If_Condition;

public class UserInput_If_02 {
    public static void main(String[] args) {
         int age = Integer.parseInt(args[0]);

         if(age >18)
         {
             System.out.println("Allowed to vote");
         }
         else
         {
             System.out.println("Not allowed to vote");
         }
    }
}
