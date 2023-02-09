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
			
			Set<Integer> set = new HashSet<>();
			
			for(int i=0; i<7; i++) {
				for(int j=i+1; j<7; j++) {
					for(int k=j+1; k<7; k++) {
						sum = numbers[i] + numbers[j] + numbers[k];
						set.add(sum);
					}
				}
			}

			List<Integer> answer = new ArrayList<>(set);

            Collections.sort(answer, Collections.reverseOrder());
			
			System.out.println("#"+tc+" "+answer.get(4));
		}
		
		sc.close();
	}
}