
public class List {

	public class Node {
		private int data;
		private Node next;


		public Node (int value) {
			data= value;
			next = null;
		}

	}
	private Node head;
	private Node tail;


	public List() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return (head == null && tail == null);
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);

		if(isEmpty()) {
			head = newnode;
			tail = newnode;
		}
		else {
			newnode.next = head;
			head =newnode;
		}
	}

	public void addLast(int value) {
		Node newnode = new Node(value);

		if(tail == null) {
			head = newnode;
			tail = newnode;
		}else {
			tail.next = newnode;
			tail = newnode;
		}	
	}

	public void delteFirst() {
		if(isEmpty()) {
			System.out.println("list is empty");
		}else {
			head = head.next;
		}
	}

	public void displayList(){

		Node trav = head;
		System.out.println("list :");

		while(trav != null) {
			System.out.println("  " + trav.data);

			trav = trav.next;
		}
		System.out.println("");

	}

	public void deleteLast() {
		if(isEmpty()) {
			System.out.println("list is empty");
		}else if(head.next == null){
			head = null;
		}else {
			Node trav = head;
			while(trav.next.next != null) {
				trav = trav.next;
			}
				trav.next = null;
			
		}
	}

}
