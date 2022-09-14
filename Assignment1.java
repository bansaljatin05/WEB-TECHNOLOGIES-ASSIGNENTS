/// Jatin Bansal
/// 19104009
/// Electrical
public class Assignment1 {

    public static void main(String[] args) {

        /// QUESTION 1. ADD TO NUMBERS
        Integer x = 20, y = 12;
        Integer sum = x + y;
        System.out.println(sum);
        Integer diff = x - y;
        System.out.println(diff);

        /// QUESTION 2. MULTIPLICATION OF 2 FLOATING POINT NUMBERS
        Float a = 2.93f, b = 3.37f;
        Float product = a * b;
        System.out.println(product);

        /// QUESTION 3. COMPUTE QUOTIENT AND REMAINDER
        int c = 23, d = 5;
        int quotient = c / d;
        int remainder = c % d;
        System.out.println(quotient);
        System.out.println(remainder);

        /// SWAP VALUES OF INTEGERS WITH TEMP
        int e = 50, f = 60;
        int temp = f;
        f = e;
        e = temp;
        System.out.println(f);
        System.out.println(e);

        /// SWAP VALUES OF INTEGERS WITHOUT TEMP
        f = f + e;
        e = f - e;
        f = f - e;

        System.out.println(f);
        System.out.println(e);
    }
}
