If you have an interview coming up at a company like Google or Facebook (and many others ...) that you know will ask technical questions, then you have come to a good place
to prepare yourself! Listed in this README are a bunch of technical computer science questions that will ALL be answered inside seperate class files in the Java Project. 
Each Solution also may include an associated demo file which will contain a main class and Demo that solution, it is advised to play around with these and learn about all
the corner cases! 

Abstract Data Types / Data Structures: 
======================================

QUEUE 
-----
1. Implement a Queue of ints using a circular array. This Queue must have the following methods: 
	 - public Queue(int maxSize)
	 - public void enQueue(int data)
	 - public int deQueue()
	 - public int peek()
	 - public boolean isFull()
	 - public boolean isEmpty()
	 - public String toString()

Deal with under/overflow using exceptions appropriately

LINKED LIST
-----------
1. Implement a LinkedList that can store any Type using generics. To make this class, it helps to have a class for Node that also uses generics to store any Type. 
	This LinkedList must have the following methods: 
	 - public Node<Type> find(Type data)
	 - public int getLength()
	 - public void addAtHead(Type data)
	 - public void deleteHead()
	 - public String toString()

	The Node must have the following methods: 
	 - public void setData(Type data)
	 - public void getData()
	 - public void setNextNode(Node<Type> nextNode)
	 - public void getNextNode()
	 - public String toString()

2. Do the exact same as question 2, but use a DoubleLinkedList. You will also need a new node Class

STACK
-----
1. Implement a Stack that can store any type using Generics. It must have the following methods: 
	 - public Type pop()
	 - public void push(Type data)
	 - public Type peek()
	 - public String toString()

	For the underlying data type, use an ArrayList. What are the speeds of each of these methods in big-O notation 
	if implemented correctly?

Sorts / Searches 
=================

Sorts
-----
For all sorts, analyze the speed using Big-O notation. Program all sorts as static methods inside a sort class with a main method

1. Implement Bubble sort, the method header should look like: 
	 - public static void bubbleSort(int [] list)

2. Implement Selection sort, the method header should look like: 
	 - public static void selectionSort(int [] list)

3. Implement Insertion sort, the method header should look like:  
	 - public static void insertionSort(int [] list)

Searches
--------
For all searches, analyze the speed using Big-O notation. Program all searches as static methods inside a search class with a main method

1. Implement a binary search that takes in a sorted array, the method header should look like:
	 - public static int binarySearchArray(int [] list, int searchKey)

	If you use recursion, to keep track of the indexes without having more than 2 parameters in the original call you may
	need to overload binarySearchArray

Recursion
=========

Problems
--------
1. Implement factorial recursively. Implement it again, but this time use tail recursion. What is tail recursion? Is Java optimized for tail recursion?
