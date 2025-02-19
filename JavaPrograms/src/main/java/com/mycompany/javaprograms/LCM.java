package com.mycompany.javaprograms;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args)
    {
        System.out.println("Enter Two Numbers To Find Their LCM:");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        
        int LCM = 1;
        
        if(num1>num2)
        {
            LCM = num1;
        }
        else
        {
            LCM = num2;
        }
      
        for(int i =1; i>=0; i++)
        {
            if(LCM % num1 == 0 && LCM % num2 ==0)
            {
                break;
            }
            LCM = LCM + 1;
        }
        
        System.out.println("The LCM Of "+ num1 +" and "+ num2 +" Is: "+ LCM);
    }
    
}
