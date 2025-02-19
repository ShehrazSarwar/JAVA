
package com.mycompany.quizzes;

import java.util.Scanner;


public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int n2 = sc.nextInt();
        
        int fact_1 = 1, fact_2 = 1;
        for(int i = n1; i >=1; i--){
            fact_1 = fact_1 * i;
        }
        for(int i = n2; i>=1; i--){
            fact_2 = fact_2 * i;
        }
        double cal_fact = (double)fact_1/fact_2;
        System.out.println("Calculation of factorials is: "+ cal_fact);
  }
}