package interviewProblems;

/*  Tail recursion is when the recursive call in a function is the last step that it needs to perform before it returns;
 *  in other words, it is returning the return value of its recursive call. If you notice a redundancy here, that is
 *  because there is one! Why bother returning the return value of its recursive call, if the recursive call could
 *  just do the return itself! This is essentially what it means if a language is optimized for tail recursion. The
 *  "language" can recognize that the recursive call being made is the last call that function is making, and then
 *  instead of stacking the returns and having function c return to function b which directly returns to function a
 *  without changing the value at all, it has function c directly return to function a. If a language is optimized
 *  for tail recursion, and tail recursion is used, then it will not build function frames on the stack
 *  (no stack overflow!)! A million tail recursive calls in a row and the stack need not ever be more than a few
 *  function frames! Java is NOT tail recursive, so even if you do implement tail recursion properly it will still
 *  build up a stack :(
 *
 *  Note that in factorial(...), this is not tail recursion because once it finishes the factorial(x-1) recursive call
 *  it still has to multiply that by x before it can return the value. For this reason, function C cannot return to
 *  function A (and skip function B), but rather it must return to function B which will multiply it by x and then
 *  return to function A.
 *
 *  tailFactorial implements tail recursion properly because the recursive call is the last call being made before it
 *  returns; it is returning the recursive call. For this reason, function C can skip over function B (which would do
 *  nothing to the value and return to A) and instead directly return to function A
 */
public class Problem1 {

    public static void main(String[] args) {
        System.out.println("Head Recursion");
        System.out.println("Factorial 1: " + factorial(1));
        System.out.println("Factorial 2: " + factorial(2));
        System.out.println("Factorial 3: " + factorial(3));
        System.out.println("Factorial 4: " + factorial(4));
        System.out.println("Factorial 5: " + factorial(5));

        System.out.println("\nTail Recursion");
        System.out.println("Factorial 1: " + tailFactorial(1));
        System.out.println("Factorial 2: " + tailFactorial(2));
        System.out.println("Factorial 3: " + tailFactorial(3));
        System.out.println("Factorial 4: " + tailFactorial(4));
        System.out.println("Factorial 5: " + tailFactorial(5));
    }

    // Head recursion factorial
    // Requires: x > 0
    // O(N)
    private static int factorial(int x) {
        if(x == 1) {
            return 1;
        } else {
            return x * factorial(x-1);
        }
    }

    // Tail recursion factorial
    // Requires: x > 0
    // O(N)
    private static int tailFactorial(int x) {
        return tailFactorial(x , 1);
    }

    private static int tailFactorial(int x, int result) {
        if(x == 0) {
            return result;
        }
        return tailFactorial(x - 1 , x * result);
    }
}
