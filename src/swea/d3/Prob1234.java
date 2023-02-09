package swea.d3;

import java.util.Scanner;
import java.util.Stack;

/* 1234. [S/W 문제해결 기본] 10일차 - 비밀번호 */
public class Prob1234 {
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++)
		{
			int n = sc.nextInt();
			
			String numbers = sc.next();

			Stack<Character> stack = new Stack<>();		// 캐릭터 스택

			for(int i=0; i<n; i++) {
				// 스택이 비어있거나(초기 상태), 스택의 top과 numbers의 숫자가 다를 경우 push
				if(stack.isEmpty() || stack.peek() != numbers.charAt(i)) {
					stack.push(numbers.charAt(i));
				}
				else {		// 스택 top과 numbers 숫자가 같으면 pop
					stack.pop();
				}
			}
			
			String result = "";
			while(!stack.isEmpty()) {
				result += stack.pop();
			}
			
			// 문자열 뒤집기
	        StringBuffer sb = new StringBuffer(result);
	        result = sb.reverse().toString();
			
			System.out.println("#"+tc+" "+result);
			
		}
		
		sc.close();
	}
}