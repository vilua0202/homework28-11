package org.example;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the character to find:");
        char x = scanner.nextLine().charAt(0);
        int lastIndex = input.lastIndexOf(x);
        if (lastIndex != -1) {
            System.out.println("Last position of '" + x + "': " + lastIndex);
        } else {
            System.out.println("Character '" + x + "' not found in the string.");
        }
        scanner.close();
    }
}
