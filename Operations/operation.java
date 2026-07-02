package Operations;

public class operation {
    public static void main(String[] args) {
        System.out.println("Increment Challenge");
        int x = 5;
        int y = 25;

        System.out.println(--x + (x-- + y)); 
        System.out.println(y++ + x); 
        System.out.println(y + x*y); 
        System.out.println(--x - --y); 
    }
}
