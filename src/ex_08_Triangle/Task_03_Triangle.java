package ex_08_Triangle;

public class Task_03_Triangle {
    public static void main(String[] args) {
        int side1 = 2;
        int side2 = 2;
        int side3 = 2;

    if(side1==side2 && side2==side3 && side1==side3)
    {
        System.out.println("Acute Triangle");
    }
    else if (side1==side2 || side2==side3 || side1==side3)
    {
        System.out.println("Isosceles or Right angle triangle");
    }
    else
    {
        System.out.println("Scalene Triangle");
    }
    }
}
