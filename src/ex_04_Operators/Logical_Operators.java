package ex_04_Operators;

public class Logical_Operators {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);

        System.out.println((!!a));

        boolean b = true || false; // this is the "OR" logic
        System.out.println(b);

        boolean c = true && true; // "AND" gate
        System.out.println(c);
    }
}
