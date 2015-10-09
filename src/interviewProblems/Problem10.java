package interviewProblems;

import java.util.HashSet;

public class Problem10 {


    public static void main(String[] args) {

        System.out.println(targetSummable(new int[]{1 , 2 , 3 , 4 , -100 , 0 , 0} , 5));
        System.out.println(targetSummable(new int[]{1 , 2 , 3 , 4 , -100 , 0 , 0} , 3));
        System.out.println(targetSummable(new int[]{1 , 2 , 3 , 4 , -100 , 0 , 0} , -100));
        System.out.println(targetSummable(new int[]{1 , 2 , 3 , 4 , -100 , 0 , 0} , 0));
        System.out.println(targetSummable(new int[]{1 , 2 , 3 , 4 , -100 , 0 , 0} , 2));

        System.out.println(targetSummable(new int[]{1 , 2 , 3 , 4 , -100 , 0 , 0} , 8));
        System.out.println(targetSummable(new int[]{1 , 2 , 3 , 4 , -100 , 0 , 0} , 9));
        System.out.println(targetSummable(new int[]{} , 5));
        System.out.println(targetSummable(new int[]{1 , 2 , 3 , 4 , -100 , 0} , 0));
    }

    // Speed: O(n)
    // Memory: O(n)
    // You could solve this a different way, by first sorting it and then just using two pointers to keep track of where
    // you are. This would give you a speed of O(nlogn) and a memory of (1). Normally, memory is not as important but this
    // would be a good thing to talk to your interviewer about.
    private static boolean targetSummable(int[] array , int target) {

        HashSet<Integer> integers = new HashSet<>(array.length);

        for(int i = 0; i < array.length; i++) {
            int needed = target - array[i];
            if(integers.contains(needed)) {
                return true;
            } else {
                integers.add(array[i]);
            }
        }
        return false;
    }
}
