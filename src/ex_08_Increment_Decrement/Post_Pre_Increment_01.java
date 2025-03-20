package ex_08_Increment_Decrement;

public class Post_Pre_Increment_01 {
    public static void main(String[] args) {
        int a=10;
        int result = a++ + ++a;

        System.out.println(result);
        System.out.println(a);
    }
}
