package Operations; 

public class comparisons {
    public static void main (String[] args) {
        int a = 4;
        int b = 8;
        int d = 12;

        System.out.println(a > 23 || b < a);
        System.out.println(d <= 5 || --b > --a);
        System.out.println(b-- == a++ && b++ == 10);
        System.out.println(b == 5 && b == 67);
        System.out.println(--d > a || --a == 1);

        // System.out.println
        // ((d*4) < ++b); 
        // System.out.println
        // ((a/2) >= ++d); 
        // System.out.println
        // (a-- > (b+14)); 
        // System.out.println
        // (d++ != 13); 
        // System.out.println
        // (--a < (d-7)); 
    }
}