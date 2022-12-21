package swea.d1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 2068. 최대수 구하기 */
public class Prob2068 {
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		List<Integer> list;

		for(int test_case = 1; test_case <= T; test_case++)
		{	
			list = new ArrayList<>();
			for(int i=0; i<10; i++) {
				list.add(sc.nextInt());
			}
			
			Collections.sort(list);			// 리스트 정렬
			System.out.println("#"+test_case+" "+list.get(list.size()-1));
		}
	}
}
