import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] numbers = new int[n];

		for(int i=0; i<n; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		
		int temp = 0;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(numbers[j] > numbers[j+1]) {
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		
		for(int num : numbers)
			bw.write(String.valueOf(num) + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
}