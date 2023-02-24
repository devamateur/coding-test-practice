import java.io.*;

/* 재귀적 방법을 이용한 팩토리얼 구하기 */
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		bw.write(String.valueOf(getFactorials(n)));
		
		br.close();
		bw.close();
	}
	
	static int getFactorials(int n) {
		int facto = 0;
		if(n == 0)
			return 1;
		else
			return n * getFactorials(n-1);
	}
}