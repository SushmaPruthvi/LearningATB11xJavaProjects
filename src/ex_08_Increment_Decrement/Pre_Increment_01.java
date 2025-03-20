package ex_08_Increment_Decrement;

public class Pre_Increment_01 {
    public static void main(String[] args) {

        int a =10;
        int b = ++a; // increment the value of 'a' first , then print/store the value.

        System.out.println(a); // 11 => 10+1;
        System.out.println(b);//  11  => 10+1;
    }
}