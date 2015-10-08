package interviewProblems;

import java.util.Stack;

public class Problem9 {

    public static void main(String[] args) {

        System.out.println(balancedDelimiters(""));
        System.out.println(balancedDelimiters("{}"));
        System.out.println(balancedDelimiters("[]{}()"));
        System.out.println(balancedDelimiters("[{()[]}]"));
        System.out.println(balancedDelimiters("["));
        System.out.println(balancedDelimiters("[]]"));
        System.out.println(balancedDelimiters("{[}]"));
    }

    // Perhaps the biggest take away from this problem is recognizing when to use a stack! With a stack the code is
    // quite straightforward 
    private static boolean balancedDelimiters(String delimiters) {

        Stack<Character> characters = new Stack<>();

        for(int i = 0; i < delimiters.length(); i++) {
            Character currentChar = delimiters.charAt(i);
            if(currentChar.equals('[') || currentChar.equals('{') || currentChar.equals('(')) {
                characters.push(currentChar);
            } else {
                if(characters.isEmpty()) {
                    return false;
                }
                if(!matches(characters.pop(), (currentChar))) {
                    return false;
                }
            }
        }
        return characters.isEmpty();
    }

    private static boolean matches(Character pop, Character currentChar) {
        return  pop.equals('{') && currentChar.equals('}') ||
                pop.equals('[') && currentChar.equals(']') ||
                pop.equals('(') && currentChar.equals(')');
    }
}
