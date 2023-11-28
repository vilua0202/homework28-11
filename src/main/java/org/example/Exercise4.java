package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String[] words = input.trim().split("\\s+");
        System.out.println("Number of words: " + words.length);
        scanner.close();
    }
}
