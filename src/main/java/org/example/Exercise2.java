package org.example;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        int[] arr= new int[255];
        for (char c : input.toCharArray()) {
            arr[c]++;
        }
        System.out.println("Character counts:");
        for (char c : input.toCharArray()) {
            if (arr[c]!=0){
                System.out.println(c+" : "+arr[c]);
                arr[c]=0;
            }
        }
        scanner.close();
    }
}
