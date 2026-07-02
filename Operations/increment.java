package Operations;

public class increment {
    public static void main(String[] args) {
        System.out.println(
            "incrementing an integer"
        );

        int x = 5;
        System.out.println(
            "Initial value of x: " + ++x
        );
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(--x);
        System.out.println(x);
        System.out.println(x--);
        System.out.println(x);
        int y = 10;
        System.out.println((x+y));
        System.out.println(++x + y);
        System.out.println(x + ++y);
        System.out.println(x++ + y++);
        System.out.println(x + y);
        System.out.println(--x + y);
        System.out.println(x + y--);
        System.out.println(--x + ++y);
        System.out.println(x + y);
        System.out.println(--y + x);
        System.out.println(x + ++y);
    }
}