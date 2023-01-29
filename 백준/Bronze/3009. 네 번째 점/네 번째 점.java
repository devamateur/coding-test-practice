import java.util.Scanner;

/* 직사각형의 네 번째 점의 좌표를 구하는 문제 */
public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] point1 = {sc.nextInt(), sc.nextInt()};
		int[] point2 = {sc.nextInt(), sc.nextInt()};
		int[] point3 = {sc.nextInt(), sc.nextInt()};

		int returnX;
		int returnY;
		
		if(point1[0] == point2[0])
			returnX = point3[0];
		else if(point1[0] == point3[0])
			returnX = point2[0];
		else
			returnX = point1[0];
		
		if(point1[1] == point2[1])
			returnY = point3[1];
		else if(point1[1] == point3[1])
			returnY = point2[1];
		else
			returnY = point1[1];
		
		System.out.println(returnX + " " + returnY);
		sc.close();
	}
}