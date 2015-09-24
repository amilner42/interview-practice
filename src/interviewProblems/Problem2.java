package interviewProblems;

/*  Towers of Hanoi
 *
 *  Note that this problem has multiple recursive calls so it is not tail recursive because not ALL of the calls are tail recursive. The last recursive call is tail recursive because it is the last
 *  thing that happens before the function returns, but the first recursive call is not tail recursive because of the proceeding sysout and other recursive call that must happen before the function
 *  can return
 */

public class Problem2 {

    public static void main(String[] args) {
        System.out.println("\nTowers of Hanoi");
        solve(3 , "A" , "C" , "B" );
    }

    // Requires: size > 0
    // O(2^N)
    private static void solve(int size, String from, String to, String via) {
        if(size == 1) {
            System.out.println("move peg from " + from + " to " + to);
        } else {
            solve(size - 1, from, via, to);
            System.out.println("move peg from " + from + " to " + to);
            solve(size - 1, via, to, from);
        }
    }
}
