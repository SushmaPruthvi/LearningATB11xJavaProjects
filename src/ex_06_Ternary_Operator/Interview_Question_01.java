package ex_06_Ternary_Operator;

public class Interview_Question_01 {
    public static void main(String[] args) {

        int num = 25;
        String result = (num>30) ? (num >20 ? "Number is greater than 20" : "Number is less than 20") : "B";

        System.out.println(result);

        //Nested Ternary
    }
}
