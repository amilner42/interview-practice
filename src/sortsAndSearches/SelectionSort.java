package sortsAndSearches;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] input1 = {};
        int[] input2 = {1};
        int[] input3 = {2 , 1};
        int[] input4 = {6, 7 ,2,4,3, 1, 1, 6};
        int[] input5 = {111, 1 , 43, 2 , 5, 7, 0 , -3 , 6, 7 ,2,4,3, 1, 13 , 1, 6};
        selectionSort(input1);
        selectionSort(input2);
        selectionSort(input3);
        selectionSort(input4);
        selectionSort(input5);
        System.out.println(Arrays.toString(input1));
        System.out.println(Arrays.toString(input2));
        System.out.println(Arrays.toString(input3));
        System.out.println(Arrays.toString(input4));
        System.out.println(Arrays.toString(input5));
    }

    // Selection Sort Implementation
    // O(n^2)
    private static void selectionSort(int [] list) {
        for (int i = 0; i < list.length; i++) {
            int smallest = list[i];
            int smallestIndex = i;

            for (int j = i; j < list.length - 1; j++) {
                if(list[j + 1] < smallest) {
                    smallest = list[j + 1];
                    smallestIndex = j + 1;
                }
            }
            list[smallestIndex] = list[i];
            list[i] = smallest;
        }
    }
}
