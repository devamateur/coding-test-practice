import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//int count = 0;
		
		for(int i=0; i<n; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			// 중심의 거리의 제곱
			int dist = Math.abs(x2-x1)*Math.abs(x2-x1) + Math.abs(y2-y1)*Math.abs(y2-y1);
			
			if(dist == 0) {			// 두 원의 중심이 같으면
				if(r1 == r2)
					System.out.print(-1);
				else
					System.out.print(0);
			}
				
			else if(dist < Math.pow(r1+r2, 2) && dist > Math.pow(r2-r1, 2))
				System.out.print(2);
			else if(dist == Math.pow(r1+r2, 2) || (dist == Math.pow(r2-r1, 2))) 
				System.out.print(1);
			else if(dist < Math.pow(r2-r1, 2) || dist > Math.pow(r1+r2, 2))
				System.out.print(0);

			System.out.println();
		}
		sc.close();
	}
}