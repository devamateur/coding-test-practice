package swea.d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 1288. 새로운 불면증 치료법 - N의 배수 번째 양 세기 */
public class Prob1288 {
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());


		for(int tc = 1; tc <= T; tc++)
		{
			String N = br.readLine();
			int intN = Integer.parseInt(N);
			
			int num=1;			// N배
			
			int count = 0;		// 0부터 9까지 count
			boolean[] numbers = new boolean[10];

			// N의 배수 번 양 세기
			while(true) {
				for(int i=0; i<N.length(); i++) {
					int digit = Integer.parseInt(N.substring(i, i+1));

					if(numbers[digit] == false) {
						numbers[digit] = true;
						count++;
					}
				}
				if(count == 10) break;
				else {
					num++;
					N = Integer.toString(num*intN);
				}
			}

			System.out.println("#"+tc+" "+N);

		}
		br.close();
	}
}
