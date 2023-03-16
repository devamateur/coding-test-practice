import java.util.Scanner;

/* 2864. 5와 6의 차이 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = Integer.toString(sc.nextInt());
		String b = Integer.toString(sc.nextInt());

		int max=0, min=0;
		
		max = Integer.parseInt(a.replace('5', '6'))+Integer.parseInt(b.replace('5', '6'));		// max는 5를 6으로 바꿔 더함
		min = Integer.parseInt(a.replace('6', '5'))+Integer.parseInt(b.replace('6', '5'));		// min은 6을 5로 바꿔 더함
		
		System.out.println(min+" "+max);
	
		sc.close();
	}
}