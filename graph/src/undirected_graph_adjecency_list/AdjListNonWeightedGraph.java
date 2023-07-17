package undirected_graph_adjecency_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class AdjListNonWeightedGraph {
	
	private int vertCount;
	private int edgeCount;
	private LinkedList<Integer>[] adjlist;
	
	
	public AdjListNonWeightedGraph(int vertCount) {
		
		this.vertCount = vertCount;
		this.edgeCount = 0;
		this.adjlist = new LinkedList[vertCount];
		
		for(int i =0; i<vertCount; i++)
		{
			adjlist[i] = new LinkedList<Integer>();
		}
	}
	
	public void accept()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter No. of edges : ");
		int edgeCount = sc.nextInt();
		
		for(int i=0; i<edgeCount; i++)
		{
			System.out.println("Enter Edge (source destination) : ");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjlist[src].add(dest);
			adjlist[dest].add(src);
		}
		sc.close();
	}
	
	
	public void display()
	{
		for(int i=0; i<vertCount; i++)
		{
			System.out.print("vert "+i+" : ");
			for(int dest : adjlist[i])
			{
				System.out.print(dest+"->");
			}
			System.out.println();
		}
	}
	
	

}
