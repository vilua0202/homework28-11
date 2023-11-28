package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] students = new String[n];
        System.out.println("Enter the names of students:");
        for (int i = 0; i < n; i++) {
            students[i] = scanner.nextLine();
        }
        Arrays.sort(students);
        for (String student : students) {
            System.out.println(student);
        }
        scanner.close();
    }
}
