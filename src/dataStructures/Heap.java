package dataStructures;

import java.util.ArrayList;

public class Heap {

    private ArrayList<Integer> heap;

    public Heap(int size) {
        heap = new ArrayList<>(size);
    }

    // TODO - speed up implementation
    // This is not the fastest implementation, it is O(nlogn), if you instead build the heap from the bottom up
    // you can get a speed of (n). To understand this, think about the trickling itself! If you build the heap the normal
    // way by constantly using the add method, then it will continually add said integer to the list. Now, clearly,
    // most of the items are at the bottom, so by the time you get to the end of the list (which contains most of the
    // items, you may have to trickle all these items all the way up through the heap...that's a lot of trickling). On
    // the other hand, if you start by building the bottom layer of the heap, and trickle only when you add a element
    // above another, then you will notice that there is only 1 element that could trickle through the entire list (the
    // root element)! So instead of having about half the element trickling all the way, we only have one element trickling
    // all the way! Turns out, this is assymptotically better and is O(n) instead of O(nlogn)
    public Heap(int[] initialValues) {
        heap = new ArrayList<>(initialValues.length);
        for(int i = 0; i < initialValues.length; i++) {
            this.add(initialValues[i]);
        }
    }

    public void add(int integer) {
        heap.add(integer);
        this.fixHeapUp(heap.size() - 1);
    }

    // Effects: Deletes the first instance of the integer
    // Returns: True if the item was in the list originally, false otherwise
    public boolean delete(int integer) {
        if(!heap.contains(integer)) {
            return false;
        }
        int indexOfInteger = heap.indexOf(integer);
        heap.set(indexOfInteger , heap.get(heap.size() -1));
        heap.remove(heap.size() - 1);
        this.fixHeapDown(indexOfInteger);
        return true;
    }

    public int peek() {
        if(heap.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        return heap.get(0);
    }

    public int pop() {
        if(heap.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        int poppedInteger = heap.get(0);
        heap.set(0 , heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        this.fixHeapDown(0);
        return poppedInteger;
    }

    public boolean contains(int integer) {
        return heap.contains(integer);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    public String toString() {
        String result = "dataStructures.Heap: ";
        for(int i = 0; i < heap.size(); i++) {
            result += heap.get(i) + " ";
        }
        return result;
    }

    // Private Methods
    private int indexOfLeftChild(int parentIndex) {
        return 2*parentIndex + 1;
    }

    private int indexOfRightChild(int parentIndex) {
        return 2*parentIndex + 2;
    }

    private int indexOfParent(int childIndex) {
        return (childIndex - 1) / 2;
    }

    // This method only keeps the heap a heap if it is called on the very last element. It works hand in hand with
    // the add method
    private void fixHeapUp(int indexOfCurrent) {
        while(indexOfCurrent > 0) {
            int indexOfParent = indexOfParent(indexOfCurrent);
            int current = heap.get(indexOfCurrent);
            int parent = heap.get(indexOfParent);
            if(current > parent) {
                heap.set(indexOfParent , current);
                heap.set(indexOfCurrent , parent);
                indexOfCurrent = indexOfParent;
            } else {
                break;
            }
        }
    }

    // This method is used whenever you need to let a fix trickle down the tree instead of going up. Useful for any form
    // of deletion
    private void fixHeapDown(int indexOfCurrent) {
        int indexOfLeftChild = indexOfLeftChild(indexOfCurrent);
        int indexOfRightChild = indexOfLeftChild + 1;

        while(indexOfLeftChild < heap.size()) {
            if(indexOfRightChild < heap.size()) {
                if(heap.get(indexOfLeftChild) > heap.get(indexOfRightChild)) {
                    if(heap.get(indexOfCurrent) < heap.get(indexOfLeftChild)) {
                        int tempParent = heap.get(indexOfCurrent);
                        heap.set(indexOfCurrent , heap.get(indexOfLeftChild));
                        heap.set(indexOfLeftChild , tempParent);
                        indexOfCurrent = indexOfLeftChild;
                        indexOfLeftChild = indexOfLeftChild(indexOfCurrent);
                        indexOfRightChild = indexOfLeftChild + 1;
                    } else {
                        break;
                    }
                } else {
                    if(heap.get(indexOfCurrent) < heap.get(indexOfRightChild)) {
                        int tempParent = heap.get(indexOfCurrent);
                        heap.set(indexOfCurrent , heap.get(indexOfRightChild));
                        heap.set(indexOfRightChild , tempParent);
                        indexOfCurrent = indexOfRightChild;
                        indexOfLeftChild = indexOfLeftChild(indexOfCurrent);
                        indexOfRightChild = indexOfLeftChild + 1;
                    } else {
                        break;
                    }
                }
            } else {
                if(heap.get(indexOfCurrent) < heap.get(indexOfLeftChild)) {
                    int tempParent = heap.get(indexOfCurrent);
                    heap.set(indexOfCurrent , heap.get(indexOfLeftChild));
                    heap.set(indexOfLeftChild , tempParent);
                }
                break;
            }
        }
    }
}