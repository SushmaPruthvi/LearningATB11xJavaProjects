package ex_06_Ternary_Operator;

public class Task_02 {
    public static void main(String[] args) {
        String numb1 = args[0];
        String numb2 = args[1];

        int number1 = Integer.parseInt(numb1);
        int number2 = Integer.parseInt(numb2);

        int maxnumber = number1 > number2 ? number1 : number2;

        System.out.println(maxnumber);

    }
}
