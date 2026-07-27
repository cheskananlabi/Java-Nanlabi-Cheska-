package Conditions;

public class IfElse {
    public static void main(String[] args) {
        System.out.println ("Coffee Shop");

        String order = "latte";
        int money = 5;

        if (money <= 3) {
            System.out.println("You don't have enough money for a Latte.");
        } else if (money <= 4) {
            System.out.println("You still need $1 for a Latte.");
        } else if (money == 5) {
            System.out.println("You just have enough money for a Latte.");
        } else {
            System.out.println("You have enough money for a Latte.");
        }
        
        //---------------------------
        System.out.println("Days in a week:");
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