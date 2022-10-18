package assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvertStringsQ5 {

    static int[][] dp;


    // create List of lists that will store all sets of operations
    static ArrayList<ArrayList<String>> array = new ArrayList<>();


    static void ChangeDP(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int[][] DP = new int[l1 + 1][l2 + 1];

        // initialize by the maximum edits possible
        for (int i = 0; i <= l1; i++)
            DP[i][0] = i;
        for (int j = 0; j <= l2; j++)
            DP[0][j] = j;

        // Compute the DP matrix
        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {

                // if the characters are same
                // no changes required
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    DP[i][j] = DP[i - 1][j - 1];
                else {

                    // minimum of three operations possible
                    DP[i][j] = min(DP[i - 1][j - 1],
                            DP[i - 1][j], DP[i][j - 1])
                            + 1;
                }
            }
        }

        // initialize to global array
        dp = DP;
    }

    // Function to find the minimum of three
    static int min(int a, int b, int c) {
        int z = Math.min(a, b);
        return Math.min(z, c);
    }

    static void PrintWays(String s1, String s2) {

        // Function to print all the ways
        printChanges(s1, s2, new ArrayList<>());

        int i = 1;

        // print all the possible ways
        for (ArrayList<String> ar : array) {
            System.out.println("\nMethod " + i++ + " : \n");
            for (String s : ar) {
                System.out.println(s);
            }
        }
    }

    static void printChanges(String s1, String s2, ArrayList<String> changes) {

        int i = s1.length();
        int j = s2.length();

        // Iterate till end
        while (true) {

            if (i == 0 || j == 0) {

                // Add this list to our List of lists.
                array.add(changes);
                break;
            }

            // If same
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                i--;
                j--;
            }

            else {
                boolean if1 = false, if2 = false;

                // Replace
                if (dp[i][j] == dp[i - 1][j - 1] + 1) {

                    // Add this step
                    changes.add("Change " + s1.charAt(i - 1)
                            + " to " + s2.charAt(j - 1));
                    i--;
                    j--;

                    // note whether this 'if' was true.
                    if1 = true;
                }

                // Delete
                if (dp[i][j] == dp[i - 1][j] + 1) {
                    if (!if1) {
                        changes.add("Delete " + s1.charAt(i - 1));
                        i--;
                    } else {
                        // If the previous method was true,
                        // create a new list as a copy of previous.
                        ArrayList<String> changes2 = new ArrayList<>(changes);

                        // Remove last operation
                        changes2.remove(changes.size() - 1);

                        // Add this new operation
                        changes2.add("Delete " + s1.charAt(i));

                        // initiate new instance of this
                        // function with remaining substrings
                        printChanges(s1.substring(0, i),
                                s2.substring(0, j + 1), changes2);
                    }

                    if2 = true;
                }

                // Add character step
                if (dp[i][j] == dp[i][j - 1] + 1) {
                    if (!if1 && !if2) {
                        changes.add("Add " + s2.charAt(j - 1));
                        j--;
                    } else {

                        // Add steps
                        ArrayList<String> changes2 = new ArrayList<>(changes);
                        changes2.remove(changes.size() - 1);
                        changes2.add("Add " + s2.charAt(j));

                        // Recursively call for the next steps
                        printChanges(s1.substring(0, i + 1),
                                s2.substring(0, j), changes2);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string 1: ");
        String s1 = input.nextLine();

        System.out.println("Enter string 2: ");
        String s2 = input.nextLine();
        // calculate the DP matrix
        ChangeDP(s1, s2);

        // Function to print all ways
        PrintWays(s1, s2);

        input.close();
    }
}