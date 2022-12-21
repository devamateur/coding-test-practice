package swea.d2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 1859. 백만장자 프로젝트 */
public class Prob1859 {
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		List<Integer> list;
		for(int test_case = 1; test_case <= T; test_case++)
		{
			// 초기화
			int N = sc.nextInt();
			list = new ArrayList<>();
			
			for(int i=0; i<N; i++) {
				list.add(sc.nextInt());
			}
			
			// max index 찾기
			int maxIndex = 0;
			for(int j=0; j<N; j++) {
				if(list.get(maxIndex) < list.get(j))
					maxIndex = j;
			}
			
			int purchase = 0;
			int count = 0;
			int benefit = 0;
			for(int k=0; k<N; k++) {
				purchase += list.get(k);
				count++;
				if(k == maxIndex) {
					benefit = count*list.get(maxIndex) - purchase; 
				}
			}
			int result;
			if(benefit < 0)
				result = 0;
			else
				result = benefit;
			
			System.out.println("#"+test_case+" "+result);

		}
		
		sc.close();
	}
}
