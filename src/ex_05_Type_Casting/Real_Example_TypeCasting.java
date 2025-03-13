package ex_05_Type_Casting;

public class Real_Example_TypeCasting {
    public static void main(String[] args) {
         int course = 100;
         float GST = 100.89f;

         //if we need to store the total value in integer means need to convert the GST to integer.

        int total = course + (int)GST;
        System.out.println(total); // here 0.89 value is missing so this is explicit narrowing

        float total1 = course+GST;
        System.out.println(total1);// here 200.89 value will come so it is called as widening
    }
}
