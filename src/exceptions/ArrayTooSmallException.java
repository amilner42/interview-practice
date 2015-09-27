package exceptions;

public class ArrayTooSmallException extends Exception {

    public ArrayTooSmallException(int minElements , int length) {
        super("Array must at minimum have " + minElements + " elements, not " + length + " elements");
    }
}