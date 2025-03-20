package ex_11_For_Loop;

public class For_Loop_15_Continue {
    public static void main(String[] args) {

        for(int i=0;i<=10;i++)
        {
            if( i == 5)
            {
                continue; // means if the value of i is 5 then need to skip the 12th line go to the 6th line
            }
            System.out.println(i);
        }
    }
}
  // output will be 0,1,2,3,4,6,7,8,9,10