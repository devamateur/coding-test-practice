import java.io.*;

/* 영화감독 슘 - 666이 들어간 숫자 */
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int count = 1;
		int badNum = 666;
		
		while(count < n) {
			badNum++;
			
			if(String.valueOf(badNum).contains("666")) {
				count++;
			}
		}
		bw.write(String.valueOf(badNum));
		
		br.close();
		bw.flush();
		bw.close();
	}
}