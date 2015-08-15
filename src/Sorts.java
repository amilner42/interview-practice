
public class Sorts {
	
	public static void main(String[]args) {
		
		int [] input1 = {6, 7 ,2,4,3, 1, 1, 6};
		bubbleSort(input1);
		print(input1);

		int [] input2 = {6, 7 ,2,4,3, 1, 1, 6};
		selectionSort(input2);
		print(input2);

		int [] input3 = {6, 7 ,2,4,3, 1, 1, 6};
		insertionSort(input3);
		print(input3);
		
		int [] input4 = {111, 1 , 43, 2 , 5, 7, 0 , -3 , 6, 7 ,2,4,3, 1, 13 , 1, 6};
		mergeSort(input4);
		print(input4);
	}
	
	// Bubble Sort Implementation 
	// O(n^2)
	private static void bubbleSort(int [] list) {
		for(int indexOutter = 0; indexOutter < list.length; indexOutter++) {
			for(int indexInner = 0; indexInner < list.length - 1 - indexOutter; indexInner++) {
				int first = list[indexInner];
				int second = list[indexInner + 1];
				
				if(first > second) {
					list[indexInner] = second;
					list[indexInner + 1] = first; 
				}
			}
		}
		
	}
	
	
	// Selection Sort Implementation 
	// O(n^2)
	private static void selectionSort(int [] list) {
		for (int i = 0; i < list.length; i++) {
			int smallest = list[i]; 
			int smallestIndex = i; 
			
			for (int j = i; j < list.length - 1; j++) {
				if(list[j + 1] < smallest) {
					smallest = list[j + 1];
					smallestIndex = j + 1;
				}
			}

			
			list[smallestIndex] = list[i];
			list[i] = smallest;
		}		
		
	}
	
	// Insertion Sort Implementation
	// O(n^2)
	private static void insertionSort(int [] list) {
		for (int i = 0; i < list.length; i++) {
			int insertion = list[i];
			for (int j = i - 1; j >= 0; j--) {
				if (insertion < list[j]) {
					list[j+1] = list[j];
					list[j] = insertion;
				} else {
					break;
				}
		
			} 
		}
	}

	// Merge Sort Implementation
	// O(nlog(n))
	// Memory: O(n) aux
	private static void mergeSort(int[] list) {
		int[] listAux = new int[list.length];
		mergeSort(list, listAux, 0, list.length - 1);
	}

	private static void mergeSort(int[] list , int[] listAux , int startIndex , int endIndex) {
		if(startIndex < endIndex) {
			int middleIndex = (startIndex + endIndex) / 2; 
			mergeSort(list, listAux, startIndex, middleIndex);
			mergeSort(list, listAux, middleIndex + 1, endIndex);
			merge(list, listAux, startIndex, middleIndex + 1, endIndex);
		}
	}

	private static void merge(int[] list, int[] listAux, int startIndex, int middleIndex, int endIndex) {
		for(int i = startIndex; i <= endIndex; i++) {
			listAux[i] = list[i];
		}
		
		// Indexes treated as constant variables, Moving treated as changing variables 
		int startMoving = startIndex;
		int middleMoving = middleIndex;
		int listFinalMoving = startIndex;

		while(startMoving < middleIndex && middleMoving <= endIndex) {
			if(listAux[startMoving] <= listAux[middleMoving]) {
				list[listFinalMoving] = listAux[startMoving];
				startMoving++;
			} else {
				list[listFinalMoving] = listAux[middleMoving];
				middleMoving++;
			}
			listFinalMoving++; 
		}
		
		// This is used to copy the left side over if any numbers remain in the left list. If all the numbers in the left list have been placed, and only number remain in te right list,
		// then they are already in sorted order and there is no need to do anything
		while(startMoving < middleIndex) {
			list[listFinalMoving] = listAux[startMoving];
			startMoving++;
			listFinalMoving++;
		}
	}

	// TODO
	private static void quickSort(int[] list) {}

	// TODO
	private static void shellSort(int[] list) {}

	// TODO
	private static void radixSort(int[] list) {}

	// TODO
	private static void countingSort(int[] list) {}

	// TODO
	private static void bucketSort(int[] list) {}

	// Print contents of int array
	private static void print(int[] input) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println("\n");
	}
}
