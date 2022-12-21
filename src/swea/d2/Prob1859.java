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

        	int max = list.get(N-1);

        	// result long타입 주의 - 주어진 테스트 케이스 중 계산하면 int 범위를 넘어가는 경우가 있음
			long result = 0;
			
			/** 뒤에서부터 **/
            for(int i=N-2; i>=0; i--) {
                if(max > list.get(i)) {
                    result += max-list.get(i);		// max와 매매가의 차이
                } else {
                    max = list.get(i);
                }
            }
			
			System.out.println("#"+test_case+" "+result);

		}
		
		sc.close();
	}
}
