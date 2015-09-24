package sortsAndSearches;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] input1 = {};
        int[] input2 = {1};
        int[] input3 = {2 , 1};
        int[] input4 = {6, 7 ,2,4,3, 1, 1, 6};
        int[] input5 = {111, 1 , 43, 2 , 5, 7, 0 , -3 , 6, 7 ,2,4,3, 1, 13 , 1, 6};
        quickSort(input1);
        quickSort(input2);
        quickSort(input3);
        quickSort(input4);
        quickSort(input5);
        System.out.println(Arrays.toString(input1));
        System.out.println(Arrays.toString(input2));
        System.out.println(Arrays.toString(input3));
        System.out.println(Arrays.toString(input4));
        System.out.println(Arrays.toString(input5));
    }


    // O(n^2)
    // Average: O(nlg(n))
    // Memory aux: O(1)
    private static void quickSort(int[] list) {
        quickSort(list, 0 , list.length - 1);
    }

    private static void quickSort(int[] list , int startIndex , int endIndex) {
        if(startIndex < endIndex) {
            int pivotIndex = partition(list , startIndex , endIndex);
            quickSort(list , startIndex , pivotIndex - 1);
            quickSort(list , pivotIndex + 1 , endIndex);
        }
    }

    // Returns: index of pivot
    // Effects: moves things less than pivot to the left of pivot and things greater than pivot to the right of pivot, standard quicksort partition
    // To pick the pivot element, this function uses the common 3-pivot comparison
    private static int partition(int[] list, int startIndex, int endIndex) {
        int[] potentialPivots = {list[startIndex] , list[(startIndex + endIndex) / 2] , list[endIndex]};
        int[] potentialPivotsCopy = potentialPivots.clone();
        //insertionSort(potentialPivotsCopy);
        int pivot = potentialPivotsCopy[1];

        // Move pivot to the last element
        if(pivot == potentialPivots[0]) {
            list[startIndex] = list[endIndex];
            list[endIndex] = pivot;
        } else if(pivot == potentialPivots[1]) {
            list[(startIndex + endIndex) / 2] = list[endIndex];
            list[endIndex] = pivot;
        }

        // move all elements less than pivot to the left of i
        int lessThanIndex = startIndex;
        for(int j = startIndex; j < endIndex; j++) {
            if(list[j] < pivot) {
                int temp = list[j];
                list[j] = list[lessThanIndex];
                list[lessThanIndex] = temp;
                lessThanIndex++;
            }
        }
        list[endIndex] = list[lessThanIndex];
        list[lessThanIndex] = pivot;
        return lessThanIndex;
    }
}
