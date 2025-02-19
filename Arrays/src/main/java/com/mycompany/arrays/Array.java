
package com.mycompany.arrays;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        
        if(n <= 0){
            System.out.println("Invalid array size. Please enter a positive integer.");
            return;
        }
        
        int[] arr = new int[n];
        
        System.out.println("Enter Elements Of Array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int largest = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        
        System.out.println("The Largest Integer In The Array Is: " + largest);
        }
    }            
