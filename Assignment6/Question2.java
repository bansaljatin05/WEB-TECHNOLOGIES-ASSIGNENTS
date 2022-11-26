package Assignment6;

public class Question2 {
    public static void add(int a, int b){
        try{
            if (a>0 && b>0) {
                System.out.println(a + b);
            }
            else{
                throw new ArithmeticException("Please enter positive numbers only");
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static void subtract(double a, double b){
        try{
            if (a>0 && b>0) {
                System.out.println(a - b);
            }
            else{
                throw new ArithmeticException("Please enter positive numbers only");
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        add(-1, 2);
        subtract(4, -5);

    }
}

