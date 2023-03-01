import java.util.Scanner;

/* 1439. 뒤집기 */
// 0과 1로 이루어진 문자열을 뒤집어서 모든 수를 같게 만드는 최소 횟수 구하기
// ex) 0001100 -> 11을 뒤집으면 1번만에 0000000이 됨
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int count1=0, count2=0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<str.length()-1; i++) {
            // 01인 경우
			if(str.charAt(i) == '0' && str.charAt(i+1) == '1') {
				count1++;
			}
            // 10인 경우
			else if(str.charAt(i) == '1' && str.charAt(i+1) == '0') {
				count2++;
			}
            // 둘 중 최대
            // ex) 10000000은 01인 경우에서 count되지 않으므로
			max = Math.max(count1, count2);
		}
		
		System.out.println(max);
		
		sc.close();
	}
}