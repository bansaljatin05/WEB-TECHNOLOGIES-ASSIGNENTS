package assignment3;

public class Question4 {
    public static void main(String[] args) {
        int n = 51;
        while (n != 1) {

            System.out.print(n + " ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }

        System.out.println(n);
    }
}
