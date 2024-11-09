package com.mycompany.javaprograms;

public class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if (i <= 5) {
                // Top half of the pattern
                for (int j = 1; j <= 5; j++) {
                    if (j <= 5 - i) {
                        System.out.print("    ");
                    } else {
                        System.out.print("*   ");
                    }
                }
            } else {
                // Bottom half of the pattern
                for (int j = 1; j <= (9 - i) + 1; j++) {
                    System.out.print("*   ");
                }
            }
            System.out.println();
        }
    }
}
