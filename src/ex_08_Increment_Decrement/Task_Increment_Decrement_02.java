package ex_08_Increment_Decrement;

public class Task_Increment_Decrement_02 {
    public static void main(String[] args) {
        int a = 20;
        int result = --a + a++ + a--;

        System.out.println(result);
        System.out.println(a);
    }
}
