package sortsAndSearches;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] input1 = {};
        int[] input2 = {1};
        int[] input3 = {2 , 1};
        int[] input4 = {6, 7 ,2,4,3, 1, 1, 6};
        int[] input5 = {111, 1 , 43, 2 , 5, 7, 0 , -3 , 6, 7 ,2,4,3, 1, 13 , 1, 6};
        insertionSort(input1);
        insertionSort(input2);
        insertionSort(input3);
        insertionSort(input4);
        insertionSort(input5);
        System.out.println(Arrays.toString(input1));
        System.out.println(Arrays.toString(input2));
        System.out.println(Arrays.toString(input3));
        System.out.println(Arrays.toString(input4));
        System.out.println(Arrays.toString(input5));
    }

    // Insertion Sort Implementation
    // O(n^2)
    private static void insertionSort(int [] list) {
        for (int i = 0; i < list.length; i++) {
            int insertion = list[i];
            for (int j = i - 1; j >= 0; j--) {
                if (insertion < list[j]) {
                    list[j+1] = list[j];
                    list[j] = insertion;
                } else {
                    break;
                }
            }
        }
    }
}
