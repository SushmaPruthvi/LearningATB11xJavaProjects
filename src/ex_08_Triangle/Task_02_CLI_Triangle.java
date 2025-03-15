package ex_08_Triangle;

public class Task_02_CLI_Triangle {
    public static void main(String[] args) {
        int side1 = Integer.parseInt(args[0]);
        int side2 = Integer.parseInt(args[1]);
        int side3 = Integer.parseInt(args[2]);

        if(side1==side2 && side2==side3 && side1==side3)
        {
            System.out.println("Acute Triangle");
        }
         else if (side1==side2 || side2==side3 || side1==side3)
        {
            System.out.println("Isosceles or Right angle Triangle");
        }
         else
        {
            System.out.println("Scalene Triangle");
        }
    }
}
