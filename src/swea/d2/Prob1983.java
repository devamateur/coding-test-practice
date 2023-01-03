package swea.d2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/* 1983. 조교의 성적 매기기 */
public class Prob1983 {
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		String[] score = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
		
		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();		// 총 학생 수
			int K = sc.nextInt();  		// 학점을 알고 싶은 학생의 번호
			
			Double[] result = new Double[N];
			double find = 0.0;
			for(int i=0; i<N; i++) {
				int midScore = sc.nextInt();
				int finalScore = sc.nextInt();
				int assignScore = sc.nextInt();

				result[i] = (Double) (midScore*0.35 + finalScore*0.45 + assignScore*0.2);
				
				if(i == K-1)
					find = result[i];
			}

			Arrays.sort(result, Collections.reverseOrder());		// 내림차순 정렬
			
			// 정렬된 후의 인덱스 찾아서 저장
			int findIndex = 0;
			for(int i=0; i<N; i++) {
				if(result[i] == find)
					findIndex = i;
			}
			
			// 평점은 같은 비율로 부여될 수 있음!   ex) N=40이면, findIndex/4이므로 0123번째 학생: A+, 4567: A- ...
			findIndex = findIndex / (N/10);
			System.out.println("#"+tc+" "+score[findIndex]);

		}
		
		sc.close();
	}
}
