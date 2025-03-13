package ex_06_Ternary_Operator;

public class Ternary_Operator_04 {
    public static void main(String[] args) {
        //check the number is even or odd

        int num = 10;
        String evennum = (num % 2 == 0) ? num + " is a even number" : num + " is a odd number";

        System.out.println(evennum);

    }
}
