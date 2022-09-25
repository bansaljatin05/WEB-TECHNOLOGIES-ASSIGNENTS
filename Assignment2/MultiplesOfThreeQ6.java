package assignment2;

public class MultiplesOfThreeQ6 {
    public static void main(String args[]) {
        int idx = 3;
        do {
            if(idx % 3 == 0) {
                System.out.print(idx + " ");
            }
            idx++;
        } while(idx <= 36);

    }
}
