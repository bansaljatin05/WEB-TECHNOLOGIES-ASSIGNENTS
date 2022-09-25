package assignment2;

public class PrintPowersQ5 {

    public static void main(String args[]) {
        int n = 5;
        System.out.print("n ");
        for(int i = 2; i < 5; i++) {
            System.out.print("n^" + i + " ");
        }
        System.out.println();

        for(int i = 1; i <= n; i++) {
            int k = i;
            for(int j = 1; j < 5; j++) {
                System.out.print(k + " ");
                k = k * i;
            }
            System.out.println();
        }
    }
}
