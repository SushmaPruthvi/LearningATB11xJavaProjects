package ex_08_Increment_Decrement;

public class Post_Increment_02 {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        System.out.println(b); // print the value of "a" first then increment so a=10 will be printing.
        System.out.println(a); // increment is done so the value incremented by 1.
    }
}
