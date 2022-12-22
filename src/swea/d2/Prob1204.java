package swea.d2;


import java.util.Scanner;


/* 1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기 */
public class Prob1204 {

	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		int[] count;
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int num = sc.nextInt();		// 테스트 케이스 번호
			
			
			// 학생 점수 카운트
			count = new int[101];			
			
			int maxCount=0;
			for(int i=0; i<1000; i++) {
				int score = sc.nextInt();
				
				count[score]++;		// 점수에 해당하는 인덱스 증가
				if(maxCount < count[score])
					maxCount = count[score];
			}
			
			// 최빈값
			int mode = -1;
			for(int i=0; i<101; i++) {
				if(maxCount == count[i])
					mode = i;
			}

			System.out.println("#"+test_case+" "+mode);
		}
		
		sc.close();
	}
}
