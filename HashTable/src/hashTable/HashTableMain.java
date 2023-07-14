package hashTable;

import java.util.LinkedList;
import java.util.Scanner;

class HashTable {
	
	static class Pair{
		private int key;
		private String value;
		
		public Pair(int key, String value) {
			this.key = key;
			this.value = value;
		}
		
		
	}
	private static int slots=10;
	private LinkedList<Pair> table[];
	
	public HashTable()
	{
		this.table = new LinkedList[slots];
		for(int i=0 ; i<slots ; i++)
		{
			table[i] = new LinkedList<>();
		}
	}
	
	public int hash(int key)
	{
		return key%slots;
	}
	
	public void put(int key, String value)
	{
		//find sloat
		int sloat = hash(key);
		//access bucket in that sloat
		LinkedList<Pair> bucket = table[sloat];
		//check key is already present in bucket or not
		for(Pair pair : bucket)
		{
			if(key == pair.key)
			{
				pair.value = value;
				return;
			}
		}
		//if key is not in linkedlist create new pair and add into list
		Pair pair = new Pair(key,value);
		bucket.add(pair);
		
	}
	
	public String get(int key)
	{
		int sloat = hash(key);
		
		LinkedList<Pair> bucket = table[sloat];
		
		for(Pair pair : bucket)
		{
			if(key == pair.key)
				return pair.value;
		}
		return null;
	}
	
}
	
	public class HashTableMain{
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);

			HashTable ht = new HashTable();
			ht.put(1, "Siddhesh");
			ht.put(4, "Amit");
			ht.put(8, "Pranav");
			ht.put(5, "Amey");
			ht.put(24, "Harshal");
			ht.put(34, "Abhi");
			ht.put(25, "Yogesh");
			//ht.put(1, "Rohan"); // it will override the value of key 1......siddhesh===>rohan
			
			System.out.println("Enter Roll No. to find : ");
			int key = sc.nextInt();
			String name = ht.get(key);
			System.out.println("Name : "+name);
		}
	}


