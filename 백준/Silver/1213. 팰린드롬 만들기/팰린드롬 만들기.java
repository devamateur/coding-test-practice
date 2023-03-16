import java.util.Scanner;

/* 1213. 펠린드롬 만들기 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		
		int[] alphabet = new int[26];
		
		// 등장하는 알파벳의 개수를 count
		for(int i=0; i<name.length(); i++) {
			alphabet[name.charAt(i)-'A']++;
		}
		
		int odd=0;		// 홀수번 등장하는 알파벳을 count
		String result="";
		StringBuilder sb = new StringBuilder(result);

		for(int i=0; i<alphabet.length; i++) {
			if(alphabet[i]%2 == 1) {
				odd++;
			}
		}
		
		if(odd > 1) {		// 홀수인 알파벳이 여러개인 경우, 펠린드롬을 만들 수 없음
			result = "I'm Sorry Hansoo";
		}
		
		/* 펠린드롬을 만드는 방법
		 * 1. 문자열에서 각 알파벳의 개수를 센다 
		 * 2. 개수가 홀수인 알파벳이 여러 개일 경우 펠린드롬을 만들 수 없음
		 * 3. 개수가 홀수인 알파벳이 1개 or 0개라면 만들 수 있음
		 *    -> 각 알파벳 개수의 절반만큼 알파벳을 더함(front)
		 *    -> 홀수개인 알파벳을 한 번 더함(mid)
		 *    -> front를 reverse해서 더함(end)*/
		else {
			// 각 알파벳 개수/2개씩 더해줌  -> ex) AA -> A, AABB-> AB
			for(int i=0; i<alphabet.length; i++) {
				for(int j=0; j<alphabet[i]/2; j++) {
					sb.append((char)(i+65)+"");
				}
			}
			
			result += sb.toString();
			String reversed = sb.reverse().toString();
			
			sb = new StringBuilder();
			
			for(int i=0; i<alphabet.length; i++) {
				if(alphabet[i]%2 == 1) {
					sb.append((char)(i+65)+"");
				}
			}
			result += sb.toString() + reversed;
			
		}
		
		System.out.println(result);
		
		sc.close();

	}
}