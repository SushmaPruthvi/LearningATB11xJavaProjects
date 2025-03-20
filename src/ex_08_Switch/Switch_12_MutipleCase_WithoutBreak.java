package ex_08_Switch;

public class Switch_12_MutipleCase_WithoutBreak {
    public static void main(String[] args) {
        int a = 25;

        switch(a)
        {
            case 10,11,12 -> System.out.println("10");
            case 13,14,15 -> System.out.println("15");
            default -> System.out.println("none");
        }
    }
}
