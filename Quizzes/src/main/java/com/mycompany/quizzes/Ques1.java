package com.mycompany.quizzes;
import java.util.Scanner;

public class Ques1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number (n): ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + (i*i);
        }
        System.out.println("The Sum Of Square Of N Integers Is: " + sum);
    }
}
