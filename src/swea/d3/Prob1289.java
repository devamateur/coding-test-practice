package swea.d3;

import java.util.Scanner;

/* 1289. 원재의 메모리 복구하기 */
public class Prob1289 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();


		for(int tc = 1; tc <= T; tc++)
		{
			String target = sc.next();
			char[] init = new char[50];		// 초기 메모리 상태 (모든 bit이 0)
			
			for(int i=0; i<50; i++) {
				init[i] = '0';
			}
			
			int count=0;
			
			for(int i=0; i<target.length()-1; i++) {
				// 01이나 10처럼 앞뒤 숫자가 서로 다른 경우 count 증가
				if(target.charAt(i) != target.charAt(i+1))
					count++;
			}
			
			System.out.println("#"+tc+" "+count);
		}
		sc.close();
	}
}
