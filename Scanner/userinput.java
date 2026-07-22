package Scanner;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Hello, " + name + "!");

        System.out.println("Enter your age:");
        int age = input.nextInt();

        if (age < 18) {
            System.out.println("You are still a minor.");
        } else {
            System.out.println("You are not a minor anymore.");
        }

        System.out.println();

        input.close();
    }
}
