import java.util.Scanner;

/* 25501. 재귀의 귀재 */
// 재귀를 이용해 palindrome(회문) 여부를 구하는 문제
public class Main {
	static int count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++){
			String s = sc.next();
			
			count=0;
			System.out.println(isPalindrome(s)+" "+count);
		}
		
		sc.close();
	}
	
	// left와 right의 문자가 같으면 left+1, right-1해서 다시 문자 비교
	// left와 right이 다르면 return 0
	// left >= right이 되면 모든 left와 right이 서로 같은 것이므로 palindrome -> return 1
	static int recursion(String s, int left, int right) {
		count++;

		if(left >= right) {
			return 1;
		}
		else if(s.charAt(left) != s.charAt(right))	{
			return 0;
		}
		else {
			return recursion(s, left+1, right-1);
		}
	}
	
	static int isPalindrome(String s) {
		return recursion(s, 0, s.length()-1);
	}
}