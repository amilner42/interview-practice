package sortsAndSearches;

import dataStructures.Heap;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] input1 = {};
        int[] input2 = {1};
        int[] input3 = {2 , 1};
        int[] input4 = {6, 7 ,2,4,3, 1, 1, 6};
        int[] input5 = {-3 , 111, 1 , 43, 2 , 5, 7, 0 , -7 , 6, 7 ,2,4,3, 1, 13 , 1, 6};
        heapSort(input1);
        heapSort(input2);
        heapSort(input3);
        heapSort(input4);
        heapSort(input5);
        System.out.println(Arrays.toString(input1));
        System.out.println(Arrays.toString(input2));
        System.out.println(Arrays.toString(input3));
        System.out.println(Arrays.toString(input4));
        System.out.println(Arrays.toString(input5));
    }

    // Uses dataStructures.Heap
    // O(nlogn)
    private static void heapSort(int[] list) {
        Heap heap = new Heap(list);
        for(int i = list.length - 1; i >= 0; i--) {
            list[i] = heap.pop();
        }
    }
}
