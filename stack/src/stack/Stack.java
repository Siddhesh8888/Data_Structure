package stack;

public class Stack<T> {
	
	private T[] arr;
	private int size;
	private int top;
	
	public Stack(int size)
	{
		this.size = size;
		this.top = -1;
		this.arr =(T[]) new Object[size];
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public boolean isFull()
	{
		return top == (size-1);
	}
	
	public boolean push(T data)
	{
		if(isFull())
			return false;
		
		arr[++top]=data;
		return true;
	}
	
	public T pop()
	{
		if(isEmpty())
			return null;
		
		return arr[top--];
	}
	
	public T peek()
	{
		if(isEmpty())
			return null;
		
		return arr[top];
	}
	
	public void display()
	{
		for(int i=top; i>=0; i--)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public void revDisplay()
	{
		Stack<T> s1 = new Stack<T>(this.size);
		int temp = top;
		while(temp>=0)
		{
			s1.push(arr[temp--]);
		}
		
		s1.display();
	}

}
