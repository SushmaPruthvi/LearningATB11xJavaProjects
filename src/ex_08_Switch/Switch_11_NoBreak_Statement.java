package ex_08_Switch;

public class Switch_11_NoBreak_Statement {
    public static void main(String[] args) {
        // if JDK > 13 we can use this new type

        int a = 10;

        switch(a)
        {
            case 10 -> System.out.println("10");
            case 11 -> System.out.println("11");
            case 12 -> System.out.println("12");
            case 13 -> System.out.println("13");
            default -> System.out.println("default");
        }
    }
}
//here break statement is replaced