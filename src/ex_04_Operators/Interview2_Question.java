package ex_04_Operators;

public class Interview2_Question {
    public static void main(String[] args) {

        int sushma_salary = 12;
        boolean b = !(sushma_salary >10 || sushma_salary < 5);
        System.out.println(b);

        //sushma_salary >10  : true
        //sushma_salary < 5  : false
        // true || false : true
        // !true : false
    }
}
