package com.mycompany.bubblesort;

import java.util.Scanner;

public class BubbleSort {

    public static void printarray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter Elements Of Array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        //Time Complexity = O(n^2)
        //Bubble Sort
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //Swapping here
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        printarray(arr); //I am using function here to print the array
        
    }
}
