package swea.d1;

/* 2027. 대각선 출력하기 */
public class Prob2027 {
	public static void main(String args[]) throws Exception {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i==j)
					System.out.print("#");
				else
					System.out.print("+");
			}
			System.out.println();
		}
	}
}
