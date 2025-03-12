package ex_04_Operators;

public class Arithmetic_Operators {
    public static void main(String[] args) {

        // +, -, *, /, % :: these are the arithmetic operators

        int a= 20;
        int b = 3;
        float c = 20f;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);// only integer value will come not decimal value because the both are integer
        System.out.println(a*b);
        System.out.println(a%b); // this is the modulus operator which gives the remainder as output
        System.out.println(c/b); // it will give the decimal value because float value is used
    }
}
