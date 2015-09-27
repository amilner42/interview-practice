package interviewProblems;

import interviewProblems.exceptions.ArrayTooSmallException;
import java.util.PriorityQueue;

public class Problem5 {

    public static void main(String[] args) {

        int[] data1 = new int[]{};                                  // error
        int[] data2 = new int[]{1, 5};                              // error
        int[] data3 = new int[]{1, 4, 2, 8, 9};                     // Case: all positive --> 3-max
        int[] data4 = new int[]{10, 11, 12, -20};                   // Case: 1 negative   --> 3-max
        int[] data5 = new int[]{-5, -6, -10, 7, 8, 9};              // Case: 2+ negative  --> 3-max || 1-max 2-small
        int[] data6 = new int[]{-12, -10, -6, -4};                  // Case: all negative --> 3-max

        int[] data7 = new int[]{-10, -10, 1, 3, 2};
        try {
            productOfThree(data2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(productOfThree(data3));
            System.out.println(productOfThree(data4));
            System.out.println(productOfThree(data5));
            System.out.println(productOfThree(data6));
            System.out.println(productOfThree(data7));
        } catch (Exception e) {
            System.out.println("You should not see this line");
        }

    }

    //  O(n) time
    //  O(1) memory
    private static int productOfThree(int[] data) throws ArrayTooSmallException {
        if (data.length < 3) {
            throw new ArrayTooSmallException(3 , data.length);
        }

        PriorityQueue<Integer> maxNumbers = new PriorityQueue<>();                  // keep track of 3 largest numbers
        PriorityQueue<Integer> minNumbers = new PriorityQueue<>((x, y) -> y - x);   // keep track of two smallest numbers

        for (int i = 0; i < data.length; i++) {
            maxNumbers.add(data[i]);
            minNumbers.add(data[i]);
            if(maxNumbers.size() > 3) {
                maxNumbers.poll();
            }
            if(minNumbers.size() > 2){
                minNumbers.poll();
            }
        }

        int maxLow = maxNumbers.poll();
        int maxMed = maxNumbers.poll();
        int maxHigh = maxNumbers.poll();

        int minHigh = minNumbers.poll();
        int minLow = minNumbers.poll();

        int possibleProduct1 = maxHigh * maxMed * maxLow;
        int possibleProduct2 = maxHigh * minHigh * minLow;

        return Math.max(possibleProduct1, possibleProduct2);
    }

//  O(n) time
//  O(n) memory
//    private static int productOfThree(int[] data) throws ArrayTooSmallException {
//        if(data.length < 3) {
//            throw new ArrayTooSmallException("Array must be at least 3 long to preform productOfThree(int[] data)");
//        }
//
//        PriorityQueue<Integer> maxNumbers = new PriorityQueue<>((x , y) -> y - x);	// keep track of 3 largest numbers
//        PriorityQueue<Integer> minNumbers = new PriorityQueue<>();	                // keep track of two smallest numbers
//
//        for(int i = 0; i < data.length; i++) {
//            maxNumbers.add(data[i]);
//            minNumbers.add(data[i]);
//        }
//
//        int maxHigh = maxNumbers.poll();
//        int maxMed = maxNumbers.poll();
//        int maxLow = maxNumbers.poll();
//
//        int minLow = minNumbers.poll();
//        int minHigh = minNumbers.poll();
//
//        int possibleProduct1 = maxHigh * maxMed * maxLow;
//        int possibleProduct2 = maxHigh * minHigh * minLow;
//
//        return Math.max(possibleProduct1 , possibleProduct2);
//    }

}




