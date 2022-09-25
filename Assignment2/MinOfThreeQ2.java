package assignment2;

public class MinOfThreeQ2 {
    public static void main(String[] args) {
        int a = 10, b = 3, c = 8;

        if(a < b && a < c) {
            System.out.println(a);
        } else if(b < a && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
