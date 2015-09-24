package sortsAndSearches;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] input1 = {};
        int[] input2 = {1};
        int[] input3 = {2 , 1};
        int[] input4 = {6, 7 ,2,4,3, 1, 1, 6};
        int[] input5 = {111, 1 , 43, 2 , 5, 7, 0 , -3 , 6, 7 ,2,4,3, 1, 13 , 1, 6};
        bubbleSort(input1);
        bubbleSort(input2);
        bubbleSort(input3);
        bubbleSort(input4);
        bubbleSort(input5);
        System.out.println(Arrays.toString(input1));
        System.out.println(Arrays.toString(input2));
        System.out.println(Arrays.toString(input3));
        System.out.println(Arrays.toString(input4));
        System.out.println(Arrays.toString(input5));
    }

    // Bubble Sort Implementation
    // O(n^2)
    private static void bubbleSort(int [] list) {
        for(int indexOutter = 0; indexOutter < list.length; indexOutter++) {
            for(int indexInner = 0; indexInner < list.length - 1 - indexOutter; indexInner++) {
                int first = list[indexInner];
                int second = list[indexInner + 1];

                if(first > second) {
                    list[indexInner] = second;
                    list[indexInner + 1] = first;
                }
            }
        }
    }
}
