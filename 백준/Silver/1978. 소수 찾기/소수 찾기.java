import java.io.*;
import java.util.StringTokenizer;
// 소수의 개수를 출력
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		int result = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		for(int i=0; i<num.length; i++) {
			int count = 0;
			
			for(int j=1; j<=num[i]; j++) {
				if(num[i] % j == 0)
					count++;
			}
			if(count == 2)
				result++;
		}
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
}