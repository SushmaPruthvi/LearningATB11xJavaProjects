package ex_11_For_Loop;

public class For_Loop_12_Interview_Q3 {
    public static void main(String[] args) {


        // even and odd from 1 to 50

        for(int i=1;i<=50;i++)
        {
            if(i%2==0)
            {
                System.out.println(i + " is a even number");
            }
            else
            {
                System.out.println(i + " is not a even number");
            }
        }
    }
}