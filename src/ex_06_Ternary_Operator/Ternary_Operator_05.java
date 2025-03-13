package ex_06_Ternary_Operator;

import java.sql.SQLOutput;

public class Ternary_Operator_05 {
    public static void main(String[] args) {
        // find the max between the 3 numbers

        int n1 =2;
        int n2= 9;
        int n3= -11;

        //Logic building formula

        // n1>n2 and n1>n3 , then n1 is largest
        //n2>n3 and n2>n1, then n2 is largest
        // if these 2 conditions fails then "n3" is the largest number

        int max = (n1>n2) ? (n1>n3) ? n1:n3: (n2>n3) ? n2:n3;
        System.out.println(max);

    }
}
