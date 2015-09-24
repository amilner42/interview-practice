package sortsAndSearches;

public class BinarySearch {
	
	public static final int ITEM_NOT_FOUND = -1; 

	public static void main(String[] args) {
		
		int[] list = {1, 4, 5, 6 , 9, 13 , 80 , 91 , 101 , 122 , 1023, 2333};
		
		System.out.println(binarySearchArray(list, 122));
		System.out.println(binarySearchArray(list, 80));
		System.out.println(binarySearchArray(list, 1));
		System.out.println(binarySearchArray(list, 4));
		System.out.println(binarySearchArray(list, 5));
		System.out.println(binarySearchArray(list, 12) + " Does not exist");
		System.out.println(binarySearchArray(list, 7) + " Does not exist");
		System.out.println(binarySearchArray(list, 12) + " Does not exist");
		System.out.println(binarySearchArray(list, 102) + " Does not exist");
		System.out.println(binarySearchArray(list, 900) + " Does not exist");
		System.out.println(binarySearchArray(list, 2800) + " Does not exist");
	}

	// Binary Search of an Ordered Array
	// O(log(n))
	// Requires: list must be sorted  
	// Returns:  The index of one of the searchKey elements in the array if any exist, otherwise -1 
	private static int binarySearchArray(int [] list, int searchKey) {
		return binarySearchArray(list, searchKey, 0, list.length - 1);
	}
	
	private static int binarySearchArray(int [] list, int searchKey, int startIndex, int endIndex) {
		
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
