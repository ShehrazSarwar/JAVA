
package com.mycompany.enums;

public class Main {
    public static void main(String args[]){
        
        System.out.println("Printing Only One Book Data: ");
        System.out.println("Book Name: " + EnumClass.DSA);
        System.out.println("Author: " + EnumClass.DSA.author);
        System.out.println("Price: " + EnumClass.DSA.price);
        
        System.out.println("\nUsing Loop To Print All: ");
        String find = "Mike";
        for(EnumClass i: EnumClass.values()){
            System.out.println("Book Name: "+ i + "\nAuthor: "+ i.author + "\nPrice: "+ i.price);
            if(i.author == find){
                System.out.println("Available");
            }
        }
        
}
}