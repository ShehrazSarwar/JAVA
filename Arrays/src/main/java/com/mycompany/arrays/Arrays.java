
package com.mycompany.arrays;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter Elements Of Array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int largest = arr[0];
        int smallest = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        
        System.out.println("The Largest Number In The Array Is: " + largest);
        System.out.println("The Smallest Number In The Array Is: " + smallest);
        
        System.out.println("Array in Reverse Order: ");
        //arr.length - 1 because .length method gives us the size of the array which is 5 but index always starts from 0
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
              
}
