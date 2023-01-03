package swea.d2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 1983. 조교의 성적 매기기 */
public class Prob1983 {
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();		// 총 학생 수
			int K = sc.nextInt();  		// 학점을 알고 싶은 학생의 번호
			
			List<Float> result = new ArrayList<>();
			for(int i=0; i<N; i++) {
				int midScore = sc.nextInt();
				int finalScore = sc.nextInt();
				int assignScore = sc.nextInt();

				result.add((float) (midScore*0.35 + finalScore*0.45 + assignScore*0.2));
				
			}
			//Collections.sort(result);
			
			for(int i=0; i<N; i++) {
				System.out.println(result.get(i));
			}

		}
		
		sc.close();
	}
}
