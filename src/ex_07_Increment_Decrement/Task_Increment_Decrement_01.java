package ex_07_Increment_Decrement;

public class Task_Increment_Decrement_01 {
    public static void main(String[] args) {
        int a = 10;
        int result = ++a + a++ + a++;
        System.out.println(result);
        System.out.println(a);
    }
}