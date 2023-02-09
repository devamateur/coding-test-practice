package swea.d3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/* 5948. 새샘이의 7-3-5 게임 */
public class Prob5948 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			int[] numbers = new int[7];
			
			for(int i=0; i<7; i++) {
				numbers[i] = sc.nextInt();
			}
			
			int sum=0;
			
			Set<Integer> set = new HashSet<>();		// 셋을 이용해 중복 제거
			
			for(int i=0; i<7; i++) {
				for(int j=i+1; j<7; j++) {
					for(int k=j+1; k<7; k++) {
						// 앞에서부터 3개 정수의 합을 구해 set에 저장
						sum = numbers[i] + numbers[j] + numbers[k];
						set.add(sum);
					}
				}
			}

			List<Integer> answer = new ArrayList<>(set);
			
			/** sum 리스트를 내림차순으로 정렬 **/
            Collections.sort(answer, Collections.reverseOrder());
			
			System.out.println("#"+tc+" "+answer.get(4));		// 5번째로 큰 sum 출력
		}
		
		sc.close();
	}
}