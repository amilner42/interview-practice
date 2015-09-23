
public class LinkedListDemo {

	public static void main(String[]args) {
		LinkedList<Double> list = new LinkedList<Double>();
		
		list.addAtHead(3.2);

		
		System.out.println(list.toString());
		System.out.println(list.getLength());
		
		list.deleteHead();
		list.deleteHead();
		
		System.out.println(list.toString());
		System.out.println(list.getLength());
		
		list.addAtHead(45.1);
		list.addAtHead(35.1);
		list.addAtHead(25.1);
		list.addAtHead(15.1);
		
		System.out.println(list.toString());
		System.out.println(list.getLength());
		
		Node<Double> find45 = list.find(35.1);
		System.out.println(find45.getData());

        list.reverse();
        System.out.println(list.toString());


    }
}
