
public class main {
	
	public static void main(String[]args) {
		
		int [] input = {6, 7 ,2,4,3, 1, 1, 6 , 41};
		selectionSort(input);
		print(input);		
	}
	
	// Print contents of int array
	private static void print(int[] input) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

	// Bubble Sort Implementation 
	// O(N^2)
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
	// O(N^2)
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
}
