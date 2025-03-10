package ex_01_Java_Basic;

public class Mutiple_main_methods {
    public static void main(String[] args) {
        System.out.println("JVM will read String[]");
    }

    public static void main(String args) {
        System.out.println("JVM will read String");
    }

    public static void main(int args) {
        System.out.println("JVM will read int");
    }
}
