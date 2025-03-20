package ex_11_For_Loop;

public class For_Loop_18_Continue_OddNumbers {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++)
        {
            if(i%2 ==0)
            {
                continue;
            }
            System.out.println(i + " is a odd number");
        }
    }
}