package dataStructures;

import java.util.*;

public class StackQueue<Type> {

    private java.util.Stack<Type> stackIn;
    private java.util.Stack<Type> stackOut;

    public StackQueue() {
        stackIn = new java.util.Stack<>();
        stackOut = new java.util.Stack<>();
    }

    public StackQueue(Type[] list) {
        stackIn = new java.util.Stack<>();
        stackOut = new java.util.Stack<>();
        for(int i = 0; i < list.length; i++) {
            stackIn.push(list[i]);
        }
    }

    public void enqueue(Type obj) {
        stackIn.push(obj);
    }

    public Type dequeue() {
        if(stackOut.isEmpty()) {
            while(!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }

        if(stackOut.isEmpty()) {
            throw new EmptyStackException();
        }

        return stackOut.pop();
    }

    public boolean isEmpty() {
        return stackOut.isEmpty() && stackIn.isEmpty();
    }
}