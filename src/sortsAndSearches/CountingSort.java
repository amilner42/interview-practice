package sortsAndSearches;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] input1 = {};
        int[] input2 = {1};
        int[] input3 = {2 , 1};
        int[] input4 = {6, 7 ,2,4,3, 1, 1, 6};
        int[] input5 = {-3 , 111, 1 , 43, 2 , 5, 7, 0 , -7 , 6, 7 ,2,4,3, 1, 13 , 1, 6};
        countingSort(input1 , 0 , 0);
        countingSort(input2 , 1 , 1);
        countingSort(input3 , 1 , 2);
        countingSort(input4 , 1 , 7);
        countingSort(input5 , -7 , 111);
        System.out.println(Arrays.toString(input1));
        System.out.println(Arrays.toString(input2));
        System.out.println(Arrays.toString(input3));
        System.out.println(Arrays.toString(input4));
        System.out.println(Arrays.toString(input5));
    }

    // Requires: startRange < endRange
    // Good sort if the data range is known and small compared to n
    private static void countingSort(int[] list , int startRange , int endRange) {
        // Deal with offsets
        int offset = 0;
        if(startRange != 0) {
            offset = startRange;
        }

        int lengthOfRange = endRange - startRange + 1;
        int[] counter = new int[lengthOfRange];
        for(int i = 0; i < list.length; i++) {
            counter[list[i] - offset]++;                         // Subtracting offset here to make the numbers 0 based
        }

        int indexOfList = 0;
        for(int indexOfCounter = 0; indexOfCounter < counter.length; indexOfCounter++) {
            while(counter[indexOfCounter] > 0) {
                list[indexOfList] = indexOfCounter + offset;    // Adding offset to make up for subtracted offset
                indexOfList++;
                counter[indexOfCounter]--;
            }
        }
    }
}
