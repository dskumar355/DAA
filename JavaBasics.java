/*
 * Java Basics
 * Author: Dharavath Sai Kumar
 * Description: This file covers fundamental Java concepts
 * useful for beginners and interview preparation.
 */

import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {

        // 1. Printing Output
        System.out.println("Welcome to Java Basics");

        // 2. Variables & Data Types
        int age = 20;
        double height = 168.5;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Sai Kumar";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Student: " + isStudent);

        // 3. User Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);

        // 4. Conditional Statements
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // 5. Loops
        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 6. Arrays
        int[] marks = {80, 85, 90, 75, 88};
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        double average = sum / (double) marks.length;
        System.out.println("Average Marks: " + average);

        // 7. Method Call
        greetUser(name);

        // 8. Object Creation
        Student s1 = new Student("Sai Kumar", 20);
        s1.displayDetails();

        sc.close();
    }

    // Method Definition
    public static void greetUser(String username) {
        System.out.println("Hello, " + username + "! Welcome to Java.");
    }
}

// 9. Class & Constructor
class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
