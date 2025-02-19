package com.mycompany.vectors;

import java.util.Scanner;
import java.util.Vector;
import java.util.Iterator;

public class Vectors {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Vector<String> vec = new Vector<>();
        vec.add("Shehraz");  //or vec.addElement() does the same thing
        vec.addElement("Sarwar");
        System.out.println(vec);
        System.out.println(vec.size());        //printing size of vector (no of elements in it)
        System.out.println(vec.capacity());   //printing capacity of vector (by default it's always 10)
        
        Vector<String> vec2 = new Vector<>();
        vec2.addAll(vec);      //copying all elements of vec into vec2
        vec2.add("Thanos");
        System.out.println(vec2);
        
        //Adding new string Jake in place of 0 index
        vec.add(0,"Jake");      //this will place Jake at 0 and shift other two string to the 1 and 2 index (shift right)
        System.out.println(vec);  
        
        //this will do the same thing like vec.add(0,"Jake")
        vec.insertElementAt("Mike", 1); //only syntax and order is change rest it does the same work like vec.add(0,"Jake") done
        System.out.println(vec);
        
        //here how you can get position of any element
        System.out.println(vec.indexOf("Shehraz"));
        
        //here how you can get any element using its index
        System.out.println(vec.get(2));
        
        //here how you can check if the element exists in the vecotr or not
        System.out.println(vec.contains("Shehraz")); //its a boolean funtion it will return only true or false
        
        //here how you can replace any element in the vector
        vec.set(2,"Lisa");
        System.out.println(vec);
        
        //this will remove element at index 2
        vec.remove(2);  //or removeElementAt(2) do the same thing
        System.out.println(vec);
        
        //this will clear the whole vector
        vec.clear();   // or vec.removeAll() do the same thing
        System.out.println(vec);
        
        //these two will print the first element and last element of the second vecotr (vec2)
        //since vec is clear we cant print its elements because there are no elements are left now in it
        System.out.println(vec2.firstElement());
        System.out.println(vec2.lastElement());
        
        //Below are the different ways to loop through the vectors but it's recommended to use 1st and 3rd way as its easier
        
        //1)
        //below loop will print all index and there specified elements both
        for(int i = 0; i < vec2.size(); i++){
             System.out.println(i +") "+ vec2.get(i));
        }
        
        //2)
        //below loop will print all elements of the vector through Iterator but without index
        Iterator<String> iterate = vec2.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }
        
        //3)
        //below loop will print all elements of the vector but without index
        //it is also work as iterator but with less complex syntax so its recommended to use this
        for(String i : vec2){   //int i: vec2 if vec2 is of type Integer
            System.out.println(i); 
        }
        
        //Here how you can take input from the user into vector
        System.out.print("Enter Size Of Vector: ");
        int size = sc.nextInt();
        
        Vector<String> newVec = new Vector <>(size);
        
        System.out.println("Enter Names: ");
        for(int i = 0; i < size; i++){
            newVec.add(i,sc.next());
            /* OR
            String names = sc.next();
            newVec.add(i,names);
            */
        }
        
        System.out.println("New Vector Created: " + newVec);
        
    }
}
