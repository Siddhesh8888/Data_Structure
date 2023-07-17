package bfs_dfs_graph_adjecency_matrix;

import java.util.Scanner;

public class NonWeightedGraphMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Vertices : ");
		int vertCount = sc.nextInt();
		NonWeightedGraph g = new NonWeightedGraph(vertCount);
		g.accept();
		System.out.println("Adjecency Matrix : ");
		g.display();
		System.out.println("BFS Traversal : ");
		g.bfsTraversal(0);
		System.out.println();
		System.out.println("DFS Traversal : ");
		g.dfsTraversal(0);
		System.out.println("\nIs connected : "+g.isConnected());
		System.out.println("\nDFS Spanning tree : ");
		g.dfsSpanningTree(0);
		System.out.println("\nBFS Spanning tree : ");
		g.bfsSpanningTree(0);
		System.out.println("\nSingle Source Path : ");
		int[] dest = g.singleSourceShortestPath(0);
		for(int i=0 ; i<dest.length; i++)
		{
			System.out.println("Distance of vertex "+i+" from vertex 0 = "+dest[i]);
		}

	}

}

/*
6
7
0 1
0 2
0 3
1 2
1 4
3 4
3 5 
*/
