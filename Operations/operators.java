package Operations;

public class operators {
    public static void main(String[] args) {
        int addend1 = 10, addend2 = 20, sum;
        sum = addend1 + addend2;
        System.out.println("Sum is: " + sum);

        int minuend = 30, subtrahend = 15, difference;
        difference = minuend - subtrahend;
        System.out.println("Difference is: " + difference);

        int multiplicand = 5, multiplier = 4, product;
        product = multiplicand * multiplier;
        System.out.println("Product is: " + product);

        int dividend = 12, divisor = 4, quotient;
        quotient = dividend/divisor;
        System.out.println("Quotient is: " + quotient);

        float dividend2 = 21, divisor2 = 4, quotient1;
        float floatQuotient = (float) dividend2/divisor2;
        System.out.println("Float Quotient is: " + floatQuotient);

        int remainder = (int) dividend % (int) divisor;
        System.out.println("Remainder is: " + remainder);
    }
}
