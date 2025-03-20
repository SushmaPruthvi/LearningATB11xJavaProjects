package ex_11_For_Loop;

public class For_Loop_17_WithoutContinue_EvenNumbers {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++)
        {
            if(i%2==0)
            {
                System.out.println(i + " is a even number");
            }
            System.out.println(i);
        }
    }
}


// all even numbers will print 2 times and odd numbers prints one time