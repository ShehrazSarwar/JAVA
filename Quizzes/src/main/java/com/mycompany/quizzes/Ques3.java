package com.mycompany.quizzes;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int n2 = sc.nextInt();
        
        int GCD = 1;
        for(int i = 1; i <= n1 && i <= n2; i++){
            if(n1 % i == 0 && n2 % i == 0){
                GCD = i;
            }
        }
        System.out.print("GCD Is: "+ GCD);
    }
}
