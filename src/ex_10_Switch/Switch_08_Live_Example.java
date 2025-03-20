package ex_10_Switch;

import java.util.Scanner;

public class Switch_08_Live_Example {
    public static void main(String[] args) {

        //String browser = args[0];

        Scanner scanner = new Scanner(System.in);
        String browser = scanner.next();

        switch (browser)
        {
            case "chrome":  // this value is case-sensitive
                System.out.println("chrome browser is launched");
                break;

            case "edge": // this value is case-sensitive
                System.out.println("edge browser is launched");
                break;

            case "firefox": // this value is case-sensitive
                System.out.println("firefox browser is launched");
                break;

            default:
                System.out.println("none of the browser is launched");
                break;
        }
    }
}
