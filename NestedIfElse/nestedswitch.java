package NestedIfElse;

import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your strand (ICT programming or ICT-CSS): ");
        String strand = input.nextLine();

        System.out.print("Enter your grade level (11 or 12): ");
        int gradeLevel = input.nextInt();

        switch (strand) {
            case "ICT programming":
                switch (gradeLevel) {
                    case 11:
                        System.out.println("You are in ICT programming strand, Grade 11.");
                        break;
                    case 12:
                        System.out.println("You are in ICT programming strand, Grade 12.");
                        break;
                    default:
                        System.out.println("Invalid grade level for ICT programming strand.");
                }
                break;

            case "ICT-CSS":
                switch (gradeLevel) {
                    case 11:
                        System.out.println("You are in ICT-CSS strand, Grade 11.");
                        break;
                    case 12:
                        System.out.println("You are in ICT-CSS strand, Grade 12.");
                        break;
                    default:
                        System.out.println("Invalid grade level for ICT-CSS strand.");
                }
                break;

            default:
                System.out.println("Invalid strand.");
        }

        input.close();
    }
}