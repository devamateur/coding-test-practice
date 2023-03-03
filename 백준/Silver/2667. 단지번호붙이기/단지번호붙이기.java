import java.util.Arrays;
import java.util.Scanner;

/* 2667. 단지번호 붙이기 */
public class Main {
	static int N;
	static boolean[][] visited;
	static int[][] map;
	static int[] aparts;		// 단지 수를 저장하는 배열
	static int count=0;
	static int[] dx = {1, -1, 0, 0};		// 상하
	static int[] dy = {0, 0, 1, -1};		// 좌우
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		aparts = new int[N*N];
		visited = new boolean[N][N];
		map = new int[N][N];
		for(int i=0; i<N; i++) {
			String str = sc.next();
			for(int j=0; j<N; j++) {
				map[i][j] = str.charAt(j)-'0';
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					count++;
					dfs(i, j);
				}
			}
		}
		
		Arrays.sort(aparts);		// 단지수를 오름차순으로 정렬
		
		System.out.println(count);
		for(int i=0; i<aparts.length; i++) {
			if(aparts[i] == 0) {
				continue;
			}
			else {
				System.out.println(aparts[i]);
			}
		}
		
		sc.close();
	}
	static void dfs(int i, int j) {
		visited[i][j] = true;
		aparts[count] += 1;
		
		if(i == N-1 && j == N-1) {
			return;
		}
		else {
			for(int idx=0; idx<4; idx++) {
				int newX = i+dx[idx];
				int newY = j+dy[idx];
				
				if(newX >= 0 && newX < N && newY >= 0 && newY < N) {
					if(map[newX][newY] == 1 && !visited[newX][newY]) {
						dfs(newX, newY);
					}
				}
			}
		}
	}
}