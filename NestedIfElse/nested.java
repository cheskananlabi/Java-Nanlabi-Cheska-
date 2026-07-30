package NestedIfElse;

import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int grade = input.nextInt(); 

        if (grade < 0 || grade > 100) {
        System.out.println("Invalid grade.");
            } else if (grade >= 98) {
                System.out.println("You are with highest honor student.");
            } else if (grade >= 95) {
                System.out.println("You are with high honor student.");
            } else if (grade >= 90) {
                System.out.println("You are with honor student.");
            } else if (grade >= 75) {
                System.out.println("You passed the course.");
            } else {
                System.out.println("You failed the course.");
            }

            input.close();
    }
}