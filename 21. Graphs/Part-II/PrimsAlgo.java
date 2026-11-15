import java.lang.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class PrimsAlgo {

	static class Edge {
		int src;
		int dest;
		int wt;
	
		public Edge(int src,int dest, int wt) {
			this.src = src;
			this.dest = dest;
			this.wt = wt;
		}
	}

	static void createGraph(ArrayList<Edge> [] graph) {
		
		for(int i=0;i<graph.length;i++) {
			graph[i] = new ArrayList<>();
		}
		
		graph[0].add(new Edge(0,1,10));
		graph[0].add(new Edge(0,2,15));
		graph[0].add(new Edge(0,3,30));
		
		graph[1].add(new Edge(1,3,40));

		graph[2].add(new Edge(2,3,50));

		graph[3].add(new Edge(3,0,30));
		graph[3].add(new Edge(3,1,40));
		graph[3].add(new Edge(3,2,50));
		
	}

	static class Pair implements Comparable<Pair> {
		int v;
		int c;
		public Pair(int v,int c) {
			this.v = v;
			this.c = c;
		}

		@Override
		public int compareTo(Pair p2) {
			return this.c - p2.c;
		}
	}

	public static void prims(ArrayList<Edge>[] graph) {
		boolean[] vis = new boolean[graph.length];
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		pq.add(new Pair(0,0));
		int finalCost = 0;

		while(!pq.isEmpty()) {
			Pair curr = pq.remove();
			if(!vis[curr.v]) {
				vis[curr.v] = true;
				finalCost += curr.c;
		
				for(int i=0;i < graph[curr.v].size();i++) {
					Edge e = graph[curr.v].get(i);
					pq.add(new Pair(e.dest,e.wt));
				}
			}
		}
		System.out.println(finalCost);
	}

	public static void main(String [] args) {
		int V = 5;
		ArrayList<Edge>[] graph = new ArrayList[V];
		createGraph(graph);
		prims(graph);
	}

}