package swea.d2;

import java.util.Scanner;

/* 1288. 새로운 불면증 치료법 - N의 배수 번째 양 세기 */
public class Prob1288 {
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int tc = 1; tc <= T; tc++)
		{
			String N = sc.next();

			int count = 0;
			int result = 0;
			int num=0;
			
			// N의 배수 번 양 세기
			for(int i=0; i<N.length(); i++) {
				int digit = Character.getNumericValue(N.charAt(i));
				for(int j=0; j<10; j++) {
					if(digit == j) {
						count++;
					}
				}

				if(count == 10)
					break;
				else {
					num++;
					result = Integer.parseInt(N)*num;
				}
			}
			
			System.out.println("#"+tc+" "+result);

		}
		sc.close();
	}
}
