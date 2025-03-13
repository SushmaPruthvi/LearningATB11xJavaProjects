package ex_06_Ternary_Operator;

public class Ternary_Operator_Interview_06 {
    public static void main(String[] args) {
        // age = 23 classify if for adult, minor, Senior  (adult = 18+, Minor = <18, Senior = 65

        //int age = 10;

        String age1 = args[0];
        int age = Integer.parseInt(age1); // we can use this and pass the value in the "Edit Configuration"




        String ageclassify = (age>18) ? (age>=65) ? "Senior" : "Adult": "Minor";

        System.out.println(ageclassify);
    }
}
