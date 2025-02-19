
package com.mycompany.quizzes;

import java.util.Scanner;


public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i = 1; i<=10; i++){
            sum = sum + (n*i);
        }
        
        System.out.println("Sum of multiplication table of "+ n +" is: "+ sum);
        
  }
}