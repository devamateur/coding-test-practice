import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		int[] numbers = new int[s.length()];
		int num = Integer.parseInt(s);
		
		for(int i=0; i<s.length(); i++) {
			numbers[i] = num % 10;		// 1의 자리부터 차례대로 numbers에 저장
			num /= 10;
		}
		
		Arrays.sort(numbers);
		
		for(int i=s.length()-1; i>=0; i--)
			bw.write(String.valueOf(numbers[i]));
		
		br.close();
		bw.flush();
		bw.close();
	}
}