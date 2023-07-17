package undirected_graph_adjecency_matrix;

import java.util.Scanner;

public class WeightedGraph {
	private static final int INF=999;
	private int vertCount;
	private int edgeCount;
	private int[][] adjmat;
	
	
	public WeightedGraph(int vertCount) {
		
		this.vertCount = vertCount;
		this.edgeCount = 0;
		this.adjmat = new int[vertCount][vertCount];
		for(int i=0; i<vertCount; i++)
		{
			for(int j=0; j<vertCount; j++)
			{
				adjmat[i][j]=INF;
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
			System.out.println("Enter edge (Source Destination Weight) : ");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int weight = sc.nextInt();
			adjmat[src][dest]=weight;
			adjmat[dest][src]=weight;
		}
		sc.close();
	}
	
	public void display()
	{
		for(int i=0; i<vertCount; i++)
		{
			for(int j=0; j<vertCount; j++)
			{
				if(adjmat[i][j]==999)
					System.out.print("x\t");
				else
					System.out.print(adjmat[i][j]+"\t");
			}
			System.out.println();
		}
	}

}


