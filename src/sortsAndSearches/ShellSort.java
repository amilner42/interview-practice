package sortsAndSearches;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] input1 = {};
        int[] input2 = {1};
        int[] input3 = {2 , 1};
        int[] input4 = {6, 7 ,2,4,3, 1, 1, 6};
        int[] input5 = {111, 1 , 43, 2 , 5, 7, 0 , -3 , 6, 7 ,2,4,3, 1, 13 , 1, 6};
        shellSort(input1);
        shellSort(input2);
        shellSort(input3);
        shellSort(input4);
        shellSort(input5);
        System.out.println(Arrays.toString(input1));
        System.out.println(Arrays.toString(input2));
        System.out.println(Arrays.toString(input3));
        System.out.println(Arrays.toString(input4));
        System.out.println(Arrays.toString(input5));
    }

    // Improved version of insertion sort
    private static void shellSort(int[] list) {
        // These gaps are supposed to be the best, determined by empirical testing (not mine, Marcin Ciura's gap sequence)
        int[] gaps = {1 , 4 , 10 , 23 , 57 , 132 , 301 , 701};

        // Go through the gaps, insertion-sorting at each gap-level
        for(int i = gaps.length - 1; i >= 0; i--) {
            int currentGap = gaps[i];

            // Preform standard insertion sort BUT only including
            // the parts of the list separated by currentGap
            for(int j = currentGap - 1; j < list.length; j += currentGap) {
                for(int k = j; k > currentGap - 1; k-= currentGap) {
                    int prevElemIndex = k - currentGap;
                    int prevElem = list[prevElemIndex];
                    if(list[k] < prevElem) {
                        int temp = list[k];
                        list[k] = prevElem;
                        list[prevElemIndex] = temp;
                    }
                }
            }
        }
    }
}
