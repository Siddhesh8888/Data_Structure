
public class Main {

	public static void main(String[] args) {
		
		BinarySearchTree l1 = new BinarySearchTree();
		
		System.out.println(l1.insert(50));
		System.out.println(l1.insert(40));
		System.out.println(l1.insert(30));
		System.out.println(l1.insert(90));
		
		l1.preOrder();
		l1.inOrder();
		int max=l1.getMax();
		
		System.out.println("Max : "+max);
		
		System.out.println(l1.find(30));
		
		System.out.println("postOrder : ");
		l1.postOrder();
		
		l1.delete(30);
		l1.inOrder();

	}

}
