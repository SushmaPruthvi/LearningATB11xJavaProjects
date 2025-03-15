package ex_08_Triangle;

import java.util.Scanner;

public class Task_01_Scanner_Triangle {
    public static void main(String[] args) {
        Scanner trianglesides = new Scanner(System.in);
        int side1 = trianglesides.nextInt();
        int side2 = trianglesides.nextInt();
        int side3 = trianglesides.nextInt();

        if(side1==side2 && side2==side3 && side1==side3)
        {
            System.out.println("Acute Triangle");
        }
       else if (side1 == side2 || side2 == side3 || side1 == side3)
        {
            System.out.println("Isosceles or Right angle Triangle");
        }
       else
        {
            System.out.println("Scalene Triangle");
        }
    }
}
