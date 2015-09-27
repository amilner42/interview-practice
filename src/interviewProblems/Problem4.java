package interviewProblems;

import exceptions.ArrayTooSmallException;
import java.util.Arrays;

public class Problem4 {

    public static void main(String[] args) {

        int[] data1 = new int[]{};   				// --> exception
        int[] data2 = new int[]{2};					// --> exception
        int[] data3 = new int[]{1 , 5};				// --> {5 , 1}
        int[] data4 = new int[]{1 , 2 , 3 , 4};		// --> {2 * 3 * 4 , 1 * 3 * 4 ,  1 * 2 * 4, 1 * 2 * 3}

        try {
//			System.out.println(Arrays.toString(productAllButMe(data1)));
            System.out.println(Arrays.toString(productAllButMe(data2)));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(Arrays.toString(productAllButMe(data3)));
            System.out.println(Arrays.toString(productAllButMe(data4)));
        } catch(Exception e) {
            System.out.println("You should not be seeing this text!");
        }
    }

    // O(n) space
    // O(n) time
    private static int[] productAllButMe(int[] data) throws ArrayTooSmallException {

        int[] result = new int[data.length];

        if(data.length < 2) {
            throw new ArrayTooSmallException(2 , data.length);
        }

        int recordMultiplication = 1;
        for(int i = 0; i < data.length; i++) {
            result[i] = recordMultiplication;
            recordMultiplication *= data[i];
        }

        recordMultiplication = 1;
        for(int i = data.length - 1; i >= 0; i--) {
            result[i] *= recordMultiplication;
            recordMultiplication *= data[i];
        }

        return result;
    }
}

