import java.util.Scanner;

/* 1343. 폴리오미노 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String answer = "";
		
		str = str.replaceAll("XXXX", "AAAA");		// 4개 단위로 X를 A로 바꿈 ex) XXXX -> AAAA, XXXXXXXX-> AAAAAAAA
		answer = str.replaceAll("XX", "BB");		// 나머지 X를 B로 바꿈
		if(answer.contains("X")) {		// 아직 X가 있다면 보드판을 덮을 수 없는 경우
			System.out.println(-1);
		}
		else {
			System.out.println(answer);
		}
		
		sc.close();
	}
}