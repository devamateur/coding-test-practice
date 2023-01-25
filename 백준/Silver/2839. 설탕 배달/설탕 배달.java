import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int deliver = 0;
		
		br.close();
		
		while(n > 0) {
			if(n % 5 == 0) {				// 5로 나누어지는 경우
				n -= 5;
				deliver++;
			}
			else if(n % 3 == 0) {
				n -= 3;
				deliver++;
			}
			else if(n > 5) {
				n -= 5;
				deliver++;
			}
			else {
				deliver = -1;
				break;
			}
		}

		
		bw.write(String.valueOf(deliver));
		bw.flush();
		
	}
}