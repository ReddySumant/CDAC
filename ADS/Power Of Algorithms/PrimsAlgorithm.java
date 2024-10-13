import java.util.*;

public class PrimsAlgorithm{
	public static int minWeight(int weight[], Boolean visited[]){
		int V= weight.length;
		int min = Integer.MAX_VALUE;
		int minIndex = -1;
		
		for(int v = 0; v<V; v++){
			if(visited[v] == false && weight[v] < min){
				min = weight[v];
				minIndex = v;
			}
		}
		return minIndex;
	}
	
	public static void prim(int adjMat[][]){
		int V = adjMat.length;
		int parent[] = new int[V];
		int weight[] = new int[V];
		Boolean visited[] = new Boolean[V];
		
		for(int i=0; i<V; i++){
			weight[i] = Integer.MAX_VALUE;
			visited[i] = false;
			parent[i] = -1;
		}
		
		/*
		index ->    0	1	2	3	4	5
		
		parent ->  -1   0   1   1   3   4
		weight ->	0	2   3	1   2   1
		visited ->  t   t   f   t   f   f
		*/
		
		weight[0] = 0;
		
		for(int i=0; i<V-1; i++){
			int u = minWeight(weight, visited);
			visited[u] = true;
			
			for(int v=0; v<V; v++){
				if(adjMat[u][v] !=0 && visited[v] == false && adjMat[u][v] < weight[v]){
					parent[v] = u;
					weight[v] = adjMat[u][v];
				}
			}
		}
		printMST(parent, adjMat);
	}
	
	public static void printMST(int parent[], int adjMat[][]){
		int v = adjMat.length;
		//System.out.println(v);
		for(int i=1; i<v; i++){
			System.out.println(parent[i] + "-" + i + "-->" + adjMat[i][parent[i]]);
		}
	}
	
	public static void main(String args[]){
        int adjMat[][] = new int[][] {{0, 2, 0, 4, 0, 0},
                                      {2, 0, 3, 1, 0, 0},
                                      {0, 3, 0, 0, 0, 4},
                                      {4, 1, 0, 0, 2, 0},
                                      {0, 0, 0, 2, 0, 1},
									  {0, 0, 4, 0, 1, 0}
									};
		prim(adjMat);
	}
}