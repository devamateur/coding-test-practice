import java.util.Scanner;

/* 2847. 게임을 만든 동준이
 * 각 게임의 레벨을 클리어할 때 얻는 점수가 N개 주어질 때
 * 점수가 오름차순이 되도록 하기 위해 점수를 감소시켜야 하는 최소 횟수 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] score = new int[N];
		for(int i=0; i<N; i++) {
			score[i] = sc.nextInt();
		}
		
		int count=0;
		for(int i=N-1; i>=1; i--) {		// 뒤에서부터 앞의 점수와 비교
			while(score[i-1] >= score[i]) {		// 앞의 점수가 뒤의 점수보다 크거나 같을 동안
				score[i-1]--;		// 점수를 계속 감소시키고 횟수 증가
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();

	}
}