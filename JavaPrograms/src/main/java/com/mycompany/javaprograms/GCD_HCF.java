package com.mycompany.javaprograms;

import java.util.Scanner;

public class GCD_HCF {
    public static void main(String[] args)
    {
        System.out.println("Enter Two Numbers To Find Their GCD(HCD):");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        
        int GCD = 1;
        
        for(int i=1;i<=num1 && i<=num2; i++)
        {
            if(num1 % i == 0 && num2 % i == 0)
            {
                GCD = i;
            }
        }
        
        System.out.println("The Greatest Common Divisor Or HCF Of "+ num1 +" and "+ num2 +" Is: "+ GCD);
    }
}
