import java.util.Scanner;

/* 피타고라스의 정리 - 주어진 삼각형이 직각삼각형인지 구분 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if(a==0 && b==0 && c==0)
				break;
			if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a)
				System.out.println("right");
			else
				System.out.println("wrong");
		}
		sc.close();
	}
}