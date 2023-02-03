package swea.d3;

import java.util.Scanner;

/* 1225. [S/W 문제해결 기본] 7일차 - 암호생성기 */
public class Prob1225 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		for(int tc=1; tc<=10; tc++) {
			int T = sc.nextInt();

			int[] numbers = new int[8];
			for(int i=0; i<8; i++) {
				numbers[i] = sc.nextInt();
			}

			int count=1;
			while(true) {
				int front = numbers[0];		
				
				front -= count;
				if(front <= 0) {
					for(int i=1; i<8; i++) {
						numbers[i-1] = numbers[i];
					}
					numbers[7] = 0;		
					break;
				}
				
				for(int i=1; i<8; i++) {
					numbers[i-1] = numbers[i];
				}
				
				numbers[7] = front;
				count++;
				if(count == 6) {
					count=1;
				}
			}
			
			System.out.print("#"+tc+" ");
			for(int i=0; i<8; i++) {
				System.out.print(numbers[i]+" ");
			}System.out.println();

		}
		
		sc.close();
	}

}
