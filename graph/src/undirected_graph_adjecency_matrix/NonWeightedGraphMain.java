package undirected_graph_adjecency_matrix;

import java.util.Scanner;

public class NonWeightedGraphMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Vertices : ");
		int vertCount = sc.nextInt();
		
		NonWeightedGraph g = new NonWeightedGraph(vertCount);
		g.accept();
		System.out.println("Adjecent Matrix : ");
		g.display();
		sc.close();

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
