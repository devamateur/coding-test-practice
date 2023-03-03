import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 11724. 연결 요소의 개수 */
public class Main {
	static List<Integer>[] edge;
	static boolean[] visited;
	static int answer=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		// 노드의 개수 
		int M = sc.nextInt();		// 간선의 개수
		
		edge = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for(int i=1; i<=N; i++) {
			edge[i] = new ArrayList<>();
		}
		
		for(int i=1; i<=M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			edge[a].add(b);
			edge[b].add(a);
		}
		
		for(int i=1; i<=N; i++) {
			Collections.sort(edge[i]);
		}
		
		for(int i=1; i<=N; i++) {
			if(!visited[i]) {
				// 방문하지 않은 점의 개수
				answer++;		// dfs()안에서 증가하면 재귀호출 때문에 더 큰 값이 나옴
				dfs(i);	
			}
		}		
		System.out.println(answer);
		
		sc.close();
	}
	static void dfs(int node) {
		visited[node] = true;

		for(int i: edge[node]) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(i);
			}
		}
	}
}