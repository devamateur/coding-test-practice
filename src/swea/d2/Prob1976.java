package swea.d2;

import java.util.Scanner;

/* 1976. 시각 덧셈 - 입력받은 두 시각을 더한 결과를 출력 */
public class Prob1976 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		int resultH = 0, resultM=0;
		for(int tc = 1; tc <= T; tc++)
		{
			int hour1 = sc.nextInt();
			int minute1 = sc.nextInt();
			int hour2 = sc.nextInt();
			int minute2 = sc.nextInt();

			resultH=0; 
			resultM=0;
			
			resultH += (hour1+hour2)%12;
			resultM += (minute1+minute2)%60;
			
			// 60분을 넘어가면 시간에 1을 더함
			if(minute1+minute2 >= 60)
				resultH++;
			
			System.out.println("#"+tc+" "+resultH+" "+resultM);
		}
		sc.close();
	}
}
