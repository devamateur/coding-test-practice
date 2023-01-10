package swea.d2;

import java.util.Scanner;

public class Prob1940 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();

			int accel=0;			// 가속도
			int distance=0;			// 이동거리
			for(int i=0; i<N; i++) {
				int command = sc.nextInt();		// 명령(0, 1, 2)

				if(command == 1) {		// 1일 경우 가속
					accel += sc.nextInt();
				}
				else if(command == 2) {	// 2일 경우 감속
					accel -= sc.nextInt();
				}

				if(accel < 0)			
					accel = 0;
				distance += accel;		// 이동거리는 가속 및 감속의 누적합

			}
			System.out.println("#"+tc+" "+distance);
		}
		
		sc.close();
	}
}
