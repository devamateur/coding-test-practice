import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 2644. 촌수계산 */
// 주어진 두 사람의 촌수 계산하기
public class Main {
	static List<Integer>[] edge;
	static boolean[] visited;
	static int count;
	static int X, Y;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		// 전체 사람의 수
		
		// 촌수를 계산해야 하는 두 사람
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		visited = new boolean[N+1];
		int M = sc.nextInt();		// 관계의 개수
		
		// 사람들 간 관계
		edge = new ArrayList[N+1];
		
		for(int i=1; i<=N; i++) {
			edge[i] = new ArrayList<>();
		}
		
		for(int i=1; i<=M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			edge[a].add(b);
			edge[b].add(a);
		}
		
		for(int i=1; i<=M; i++) {
			Collections.sort(edge[i]);
		}
		
		count=0;
		dfs(X, Y, 0);
		
		if(count == 0) {
			count = -1;
		}
		System.out.println(count);
		
		sc.close();
	}
	static void dfs(int start, int end, int depth) {
		visited[start] = true;
		if(start == end) {
			count = depth;
			return;
		}
		
		for(int i: edge[start]) {
			if(!visited[i]) {
				dfs(i, end, depth+1);
			}
		}
	}
}