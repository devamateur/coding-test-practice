import java.util.Scanner;

/* 1541. 잃어버린 괄호 */
// 식의 적절한 곳에 괄호를 쳐서 최소를 만드는 문제
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		// -를 기준으로 문자열 분리
		String[] subs = str.split("-");
				
		int sum=0;
		int result=Integer.MAX_VALUE;
		for(int i=0; i<subs.length; i++) {

			// +를 기준으로 문자열 분리, 즉 숫자만 추출
			String[] numbers = subs[i].split("\\+");
			
			sum=0;
			for(int j=0; j<numbers.length; j++) {
				// 분리된 수들을 더함
				sum += Integer.parseInt(numbers[j]);
			}
			
			// 첫 원소값을 result에 저장
			if(result == Integer.MAX_VALUE) {
				result = sum;
			}
			else {			// 더해진 값들을 빼줌
				result -= sum;
			}
		}
		
		System.out.println(result);
			
		sc.close();
	}
}