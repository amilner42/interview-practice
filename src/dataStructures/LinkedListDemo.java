package dataStructures;

public class LinkedListDemo {

	public static void main(String[]args) {
		LinkedList<Double> list = new LinkedList<Double>();
		
		list.addDataAtHead(3.2);

		
		System.out.println(list.toString());
		System.out.println(list.getLength());
		
		list.deleteHead();
		list.deleteHead();
		
		System.out.println(list.toString());
		System.out.println(list.getLength());
		
		list.addDataAtHead(45.1);
		list.addDataAtHead(35.1);
		list.addDataAtHead(25.1);
		list.addDataAtHead(15.1);
		
		System.out.println(list.toString());
		System.out.println(list.getLength());
		
		Node<Double> find45 = list.find(35.1);
		System.out.println(find45.getData());

        list.reverse();
        System.out.println(list.toString());

		System.out.println(list.cyclic());
        list.addNodeAtHead(list.find(15.1)); // make it cyclic

        System.out.println(list.cyclic());
    }
}
