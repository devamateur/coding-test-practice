package swea.d2;

import java.util.Scanner;

/* 2007. 패턴 마디의 길이 */
public class Prob2007 {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{
			String words = sc.next();
			int count=0;
			
			// 패턴 비교
			for(int i=1; i<=words.length(); i++) {
				String a = words.substring(0, i);		// 0, 0~1, 0~2, 0~3,...

				String b = words.substring(i, i+i);		// 1, 1~2, 1~3 ....
					
				if(a.equals(b)) {
					count++;
					break;
				}
				
			}
			System.out.println("#"+test_case+" "+count);
		}
		
		sc.close();
	}
}
