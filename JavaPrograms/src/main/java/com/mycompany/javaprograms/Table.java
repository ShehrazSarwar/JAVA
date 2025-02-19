
package com.mycompany.javaprograms;


public class Table {
    public static void main(String[] args)
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println("Table Of: "+i);
            for(int j=1; j<=10; j++)
            {
                System.out.println(i+" X "+ j +" = "+ i*j);
            }
            System.out.println();
            
        }
    }
    
}
