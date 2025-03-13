package ex_06_Ternary_Operator;

import java.sql.SQLOutput;

public class Task_01_Ternary_Operators {
    public static void main(String[] args) {
        //Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        String Score1 = args[0];

        int Score = Integer.parseInt(Score1);

        String Grade = (Score>=90 && Score<=100) ? "Grade A": ((Score>=80 && Score<=89))? "Grade B" : ((Score>=70 && Score<=79)) ? "Grade C" : ((Score>=60 && Score<=69))? "Grade D" : "Grade F";

        System.out.println(Grade);
    }
}
