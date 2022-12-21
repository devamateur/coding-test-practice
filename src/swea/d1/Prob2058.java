package swea.d1;

import java.util.Scanner;

/* 2058. 자릿수 더하기 */
public class Prob2058 {
	public static void main(String args[]) throws Exception
	{
    	Scanner sc = new Scanner(System.in);
		
		int numbers = Integer.parseInt(sc.next());
			
		int sumOfNum = getDigitSum(numbers);
		
		System.out.println(sumOfNum);

    }
	
	// 각 자릿수의 합 리턴하는 메소드
	static int getDigitSum(int numbers) {
		int sumOfNum=0;			// 각 자릿수들의 합

		// 각 자릿수의 합을 구함
		while(numbers > 0) {
			sumOfNum += numbers % 10;		// 일의 자리부터 각 자릿수를 추출 ex) 1234 -> 4, 3, 2, 1 순서
			numbers = numbers/10;			// 다음 자릿수 추출을 위해 10으로 나눔
		}
		
		return sumOfNum;
	}
}
