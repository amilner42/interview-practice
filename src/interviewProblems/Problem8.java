package interviewProblems;

public class Problem8 {

    public static void main(String[] args) {

        System.out.println(uncoupledInteger(new int[]{1}));
        System.out.println(uncoupledInteger(new int[]{1 , 2 , 2}));
        System.out.println(uncoupledInteger(new int[]{1 , 2 , 1}));
        System.out.println(uncoupledInteger(new int[]{3 , 3 , 6 , 6 , 1}));
        System.out.println(uncoupledInteger(new int[]{3 , 3 , 6 , 6 , 12 ,  0 , 12}));
        System.out.println(uncoupledInteger(new int[]{3 , 3 , 6 , 6 , 5 , 5 , 101}));
    }

    // Using XOR here is an awesome trick that can both make your code simple and allow to you to do it in constant
    // memory and linear time! The next best answer is probably to use a hashset which will give linear time and memory
    private static int uncoupledInteger(int[] list) {
        int result = 0;
        for(int i = 0; i < list.length; i++) {
            result ^= list[i];
        }
        return result;
    }
}
