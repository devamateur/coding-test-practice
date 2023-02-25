import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/* 1931. 회의실 배정 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] meetings = new int[N][2];
		for(int i=0; i<N; i++) {
			meetings[i][0] = sc.nextInt();		// 시작 시간
			meetings[i][1] = sc.nextInt();		// 끝나는 시간
		}
		

		Arrays.sort(meetings, new Comparator<int[]> () {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {		// 종료 시간이 같을 경우 시작 간이 빠른 순으로 정렬
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];		// 종료 시간에 대해 정렬
			}
		});
		
		int count=0;
		int prev=0;		// 이전 종료 시간 저장
		for(int i=0; i<N; i++) {
			if(prev <= meetings[i][0]) {
				prev = meetings[i][1];
				count++;
			}
		}
		System.out.println(count);
		
		sc.close();
	}
}