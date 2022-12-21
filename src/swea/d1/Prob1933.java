package swea.d1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 1933. N의 약수 */
public class Prob1933 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> divisors = new ArrayList<>();		// 약수
		
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {		// 나머지가 0이면 약수
				divisors.add(i);
			}
		}

		for(Integer divisor: divisors) {
			System.out.print(divisor+" ");
		}
	}
}
