package stack;

public class Main {

	public static void main(String[] args) {
		
		
		Stack<Integer> s = new Stack<Integer>(5);
		System.out.println(s.push(10));
		System.out.println(s.push(20));
		System.out.println(s.push(30));
		System.out.println(s.push(40));
		System.out.println(s.push(50));
		System.out.println("Elements in Stack : ");
		s.display();

		System.out.println("Deleted Element : "+s.pop());
		System.out.println("Peek Element : "+s.peek());
		System.out.println("Elements in Stack : ");
		s.display();
		System.out.println("Display elements in stack in reverse direction: ");
		s.revDisplay();

	}

}
