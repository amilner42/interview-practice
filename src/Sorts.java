
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
	
	// Print contents of int array
	private static void print(int[] input) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println("\n");
	}
}
