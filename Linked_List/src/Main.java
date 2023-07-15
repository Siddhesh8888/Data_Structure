
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l1 = new LinkedList();
		l1.insert(10);
		l1.insert(20);//insert at last position of list
		l1.insert(30);
		l1.insert(40);
		l1.display();
		l1.displayRev();
		System.out.println("display list in reverse : ");
		l1.displayRev(l1.getHead()); //display list in reverse direction by using recursion
		System.out.println("\n");
		l1.insert(50, 3);//insert at given position
		l1.display();
		
		l1.deleteByValue(30);//delete node on the basis of value
		l1.display();
		l1.reverse();
		System.out.println("reverse list");
		l1.display();
		
		l1.reverse(l1.getHead(), l1.getHead().getNext());
		l1.display();
		

	}

}
