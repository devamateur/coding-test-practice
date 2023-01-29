import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = num2;
		
		br.close();

		
		for(int i=num1; i<=num2; i++) {
			int count = 0;
			
			for(int j=2; j<i; j++) {
				if(i % j == 0) {		// 소수가 아닌 경우 카운트 증가
					count++;
				}

			}	
			if(count == 0 && i != 1) {
				sum += i;
				if(i < min) {
					min = i;
				}
			}

		}
		
		if(sum == 0) {
			bw.write(String.valueOf("-1"));

		}
		else {
			bw.write(String.valueOf(sum) + "\n");
			bw.write(String.valueOf(min));
		}
		bw.flush();
		bw.close();
	}
}