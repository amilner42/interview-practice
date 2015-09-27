# Technical Interview Preperation Guide
 
### Introduction
If you have an interview coming up at a company like Google or Amazon (and many others ...) that you know will ask
technical questions, then you have come to a good place to prepare yourself! Listed in this README are a bunch of 
technical computer science questions that will ALL be answered inside separate packages/class-files. Each solution also 
may include an associated demo file which will contain a main class and demo that solution, it is advised to play around
with these and learn about all the corner cases! 

### Organization
1. Data Structures
	* Implement this data structure
	* Implement this method for a data structure
2. Sorts and Searches 
	* Implement this sort
	* Implement this search
3. Interview Problems
	* Solve this problem

### How to Follow this Guide
It is not organized like this for no reason! It is recommended to have a good understanding of different data structures
and sorts and searches before moving on to general interview problems. These will be your tools to help understand and 
solve different interview problems. Doing all the sorts is optional, but it is recommended that you have a good
understanding of at minimum two O(nlogn) sorts.

### Contributing 
If you find any mistakes in my code, and there will be mistakes, try and fix them as an exercise! Once you think you have
a working implementation, shoot me a pull request, I always appreciate friendly help :) If you have any ideas for things
you wanna add, feel free to code it up and shoot me a pull request, just please keep your code clean - clean code or no
code at all. Again I always appreciate help and thanks in advance :) 

## Data Structures: 

### QUEUE
* Implement a Queue of ints using a circular array. Deal with under/overflow using exceptions appropriately. This Queue
must have the following methods:
```java
    public Queue(int maxSize)
    public void enqueue(int data)
    public int dequeue()
    public int peek()
    public boolean isFull()
    public boolean isEmpty()
    public String toString()
```

* Implement a Queue using two stacks, make use of generics. This StackQueue must have the following methods:
```java
    public StackQueue()
    public StackQueue(Type[] list)
    public void enqueue(Type obj)
    public Type dequeue()
    public boolean isEmpty()
```

### LINKED LIST
* Implement a LinkedList that can store any type using generics. To make this class, it helps to have a class for Node
that also uses generics to store any type. This LinkedList must have the following methods:
```java
    public LinkedList()
    public Node<Type> find(Type data)
    public int getLength()
    public void addDataAtHead(Type data)
    public void addNodeAtHead(Node<Type> nextNode)
    public Node<Type> deleteHead() throws ...
    public String toString()
```

* Do the exact same as question 2, but use a DoubleLinkedList. You will need a new Node class

* Reverse a SinglyLinkedList, the method header should look like:
```java
    public void reverse() // put this method inside your LinkedList class
```
* Check if a SinglyLinkedList is cyclic, the method header should look like:
```java
    public boolean cyclic() // put this method inside your LinkedList class
```
### STACK
* Implement a Stack that can store any type using generics. For the underlying data type, use an ArrayList. What are the
speeds of each of these methods in big-O notation if implemented correctly? It must have the following methods:
```java
    public Stack()
    public Type pop()
    public void push(Type data)
    public Type peek()
    public String toString()
```

### HEAP
* Implement a Heap that stores integers. Implement the heap in any way you think is best, but make sure it is fast! What
are the speeds of each of these methods in big-O notation if implemented correctly? It must have the following methods:
```java
    public Heap(int initialSize)
    public Heap(int[] initialValues)
    public void add(int integer) 
    public boolean delete(int integer) 
    public int peek()
    public int pop()
    public boolean contains(int integer)
    public boolean isEmpty()
    public int size()
```
	
### PRIORITY QUEUE
* Implement a Priority Queue that stores integers. It must have the following methods:
```java
    public PriorityQueue(int initialSize)
    public PriorityQueue(int [] list)
    public void enqueue(int data)
    public int dequeue()
    public int peek()
    public boolean isEmpty()
```

### BINARY SEARCH TREE
* Implement a BST that stores Integers. To make this BST, it will be useful to have a TreeNode as well. For the traversal
methods, simply print out the node data values as you traverse them. This BST must have the following methods:
```java
    public BinarySearchTree(Integer data)
    public BinarySearchTree()
    public TreeNode find(Integer searchKey)
    public void insert(TreeNode insertNode)
    public boolean delete(Integer searchKey)  // return true if object deleted, false if object not in list
    public void inOrderTraversal()
    public void preOrderTraversal()
    public void postOrderTraversal()
    public TreeNode smallest()
    public TreeNode biggest()
```

## Sorts / Searches 
### Sorts
For all sorts, analyze the speed using Big-O notation. Program all sorts as static methods in individual classes that each
have a main method that tests out the sort

* Implement Bubble sort, the method header should look like: 
```java
    private static void bubbleSort(int[] list)
```

* Implement Selection sort, the method header should look like: 
```java
    private static void selectionSort(int[] list)
```

* Implement Insertion sort, the method header should look like:  
```java
    private static void insertionSort(int[] list)
```

* Implement Merge sort, the method header should look like: 
```java
    private static void mergeSort(int[] list) 
```

* Implement Quick Sort, the method header should look like:
```java
    private static void quickSort(int[] list)
```

* Implement Shell Sort, the method header should look like:
```java
    private static void shellSort(int[] list)
```

* Implement Counting Sort, the method header should look like:
```java
    private static void countingSort(int[] list , int startRange , int endRange)
```

* Implement Radix Sort, the method header should look like:
```java
    private static void radixSort(int[] list)
```

* Implement Bucket Sort, the method header should look like:
```java
    private static void bucketSort(int[] list)
```

* Implement Heap Sort (this is a great place to test your own heap), the method header should look like:
```java
    private static void heapSort(int[] list)
```

### Searches
* Implement a binary search that takes in a sorted array, the method header should look like:
```java
    private static int binarySearchArray(int [] list, int searchKey)
```

## Interview Problems
1. Implement factorial recursively. Implement it again, but this time use tail recursion. What is tail recursion? Is Java
optimized for tail recursion?

2. Solve the famous Towers of Hanoi problem. Is it tail recursive? Why or why not?

3. Assuming I give you an array of numbers, lets say they represent stock prices, find me the most money you could make
that day by buying and selling a single stock. If the stocks go down all day, you should find me the least amount of money
I could lose that day. The method header should look like:
```java
    private static int bestStockTrade(int[] stockPrices) throws ...
```
    
4. Given an array of integers, eg [1 , 2 , 3, 4], return an array where at each index you get the result of multiplying 
by all the other values. Eg. [1 , 2 , 3 , 4] --> [2x3x4 , 1x3x4, 1x2x4 , 1x2x3]. Do NOT use division. The method header 
should look like: 
```java
    private static int[] productAllButMe(int[] data) throws ...
```
  
5. Given an array of integers, what is the maximum product you could get from multiplying any 3 of the integers. The 
method header should look like:
```java
    private static int productOfThree(int[] data) throws ...
```

6. Given an array of pairs of integers, write a function that goes through and see which parts of the timeline
are covered. Eg. Given the array of [(1,4) , (2,7) , (9,11) , (1,3) , (12,14)] --> [(1,7) , (9,14)]. You could 
imagine this being useful if we had a list of everyones schedule and we wanted to see when everyone was free. For the actual
representation of the input, use the following class:

```java
    class Schedule {
        public int startTime;
        public int endTime;
    
        public Schedule(int startTime , int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    
        @Override
        public String toString() {
            return "(" + startTime + " , " + endTime + ")";
        }
    }
```

For the method header:
```java
    private static List<Schedule> scheduler(List<Schedule> schedules)
```
