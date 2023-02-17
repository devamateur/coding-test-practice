import java.util.Scanner;

public class Main {
	static int N;
	static int[][] input;
	static boolean[] visited;
	static int result = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		input = new int[N][N];
		visited = new boolean[N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				input[i][j] = sc.nextInt();
			}
		}
	
		sc.close();
		
		dfs(0, 0);
		
		System.out.println(result);
	}
	
	static void dfs(int index, int count) {
		if(count == N/2) {		// 인원이 절반이 된 경우
			returnMinGap();
			return;
		}
		// 인원이 N/2보다 작은 경우
		for(int i=index; i<N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(i+1, count+1);
				visited[i] = false;
			}
		}
	}
	
	static void returnMinGap() {
		int start = 0;
		int link = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				if(visited[i] && visited[j]) {
					start += input[i][j];
					start += input[j][i];
				}
				if(!visited[i] && !visited[j]) {
					link += input[i][j];
					link += input[j][i];
				}
			}
		}
		result = Math.min(result, Math.abs(start-link));
	}
}