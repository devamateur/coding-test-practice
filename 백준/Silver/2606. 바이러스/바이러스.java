import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 2606. 바이러스 */
public class Main {
	static List<Integer>[] edge;
	static boolean[] visited;
	static int N, M;
	static int answer=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();		// 노드 수
		M = sc.nextInt();		// 간선 수
		
		visited = new boolean[N+1];
		edge = new ArrayList[N+1];
		
		for(int i=1; i<=N; i++) {
			edge[i] = new ArrayList<>();
		}
		
		for(int i=1; i<=M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
				
			edge[x].add(y);
			edge[y].add(x);
		}

		dfs(1);
		System.out.println(answer);
		sc.close();
	}
	static void dfs(int node) {
		visited[node] = true;
		if(node != 1) {		// 노드가 1인 경우는 제외, 1과 연결된 노드를 카운트하므로
			answer++;
		}
		
		for(int i: edge[node]) {
			if(!visited[i]) {
				dfs(i);
			}
		}
	}
}