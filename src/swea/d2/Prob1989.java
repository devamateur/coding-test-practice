package swea.d2;

import java.util.Scanner;

/* 1989. 초심자의 회문 검사 */
public class Prob1989 {
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		int result = 0;
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String words = sc.next();
			
			int n = words.length();
			
			String a = words.substring(0, n/2);
			String b = words.substring(n/2 + 1, n);
			
	        // reverse
	        StringBuffer sb = new StringBuffer(b);
	        String reverseB = sb.reverse().toString();			// 문자열 뒤집기

			
			if(a.equals(reverseB))
				result = 1;
			
			else 
				result = 0;
			System.out.println("#"+test_case+" "+result);
		}
		
		sc.close();
	}
}
