package undirected_graph_adjecency_matrix;

import java.util.Scanner;

public class WeightedGraphMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of vertices : ");
		int vertCount = sc.nextInt();
		
		WeightedGraph wg = new WeightedGraph(vertCount);
		wg.accept();
		System.out.println("Adjecent Matrix of Weighted Graph : ");
		wg.display();
		sc.close();

	}

}


/*
6
7
0 1 7
0 2 4
0 3 8
1 2 9
1 4 5
3 4 6
3 5 2
*/
