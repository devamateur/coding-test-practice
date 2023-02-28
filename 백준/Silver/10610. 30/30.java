import java.util.Arrays;
import java.util.Scanner;

/* 10610. 30*/
// 주어진 수의 자리를 바꿔 30의 배수로 만드는 문제
public class Main {

	public static void main(String[] args) throws NumberFormatException{
		Scanner sc = new Scanner(System.in);
		
		String N = sc.nextLine();
		
		char[] num = N.toCharArray();
		
		Arrays.sort(num);		//	오름차순 정렬
		
		StringBuilder sb = new StringBuilder();	
		
		// 큰 순으로 저장 ex) 012 -> 210
		int sum=0;
		for(int i=num.length-1; i>=0; i--) {
			int number = num[i]-'0';
			sum += number;
			sb.append(number);
		}		
		// 각 자리수의 합이 3의 배수이고 맨 오른쪽이 0일 때 30의 배수
		if(sum % 3 == 0 && num[0] == '0') {
			System.out.println(sb.toString());
		}
		else {
			System.out.println(-1);
		}
		
		sc.close();
	}
}