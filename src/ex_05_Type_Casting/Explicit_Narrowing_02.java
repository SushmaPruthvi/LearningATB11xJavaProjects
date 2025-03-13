package ex_05_Type_Casting;

public class Explicit_Narrowing_02 {
    public static void main(String[] args) {
        long phonenumber = 9876543212l;
        short s = (short) phonenumber;

        System.out.println(s);
    }
}
