package assignment3;

import java.util.*;

public class SortStrings {

    /// To sort string charactersq
    public static void sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
    }

    /// To sort array of strings
    public static void sortStrings(String[] arr, boolean descending) {
        Arrays.sort(arr);
        if(descending) {
            Collections.reverse(Arrays.asList(arr));
        }
    }

    public static void main(String arg[]) {
        String arr[] = {"jatin", "bansal", "hello", "hi"};
        sortStrings(arr, false);

        for (String val: arr) {
            System.out.print(val + " ");
        }
    }



}
