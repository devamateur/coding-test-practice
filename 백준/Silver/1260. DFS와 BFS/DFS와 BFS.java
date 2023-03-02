import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/* 1260. DFS와 BFS */
public class Main {
	static boolean[] visited;
	static boolean[] visited2;
	static List<Integer>[] edge;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		// 정점 개수
		
		visited = new boolean[N+1];
		visited2 = new boolean[N+1];
		int M = sc.nextInt();		// 간선 개수
		int V = sc.nextInt();		// 시작 노드
		
		edge = new ArrayList[N+1];
		
		for(int i=1; i<=N; i++){
		    edge[i] = new ArrayList<>();
		}
		
		for(int i=1; i<=M; i++) {
			int x = sc.nextInt();		// 시작 노드
			int y = sc.nextInt();		// 연결된 노드
			
			// 각 노드와 연결된 노드 저장
			edge[x].add(y);		
			edge[y].add(x);
		}
		
		// 연결된 노드들 정렬
		for(int i=1; i<=N; i++) {
			Collections.sort(edge[i]);
		}
		
		dfs(V);
		System.out.println();
		bfs(V);
		sc.close();

	}
	static void dfs(int V) {
		visited[V] = true;		// 노드 방문
		System.out.print(V +" ");
		
		// 해당 노드와 연결된 노드를 방문
		for(int i: edge[V]) {			// 노드와 연결된 노드에 대해서만	
			if(!visited[i]) {
				dfs(i);
			}
		}

	}
	
	// bfs는 큐로 구현
	static void bfs(int V) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(V);		// 큐에 맨 처음 노드 넣기
		visited2[V] = true;
		
		while(!q.isEmpty()) {
			int node=q.poll();
			System.out.print(node+" ");
			
			for(int i: edge[node]) {
				if(!visited2[i]) {
					q.offer(i);
					visited2[i] = true;
				}
			}
		}
	}
}