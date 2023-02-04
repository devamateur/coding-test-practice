package swea.d3;

import java.util.Scanner;

/* 1213. [S/W 문제해결 기본] 3일차 - String */
public class Prob1213 {
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);

		for(int tc = 1; tc <= 10; tc++)
		{
			int N = sc.nextInt();
			
			String pattern = sc.next();
			String input = sc.next();

			int count=0;
			for(int i=0; i<input.length()-pattern.length()+1; i++) {
				String findString = input.substring(i, i+pattern.length());
				
				if(findString.equals(pattern)) {
					count++;
				}	
			}
			System.out.println("#"+tc+" " +count);
		}
		sc.close();
	}
}
