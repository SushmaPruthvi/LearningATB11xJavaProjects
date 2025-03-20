package ex_11_For_Loop;

public class For_Loop_19_Continue_NotEquals {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++)
        {
            if(i%2 !=0 )
            {
                  continue; // skip the odd numbers
            }
            System.out.println(i); // print the even numbers
        }
    }
}