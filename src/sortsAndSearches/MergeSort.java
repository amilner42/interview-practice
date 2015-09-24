package sortsAndSearches;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] input1 = {};
        int[] input2 = {1};
        int[] input3 = {2 , 1};
        int[] input4 = {6, 7 ,2,4,3, 1, 1, 6};
        int[] input5 = {111, 1 , 43, 2 , 5, 7, 0 , -3 , 6, 7 ,2,4,3, 1, 13 , 1, 6};
        mergeSort(input1);
        mergeSort(input2);
        mergeSort(input3);
        mergeSort(input4);
        mergeSort(input5);
        System.out.println(Arrays.toString(input1));
        System.out.println(Arrays.toString(input2));
        System.out.println(Arrays.toString(input3));
        System.out.println(Arrays.toString(input4));
        System.out.println(Arrays.toString(input5));
    }


    // Merge Sort Implementation
    // O(nlog(n))
    // Memory: O(n) aux
    private static void mergeSort(int[] list) {
        int[] listAux = new int[list.length];
        mergeSort(list, listAux, 0, list.length - 1);
    }

    private static void mergeSort(int[] list , int[] listAux , int startIndex , int endIndex) {
        if(startIndex < endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            mergeSort(list, listAux, startIndex, middleIndex);
            mergeSort(list, listAux, middleIndex + 1, endIndex);
            merge(list, listAux, startIndex, middleIndex + 1, endIndex);
        }
    }

    private static void merge(int[] list, int[] listAux, int startIndex, int middleIndex, int endIndex) {
        for(int i = startIndex; i <= endIndex; i++) {
            listAux[i] = list[i];
        }

        // Indexes treated as constant variables, Moving treated as changing variables
        int startMoving = startIndex;
        int middleMoving = middleIndex;
        int listFinalMoving = startIndex;

        while(startMoving < middleIndex && middleMoving <= endIndex) {
            if(listAux[startMoving] <= listAux[middleMoving]) {
                list[listFinalMoving] = listAux[startMoving];
                startMoving++;
            } else {
                list[listFinalMoving] = listAux[middleMoving];
                middleMoving++;
            }
            listFinalMoving++;
        }

        // This is used to copy the left side over if any numbers remain in the left list. If all the numbers in the left list have been placed, and only number remain in te right list,
        // then they are already in sorted order and there is no need to do anything
        while(startMoving < middleIndex) {
            list[listFinalMoving] = listAux[startMoving];
            startMoving++;
            listFinalMoving++;
        }
    }
}
