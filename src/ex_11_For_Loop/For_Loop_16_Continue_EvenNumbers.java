package ex_11_For_Loop;

public class For_Loop_16_Continue_EvenNumbers {
    public static void main(String[] args) {

        for(int i=0;i<=50;i++)
        {
            if(i%2 ==0)
            {
                System.out.println(i + " is a even number");
                continue;
            }
            System.out.println(i); // it will store the odd numbers
        }
    }
}
