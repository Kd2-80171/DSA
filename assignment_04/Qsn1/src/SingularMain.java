
public class SingularMain {
	public static void main(String[] args) {
		List l1 = new List();
		
		l1.addFirst(10);
		
		l1.addFirst(20);
		
		l1.addFirst(30);
		
		l1.addFirst(40);
		l1.addLast(50);
		
		l1.deleteLast();
		//l1.delteFirst();
		l1.displayList();
	}

}
