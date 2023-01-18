package swea.d3;

import java.util.Arrays;
import java.util.Scanner;

/* 1208. [S/W 문제해결 기본] 1일차 - Flatten */
public class Prob1208 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int[] boxes;
		for(int tc=1; tc<=10; tc++) {
			
			int dump = sc.nextInt();		// 덤프 횟수
			
			boxes = new int[100];
			for(int i=0; i<100; i++) {
				boxes[i] = sc.nextInt();
			}

			for(int i=0; i<dump; i++) {
				// 오름차순 정렬
				Arrays.sort(boxes);
				
				boxes[99]--;
				boxes[0]++;
			}
			Arrays.sort(boxes);
			
			System.out.println("#"+tc+" "+(boxes[99]-boxes[0]));
		}
		
		sc.close();
	}
}
