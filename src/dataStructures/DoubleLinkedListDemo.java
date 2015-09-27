package dataStructures;

public class DoubleLinkedListDemo {
	
	public static void main(String[] args) {
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		
		list.addAtHead(5);
		list.addAtHead(10);
		list.addAtHead(16);
		list.addAtHead(11);
		list.addAtHead(12);
		
		System.out.println(list.toString());
		System.out.println(list.length());

		try {
			list.deleteHead();
			list.deleteHead();
		} catch(Exception e) {
			System.out.println("You should not be seeing this");
		}
		
		System.out.println(list.toString());
		System.out.println(list.length());

		try {
			list.deleteHead();
			list.deleteHead();
			list.deleteHead();
			list.deleteHead();
			list.deleteHead();
			list.deleteHead();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(list.toString());
		System.out.println(list.length());		
	}
}
