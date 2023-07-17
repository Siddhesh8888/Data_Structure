package undirected_graph_adjecency_list;

import java.util.Scanner;

public class AdjListNonWeightedGraphMain {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Vertices : ");
		int vertCount = sc.nextInt();
		
		AdjListNonWeightedGraph g = new AdjListNonWeightedGraph(vertCount);
		g.accept();
		g.display();
		sc.close();

	}

}
