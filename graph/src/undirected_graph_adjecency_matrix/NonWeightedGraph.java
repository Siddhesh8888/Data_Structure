package undirected_graph_adjecency_matrix;

import java.util.Scanner;

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
		
		for(int i=0; i<edgeCount; i++)
		{
			System.out.println("Enter edge (source destination) : ");
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

}
