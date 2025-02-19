package com.mycompany.stringarray;

import java.util.Scanner;

public class StringArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Size Of String Array: ");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline Which is "enter" only need to write it here if we are taking full names from the user
        
        System.out.println("Enter String Inputs: ");
        
        String[] Names = new String[size];
        
        for(int i = 0; i < size; i++){
            Names[i] = sc.nextLine();
        }
        
        System.out.println("Enter Name To Find In The Array Of Names: ");
        String Target = sc.nextLine();
        
        int found = 0;
        for(int i = 0; i < Names.length; i++){
            if(Names[i].equals(Target)){
                System.out.print("The Name Is Available At Index: "+ i);
                found++;
            }
        }
        
        if(found == 0){
            System.out.print("The Name Is Not Available");
        }
    }
}
