package assignment2;

public class PopulationQ4 {
    public static void main(String args[]) {
        double population = 80000;
        int years = 0;
        while(population < 150000) {
            years++;
            population += population * 0.05;
        }

        System.out.println(years);
    }
}
