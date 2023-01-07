package swea.d2;

import java.util.Scanner;

public class Prob1948 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int[] lastDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int tc=1; tc<=T; tc++) {
			int firstMonth = sc.nextInt();
			int firstDay = sc.nextInt();

			int secondMonth = sc.nextInt();
			int secondDay = sc.nextInt();

			int result=0;

			// 월이 같은 경우
			if(firstMonth == secondMonth) {
				result = secondDay - firstDay + 1;
			}
			else {
				result += lastDays[firstMonth-1]-firstDay;
				for(int i=firstMonth; i<secondMonth-1; i++) {
					result += lastDays[i];
				}
				result += secondDay+1;
			}

			System.out.println("#"+tc+" "+result);

		}

		sc.close();
	}
}