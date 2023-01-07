package swea.d2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 1984. 중간 평균값 구하기 - 최소, 최대를 제외하고 평균 구하기 */
public class Prob1984 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		double sum=0;
		int count=0;
		List<Integer> numbers;
		
		for(int tc=1; tc<=T; tc++) {
			numbers  = new ArrayList<>();
			
			for(int i=0; i<10; i++) {
				numbers.add(sc.nextInt());
			}
			Collections.sort(numbers);		// 오름차순으로 정렬

			
			for(int i=0; i<10; i++) {
				sum=0;
				count=0;
				
				// 최소, 최대 제외하고 평균 구하기
				for(int j=1; j<9; j++) {
					sum += numbers.get(j);
					count++;
				}
			}

			System.out.println("#"+tc+" "+(Math.round(sum/count)));
		}
		
		sc.close();
	}
}
