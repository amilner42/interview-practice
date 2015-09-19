If you have an interview coming up at a company like Google or Amazon (and many others ...) that you know will ask technical questions, then you have come to a good place
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

BINARY SEARCH TREE
------------------

1. Implement a BST that stores Integers. To make this BST, it will be useful to have a TreeNode as well.
	This BST must have the following methods:
	 - public BinarySearchTree(Integer data);
	 - public BinarySearchTree()
	 - public TreeNode find(Integer searchKey)
	 - public void insert(TreeNode insertNode)
	 - public boolean delete(Integer searchKey)  [return true if object deleted, false if object not in list]
	 - public void inOrderTraversal()
	 - public void preOrderTraversal()
	 - public void postOrderTraversal()
	 - public TreeNode smallest()
	 - public TreeNode biggest()

	The TreeNode class can be implemented in any way you like that allows you to build the BST. For the traversal methods, simply 
	print out the node data values as you traverse them.

Sorts / Searches 
=================

Sorts
-----
For all sorts, analyze the speed using Big-O notation. Program all sorts as static methods inside a sort class with a main method

1. Implement Bubble sort, the method header should look like: 
	 - private static void bubbleSort(int[] list)

2. Implement Selection sort, the method header should look like: 
	 - private static void selectionSort(int[] list)

3. Implement Insertion sort, the method header should look like:  
	 - private static void insertionSort(int[] list)

4. Implement Merge sort, the method header should look like: 
	 - private static void mergeSort(int[] list) 

5. Implement Quick Sort, the method header should look like:
	 - private static void quickSort(int[] list)

6. Implement Shell Sort, the method header should look like:
	 - private static void shellSort(int[] list)
	 
7. Implement Counting Sort, the method header should look like:
	 - private static void countingSort(int[] list , int startRange , int endRange)

8. Implement Radix Sort, the method header should look like:
	 - private static void radixSort(int[] list)

9. Implement Bucket Sort, the method header should look like:
	 - private static void bucketSort(int[] list)

Searches
--------
For all searches, analyze the speed using Big-O notation. Program all searches as static methods inside a search class with a main method

1. Implement a binary search that takes in a sorted array, the method header should look like:
	 - private static int binarySearchArray(int [] list, int searchKey)

	If you use recursion, to keep track of the indexes without having more than 2 parameters in the original call you may
	need to overload binarySearchArray

Recursion
=========

1. Implement factorial recursively. Implement it again, but this time use tail recursion. What is tail recursion? Is Java optimized for tail recursion?

2. Solve the famous Towers of Hanoi problem. Is it tail recursive? Why or why not?