package assignment3;

public class CountSort {

    public static void countSort(int arr[]) {
        int freq[] = new int[21];

        for(int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        int idx = 0;
        for(int i = 0; i <= 20; i++) {
            while(freq[i] != 0) {
                arr[idx++] = i;
                freq[i]--;
            }
        }
    }

    public static void main(String arg[]) {
        int arr[] = {2, 4, 2, 5, 8};
        countSort(arr);

        for(int val: arr) {
            System.out.print(val + " ");
        }
    }
}
