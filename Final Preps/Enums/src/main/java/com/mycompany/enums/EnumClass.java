
package com.mycompany.enums;

public enum EnumClass {
    DSA("CALAB",400),
    PF("Mike",300),
    OOP("Shz",200);
    
    String author;
    int price;
    
    EnumClass(String author,int price){
        this.author = author;
        this.price = price;
    }
}
