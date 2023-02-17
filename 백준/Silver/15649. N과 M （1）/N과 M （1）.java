import java.util.Scanner;

public class Main{
	// N, M 크기의 최대가 8이므로 result 크기는 9
	static int[] result = new int[9];
	static boolean[] visited = new boolean[9];		// 방문 여부
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		dfs(N, M, 0);
		
		sc.close();
	}
	
	static void dfs(int N, int M, int count) {
		if(count == M) {
			for(int i=0; i<M; i++) {
				System.out.print(result[i]+" ");
			}System.out.println();
		}
		else {
			for(int i=0; i<N; i++) {
				if(!visited[i]) {
					visited[i] = true;
					result[count] = i+1;
					dfs(N, M, count+1);
					visited[i] = false;		// 자식 노드 방문이 끝나고 돌아오면 노드를 방문하지 않은 상태로 변경
				}
			}
		}
	}
}