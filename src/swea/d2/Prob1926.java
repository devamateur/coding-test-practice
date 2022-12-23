package swea.d2;

import java.util.Scanner;

/* 1926. 간단한 369게임 */
public class Prob1926 {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			String result ="";
			int num=i;
			int newNum;
			int count = 0;
			
			while(num > 0) {
				
				newNum = num%10;	// 자릿수
				
				// 3, 6, 9가 들어가는 자릿수
				if(newNum != 0 && (newNum%3 == 0 || newNum%6 == 0 || newNum%9 == 0)) {
					count++;
				}

				num /= 10;
			}
			
			if(count > 0) {				// count가 0보다 크면
				while(count > 0) {
					result += "-";
					count--;
				}
			}

			else{					// 박수 치지 않는 경우에는 해당 숫자 출력
				result += i;
			}
			result += " ";
			
			System.out.print(result);
		}
		
		sc.close();
	}
}
