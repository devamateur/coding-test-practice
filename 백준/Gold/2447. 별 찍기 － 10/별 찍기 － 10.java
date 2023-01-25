import java.io.*;

/* 분할 정복을 이용한 별 찍기 */
public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				makeStar(i, j, n);
			}
			bw.write("\n");
		}
		br.close();
		bw.close();
	}
	
	static void makeStar(int i, int j, int n) throws IOException{
		if((i/n)%3 == 1 && (j/n)%3 == 1) {
			bw.write(" ");
		}
		else {
			if(n/3 == 0)
				bw.write("*");
			else
				makeStar(i, j, n/3);		// n/3 크기로 분할
		}
	}
}