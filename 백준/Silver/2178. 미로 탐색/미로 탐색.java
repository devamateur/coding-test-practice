import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* 2178. 미로 탐색 */
public class Main {
	static boolean[][] visited;
	static int[][] edge;
	static int[] dx = {-1, 1, 0, 0};		// 상하
	static int[] dy = {0, 0, -1, 1};		// 좌우
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		visited = new boolean[N][M];
		String[] str = new String[N];
		
		for(int i=0; i<N; i++) {
			str[i] = sc.next();
		}
		
		edge = new int[N][M];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				edge[i][j] = str[i].charAt(j)-'0';
			}
		}
		
		visited[0][0] = true;
		
		bfs(0, 0, N-1, M-1);
		
		System.out.println(edge[N-1][M-1]);
		
		sc.close();
	}
	static void bfs(int i, int j, int N, int M) {		
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {i, j});

		while(!q.isEmpty()) {
			int[] first = q.poll();
			int nowI = first[0];		// 현재 행
			int nowJ = first[1];		// 현재 열
			
			for(int k=0; k<4; k++) {
				int upDown = nowI + dx[k];		// 상하로 이동
				int leftRight = nowJ + dy[k];	// 좌우로 이동

				if(0<=upDown && upDown<=N && 0<=leftRight && leftRight<=M) {
					if(!visited[upDown][leftRight] && edge[upDown][leftRight] != 0) {
						q.add(new int[] {upDown, leftRight});
						edge[upDown][leftRight] = edge[nowI][nowJ] + 1;		// 다음 경로까지의 거리 = 현재 경로까지의 거리 + 1
						visited[upDown][leftRight] = true;
					}
				}
			}
		}
	}
}