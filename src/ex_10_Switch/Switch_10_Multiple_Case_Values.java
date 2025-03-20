package ex_10_Switch;

public class Switch_10_Multiple_Case_Values {
    public static void main(String[] args) {
        int a = 24;

        switch (a)
        {
            case 10,11,12:
                System.out.println("10");
                break;

            case 13,14,15:
                System.out.println("15");
                break;

            default:
                System.out.println("none");
                break;
        }
    }
}
