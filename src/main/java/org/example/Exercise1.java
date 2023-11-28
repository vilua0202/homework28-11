package org.example;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Str1:");
        String str1 = scanner.nextLine();
        System.out.println("Enter Str2:");
        String str2 = scanner.nextLine();
        if (str1.contains(str2)) {
            str1 = str1.replace(str2, str2 + str2);
            System.out.println("Result: " + str1);
        } else {
            System.out.println("Str1 does not contain Str2.");
        }
        scanner.close();
    }
}
