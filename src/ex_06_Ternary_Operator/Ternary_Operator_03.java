package ex_06_Ternary_Operator;

public class Ternary_Operator_03 {
    public static void main(String[] args) {


        //maximum between 2 numbers
        int x =10;
        int y = 20;

        String maxnumber = x>y ? x + " is the largest number" : y + " is the largest number"; // this is in the string
        System.out.println(maxnumber);

        int max = x>y ? x:y;
        System.out.println(max);//here we are storing the value in the integer



        //using the math operator
        System.out.println(Math.max(x,y));
    }
}
