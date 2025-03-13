package ex_05_Type_Casting;

public class Explicit_Narrowing {
    public static void main(String[] args) {
        int a = 10;
        byte b = (byte)a; // explicit narrowing is mandatory
        System.out.println(b);
    }
}
