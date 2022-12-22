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
			while(true) {
				
				int newNum = num%10;
				if(newNum == 3 || newNum == 6 || newNum == 9) {
					result += "-";
				}
				else{
					result += num;
				}
				newNum /= 10;
				
				if(newNum <= 0)
					break;
			}

			System.out.print(result+" ");
		}
		
		sc.close();
	}
}
