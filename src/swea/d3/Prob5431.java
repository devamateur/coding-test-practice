package swea.d3;

import java.util.Scanner;

/* 5431. 민석이의 과제 체크하기 */
public class Prob5431 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();	// 수강생
			int K = sc.nextInt();	// 과제를 제출한 사람
			
			boolean[] submit = new boolean[N+1];		// 과제 제출 여부
			for(int i=1; i<=K; i++) {
				int students = sc.nextInt();
				
				submit[students] = true;				
			}
			
			String result="";
			for(int i=1; i<=N; i++) {
				if(!submit[i]) {			// 과제 제출하지 않은 학생
					result += i+" ";
				}
			}
			System.out.println("#"+tc+" "+result);
		}
		
		sc.close();
	}
}
