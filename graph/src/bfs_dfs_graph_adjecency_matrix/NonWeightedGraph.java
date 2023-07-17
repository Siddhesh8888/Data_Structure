package bfs_dfs_graph_adjecency_matrix;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class NonWeightedGraph {
	
	private int vertCount;
	private int edgeCount;
	private int[][] adjmat;
	
	public NonWeightedGraph(int vertCount)
	{
		this.vertCount = vertCount;
		this.edgeCount = 0;
		this.adjmat = new int[vertCount][vertCount];
		
		for(int i=0; i<vertCount; i++)
		{
			for(int j=0; j<vertCount; j++)
			{
				adjmat[i][j] = 0;
			}
		}
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Edges : ");
		int edgeCount = sc.nextInt();
		
		System.out.println("Enter edge (source destination) : ");
		for(int i=0; i<edgeCount; i++)
		{
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjmat[src][dest] = 1;
			adjmat[dest][src] = 1;  //because of symmetric matrix
		}
		sc.close();
	}
	
	public void display()
	{
		for(int i=0; i<vertCount; i++)
		{
			for(int j=0; j<vertCount; j++)
			{
				System.out.print(adjmat[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void bfsTraversal(int start)
	{
		boolean [] marked = new boolean[vertCount];
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		marked[start]=true;
		while(!q.isEmpty())
		{
			int trav = q.poll();
			System.out.print(trav+ " ");
			for(int dest=0; dest<vertCount; dest++)
			{
				if(adjmat[trav][dest]!=0 && !marked[dest])
				{
					q.offer(dest);
					marked[dest]=true;
				}
			}
		}
	}
	
	public void dfsTraversal(int start)
	{
		boolean[] marked = new boolean[vertCount];
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(start);
		marked[start] = true;
		
		while(!s.isEmpty())
		{
			int trav = s.pop();
			System.out.print(trav + " ");
			for(int dest=0; dest<vertCount; dest++)
			{
				if(adjmat[trav][dest]!=0 && !marked[dest])
				{
					s.push(dest);
					marked[dest]=true;
				}
			}
		}
	}
	
	
	public boolean isConnected()
	{
		int start = 0, count = 0;
		boolean[] marked = new boolean[vertCount];
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(start);
		marked[start] = true;
		count++;
		while(!s.isEmpty())
		{
			int trav = s.pop();
			for(int dest=0; dest<vertCount; dest++)
			{
				if(adjmat[trav][dest]!=0 && !marked[dest])
				{
					s.push(dest);
					marked[dest]=true;
					count++;
					if(count==vertCount)
						return true;
				}
			}
		}
		return false;
	}
	
	
	public void dfsSpanningTree(int start)
	{
		boolean[] marked = new boolean[vertCount];
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(start);
		marked[start] = true;
		
		while(!s.isEmpty())
		{
			int trav = s.pop();
			for(int dest=0; dest<vertCount; dest++)
			{
				if(adjmat[trav][dest]!=0 && !marked[dest])
				{
					s.push(dest);
					marked[dest]=true;
					System.out.print(trav + " -> "+dest+"\n");
				}
			}
		}
	}
	
	public void bfsSpanningTree(int start)
	{
		boolean [] marked = new boolean[vertCount];
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		marked[start]=true;
		while(!q.isEmpty())
		{
			int trav = q.poll();
			for(int dest=0; dest<vertCount; dest++)
			{
				if(adjmat[trav][dest]!=0 && !marked[dest])
				{
					q.offer(dest);
					marked[dest]=true;
					
					System.out.print(trav+ " -> "+dest+"\n");
				}
			}
		}
	}
	
	public int[] singleSourceShortestPath(int start)
	{
		int[] dist = new int[vertCount];
		boolean [] marked = new boolean[vertCount];
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		marked[start]=true;
		dist[start]=0;
		while(!q.isEmpty())
		{
			int trav = q.poll();
			for(int dest=0; dest<vertCount; dest++)
			{
				if(adjmat[trav][dest]!=0 && !marked[dest])
				{
					q.offer(dest);
					marked[dest]=true;
					dist[dest]=dist[trav]+1;
				}
			}
		}
		return dist;
	}

}
