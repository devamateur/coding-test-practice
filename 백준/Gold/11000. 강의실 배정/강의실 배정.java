import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/* 11000. 강의실 배정 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] classes = new int[N][2];		// 수업 시작 시간 - 종료 시간
		for(int i=0; i<N; i++) {
			classes[i][0] = sc.nextInt();
			classes[i][1] = sc.nextInt();
		}
		
		// 강의 시작 시간을 기준으로 오름차순 정렬
		Arrays.sort(classes, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0] - o2[0];
			}
				
		});
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(classes[0][1]);
		for(int i=1; i<N; i++) {
			if(pq.peek() > classes[i][0]) {
				pq.add(classes[i][1]);
			}
			else {
				pq.poll();
				pq.add(classes[i][1]);
			}
		}
		
		System.out.println(pq.size());
		
		sc.close();
	}
}