package assignment5;
//output will be : 10
// the static blocks will be implemented at compile time

public class Question5 {
    final static int x;

    static {
        x = 10;
    }
    public static void main(String[] args) {
        System.out.println(x);
    }
}
