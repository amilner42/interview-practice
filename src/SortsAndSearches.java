
public class SortsAndSearches {
	
	public static final int ITEM_NOT_FOUND = -1; 
	
	public static void main(String[]args) {
		
		int [] input = {6, 7 ,2,4,3, 1, 1, 6};
		insertionSort(input);
		print(input);	
		
		System.out.println("\n" + binarySearchArrayWrapper(input, 20));
	}
	
	// Print contents of int array
	private static void print(int[] input) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	// ------- // 
	// SORTS   // 
	// ------- // 
	
	// Bubble Sort Implementation 
	// O(n^2)
	public static void bubbleSort(int [] list) {
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
	public static void selectionSort(int [] list) {
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
	public static void insertionSort(int [] list) {
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
	
	// -------- // 
	// SEARCHES // 
	// -------- // 
	
	// Binary Search of an Ordered Array
	// O(log(n))
	// Requires: list must be sorted  
	// Returns:  The index of one of the searchKey elements in the array if any exist, otherwise -1 
	public static int binarySearchArrayWrapper(int [] list, int searchKey) {
		return binarySearchArray(list, searchKey, 0, list.length - 1);
	}
	
	public static int binarySearchArray(int [] list, int searchKey, int startIndex, int endIndex) {
		
		// Item not found 
		if(endIndex < startIndex) {
			return ITEM_NOT_FOUND; 
		}
		
		int middleIndex = (startIndex + endIndex) / 2; 
		int middleValue = list[middleIndex];
		
		if(middleValue == searchKey) {
			return middleIndex; 
		} else if(middleValue > searchKey) {
			return binarySearchArray(list, searchKey, startIndex, middleIndex - 1);
		} else {
			return binarySearchArray(list, searchKey, middleIndex + 1, endIndex);
		}	
	}
}
