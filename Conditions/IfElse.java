package Conditions;

public class IfElse {
    public static void main(String[] args) {

        System.out.println("If Statement Example");
        boolean a = 8 != 5;

        if (a) {
            System.out.println("True");
        }
        // ---------------------------

        System.out.println("If-Else Statement Example");
        int number = -1;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }
        // ---------------------------

        System.out.println("If Then Else If Statement Example");
        int age = 18;
        if (age < 13) {
            System.out.println("You are still a child.");
        } else if (age < 20) {
            System.out.println("You are now a teenager.");
        } else if (age < 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }
        
        //---------------------------
        System.out.println("Switch Statement Example");
        int day = 9;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}